package Task16_Refs;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    static <T> void mySuperUse(HiFunc<T> f, T v) {
        f.hi(v);
    }

    public static void main(String[] args) {
        // ссылка на инстанс метод класса
        Consumer<Employee> refToMyMethod = Employee::hi;
        
        // вызов инстанс метода класса через ссылку
        refToMyMethod.accept(new Employee("refToMyMethod"));


        // создание объекта класса
        // Employee obj = new Employee("refToObjMethod");
        
        // ссылка на конкретный экземпляр объекта
        // Consumer<Void> refToObjMethod = v -> obj.hi();
        // refToObjMethod.accept(null);

        Employee obj = new Employee("refToObjMethod");
        mySuperUse(Employee::hi, obj);
    }
}
