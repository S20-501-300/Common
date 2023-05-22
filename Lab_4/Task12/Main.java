package Task12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Player player = new Player("Dima");
        Method method;

        BigInteger start1 = new BigInteger(String.valueOf(System.nanoTime()));
        try {
            method = player.getClass().getMethod("getName");
            Object result = method.invoke(player, null);
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ex){
            throw new RuntimeException(ex);
        }
        BigInteger end1 = new BigInteger(String.valueOf(System.nanoTime()));
        System.out.println("Reflication metod = " + (end1.subtract(start1)));

        BigInteger start2 = new BigInteger(String.valueOf(System.nanoTime()));
        String name = player.getName();
        BigInteger end2 = new BigInteger(String.valueOf(System.nanoTime()));
        System.out.println("Usual metod = " + (end2.subtract(start2)));

    }
}
