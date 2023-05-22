package Task9;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Employee {
    private int age;
    private int id;
    private String name;
    private String[] children;

    public Employee(int age, int id, String name, String[] children){
        this.age = age;
        this.id = id;
        this.name = name;
        this.children = children;
    }

    public String toString(){
        StringBuilder str = new StringBuilder(this.getClass().getSimpleName());
        for(Field field : this.getClass().getDeclaredFields()){
            str.append(field.getName());
            str.append(", ");
        }

        return str.toString();
    }

    public static Field[] allFields(Class<?> classObj){
        return classObj.getDeclaredFields();
    }
}
