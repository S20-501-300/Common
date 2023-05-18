import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public interface MyComparator<T> {
    int compare(T a, T b); //Сравнивает два своих аргумента для определения порядка.

    //Принимает функцию, которая извлекает ключ сортировки Comparable из типа T и возвращает Comparator, который сравнивает по этому ключу сортировки.
    static <T, U extends Comparable<? super U>> MyComparator<T> comparing(Function<? super T, ? extends U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (MyComparator<T>) (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
    }

    //Принимает функцию, извлекающую ключ сортировки из типа T, и возвращает Компаратор, который сравнивает по этому ключу сортировки, используя указанный Компаратор.
    static <T,U> MyComparator<T> comparing(Function<? super T,? extends U> keyExtractor, MyComparator<? super U> keyComparator){
        Objects.requireNonNull(keyComparator);
        Objects.requireNonNull(keyExtractor);
        return (MyComparator<T>) (c1, c2) -> keyComparator.compare(keyExtractor.apply(c1), keyExtractor.apply(c2));
    }

    //Принимает функцию, которая извлекает ключ сортировки double из типа T и возвращает Comparator, который сравнивает по этому ключу сортировки.
    static <T> MyComparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor){
        Objects.requireNonNull(keyExtractor);
        return (MyComparator<T>) (c1, c2) -> Double.compare(keyExtractor.applyAsDouble(c1), keyExtractor.applyAsDouble(c2));
    }

    //Принимает функцию, которая извлекает ключ сортировки int из типа T и возвращает Comparator, который сравнивает по этому ключу сортировки.
    static <T> MyComparator<T> comparingInt(ToIntFunction<? super T> keyExtractor){
        Objects.requireNonNull(keyExtractor);
        return (MyComparator<T>) (c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
    }

    //Принимает функцию, которая извлекает ключ сортировки long из типа T и возвращает Comparator, который сравнивает по этому ключу сортировки.
    static <T> MyComparator<T> comparingLong(ToLongFunction<? super T> keyExtractor){
        Objects.requireNonNull(keyExtractor);
        return (MyComparator<T>) (c1, c2) -> Long.compare(keyExtractor.applyAsLong(c1), keyExtractor.applyAsLong(c2));
    }

    //Возвращает компаратор, который сравнивает объекты Comparable в естественном порядке.
    static <T extends Comparable<? super T>> MyComparator<T> naturalOrder(){
        return (MyComparator<T>) (c1, c2) -> c1.compareTo(c2);
    }

    //Возвращает дружественный к нулю компаратор, который считает, что значение null меньше, чем ненулевое значение.
    static <T> MyComparator<T> nullsFirst(MyComparator<? super T> comparator){
        return (c1, c2) -> {
            if(c1 == null) return -1;
            if(c2 == null) return 1;
            return comparator.compare(c1, c2);
        };
    }

    //Возвращает дружественный к нулю компаратор, который считает, что значение null больше, чем ненулевое значение.
    static <T> MyComparator<T> nullsLast(MyComparator<? super T> comparator){
        return (c1, c2) -> {
            if(c1 == null) return 1;
            if(c2 == null) return -1;
            return comparator.compare(c1, c2);
        };
    }

    //Возвращает компаратор, который накладывает обратный порядок этого компаратора.
    default MyComparator<T> reversed(){
        return (c1, c2) -> compare(c2, c1);
    }

    //Возвращает компаратор, который устанавливает обратный естественный порядок.
    static <T extends Comparable<? super T>> MyComparator<T> reverseOrder(){
        return (c1, c2) -> c2.compareTo(c1);
    }

    //Возвращает компаратор лексикографического порядка с другим компаратором.
    default MyComparator<T> thenComparing(Comparator<? super T> other){
        return (c1, c2) -> {
            int res = compare(c1, c2);
            if(res == 0){
                return other.compare(c1,c2);
            } else{
                return res;
            }
        };
    }

    //Возвращает компаратор лексикографического порядка с функцией, которая извлекает ключ сортировки Comparable.
    default <U extends Comparable<? super U>> MyComparator<T> thenComparing(Function<? super T,? extends U> keyExtractor) {
        return (c1, c2) -> {
            int res = compare(c1, c2);
            if(res == 0){
                return keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
            }else{
                return res;
            }
        };
    }

    //Возвращает компаратор лексикографического порядка с функцией, которая извлекает ключ для сравнения с данным компаратором.
    default <U> MyComparator<T> thenComparing(Function<? super T,? extends U> keyExtractor, MyComparator<? super U> keyComparator){
        return (c1, c2) -> {
            int res = compare(c1, c2);
            if(res == 0){
                return keyComparator.compare(keyExtractor.apply(c1), keyExtractor.apply(c2));
            }else{
                return res;
            }
        };
    }

    //Возвращает компаратор лексикографического порядка с функцией, которая извлекает ключ сортировки double.
    default MyComparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor){
        return (c1, c2) -> {
            int res = compare(c1, c2);
            if(res == 0){
                return Double.compare(keyExtractor.applyAsDouble(c1), keyExtractor.applyAsDouble(c2));
            }else{
                return res;
            }
        };
    }

    //Возвращает компаратор лексикографического порядка с функцией, которая извлекает ключ сортировки long.
    default MyComparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor){
        return (c1, c2) -> {
            int res = compare(c1, c2);
            if (res == 0){
                return Long.compare(keyExtractor.applyAsLong(c1), keyExtractor.applyAsLong(c2));
            }else {
                return res;
            }
        };
    }

    //Возвращает компаратор лексикографического порядка с функцией, которая извлекает ключ сортировки int.
    default MyComparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor){
        return (c1, c2) -> {
            int res = compare(c1, c2);
            if (res == 0){
                return Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
            } else{
                return res;
            }
        };
    }
}
