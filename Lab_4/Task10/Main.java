package Task10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static String toString(Object obj){
        StringBuilder str = new StringBuilder(obj.getClass().getSimpleName());
        str.append(" ");
        for(Method field:  obj.getClass().getMethods()){
            str.append(field.getName());
            str.append(", ");
        }

        return str.toString();
    }

    public static void main(String[] args){
        int[] values = {1, 2, 3};
        System.out.println(toString(values));
        // String[] children = new String[3];
        // children[0] = "Dima";
        // children[1] = "Makar";
        // children[2] = "Sava";
        // Employee employee = new Employee(21, 1, "Maks" ,children );
        // try {
        //     Class<?> cl = Class.forName("[I");
        //     //Class<?> cl = Class.forName("Task10.Employee");
        //     while (cl != null) {
        //         for (Method m : cl.getDeclaredMethods()) {
        //             System.out.println(
        //                     Modifier.toString(m.getModifiers()) + " "
        //                             + m.getReturnType().getCanonicalName() + " "
        //                             + m.getName() + Arrays.toString(m.getParameters()));
        //         }
        //         cl = cl.getSuperclass();
        //     }
        // }catch (ClassNotFoundException ex){
        //     System.out.println("Error");
        // }
    }
}
