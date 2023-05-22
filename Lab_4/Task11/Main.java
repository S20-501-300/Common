package Task11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] arg){

        Class<?> classObject = System.class;
        Field outField;
        try {
            outField = classObject.getField("out");


            Object outObject;
            try {
                outObject = outField.get(null); //static
            }catch (IllegalAccessException ex){
                throw new RuntimeException(ex);
            }


            try {
                Method m = outObject.getClass().getDeclaredMethod("println", String.class);
                Object result = m.invoke(outObject, "Hello World!");
            }catch (NoSuchMethodException ex){
                System.out.println("Error");
            } catch (InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }


        }catch (NoSuchFieldException ex){
        }



    }
}
