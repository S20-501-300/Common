package Task9;

import java.lang.reflect.Field;

public class Main {

    public static String toString(Object obj){
        StringBuilder str = new StringBuilder(obj.getClass().getSimpleName());
        for(Field field:  obj.getClass().getDeclaredFields()){
            str.append(field.getName());
            str.append(", ");
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String[] children = new String[3];
        children[0] = "Dima";
        children[1] = "Makar";
        children[2] = "Sava";
        Employee employee = new Employee(21, 1, "Maks", children);

        System.out.println(toString(employee));
        System.out.println(employee.toString());
    }
}
