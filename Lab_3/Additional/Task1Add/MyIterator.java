package Task1Add;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;
    private Predicate<T> predicate = null;

    private T item = null;
    private T result = null;
    private boolean isReduce = false;
    private BiFunction<T, T, T> func =
            (a, b) -> {
                return a;
    };

    private MyIterator(Iterator<T> iterator){
        this.iterator=iterator;
    }
    private MyIterator(Iterator<T> iterator, Predicate<T> predicate){
        this.iterator = iterator;
        this.predicate = predicate;
    }
    private MyIterator(Iterator<T> iterator, BiFunction<T, T, T> func) {
        this.iterator = iterator;
        this.func = func;
        this.isReduce = true;
    }
    
    public static <T> MyIterator<T> fromIterator(Iterator<T> iterator) {
        return new MyIterator<T>(iterator);
    }
    
    public MyIterator<T> union(MyIterator<T> other) {
        Objects.requireNonNull(other);
        Iterator<T> unionIterator = new Iterator<T>() {
            private boolean firstIteratorActive = true;
            
            @Override
            public boolean hasNext() {
                return iterator.hasNext() || other.iterator.hasNext();
            }
            
            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (firstIteratorActive) {
                    if (iterator.hasNext()) {
                        return iterator.next();
                    } else {
                        firstIteratorActive = false;
                    }
                }
                return other.iterator.next();
            }
        };
        return new MyIterator<>(unionIterator);
    }

    public MyIterator<T> filter(Predicate<T> predicate){
        return  new MyIterator<T>(this, predicate);
    }
    public MyIterator<T> reduce(BiFunction<T, T, T> func) {
        return new MyIterator<T>(this, func);
    }

    
    public boolean hasNext() {
        if (this.predicate == null && !this.isReduce)
            return this.iterator.hasNext();
        if (this.predicate != null)
            return predicateHasNext();
        return funcHasNext();
    }

    private boolean predicateHasNext() {
        while (this.iterator.hasNext()) {
            this.item = this.iterator.next();
            if (this.predicate.test(this.item))
                return true;
        }
        return false;
    }
    
    private boolean funcHasNext() {
        if (this.iterator.hasNext()) {
            T item1 = this.iterator.next();
            T item2;
            if (this.iterator.hasNext()) {
                item2 = this.iterator.next();
            } else
                item2 = item1;
            this.result = this.func.apply(item1, item2);
            return true;
        }
        return false;
    }

    public T next() {
        if (this.predicate == null && !this.isReduce)
            return this.iterator.next();

        if (this.predicate != null)
            return predicateNext();

        return funcNext();
    }

    private T predicateNext() {
        if (this.item == null)
            throw new NoSuchElementException();
        T item = this.item;
        this.item = null;
        return item;
    }

    private T funcNext() {
        if (this.result == null)
            throw new NoSuchElementException();
        T result = this.result;
        this.result = null;
        return result;
    }
}