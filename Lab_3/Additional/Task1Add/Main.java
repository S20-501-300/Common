package Task1Add;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
    public static void demoReduce() {
        List<Integer> list1 = Arrays.asList(1, 10, 100);
        List<Integer> list2 = Arrays.asList(5, 50, 500);
        
        MyIterator<Integer> iterator1 = MyIterator.fromIterator(list1.iterator());
        MyIterator<Integer> iterator2 = MyIterator.fromIterator(list2.iterator());
        
        MyIterator<Integer> unionIterator = iterator1.union(iterator2);

        BiFunction<Integer, Integer, Integer> func =
            (a, b) -> {
                return b;
        };

        MyIterator<Integer> reduceIterator = unionIterator.reduce(func);
        System.out.println("Reduce result");
        while (reduceIterator.hasNext()) {
            System.out.println(reduceIterator.next());
        }
    }

    public static void demoFilter() {
        List<Integer> list1 = Arrays.asList(1, 10, 100);
        List<Integer> list2 = Arrays.asList(5, 50, 500);
        
        MyIterator<Integer> iterator1 = MyIterator.fromIterator(list1.iterator());
        MyIterator<Integer> iterator2 = MyIterator.fromIterator(list2.iterator());
        
        MyIterator<Integer> unionIterator = iterator1.union(iterator2);


        Predicate<Integer> isHigherThan50 = x -> x > 50;
        MyIterator<Integer> fliterIterator = unionIterator.filter(isHigherThan50);

        System.out.println("Filter result");
        while (fliterIterator.hasNext()) {
            System.out.println(fliterIterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        demoFilter();
        System.out.println("");
        demoReduce();
    }
}