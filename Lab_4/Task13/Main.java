package Task13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;

public class Main {

    public static void printTable(Method method, double lowerLimit, double upperLimit, double step) throws IllegalAccessException, InvocationTargetException {
        // System.out.println("Table for " + method.getName() + ": ");
        System.out.println("x\t\t\tf(x)");
        for (double x = lowerLimit; x <= upperLimit; x += step) {
            double result = (Double) method.invoke(null, x);
            System.out.printf("%.2f\t\t%.2f%n", x, result);
        }
    }

    public static void printTable(Function<Double, Double> function, double lowerLimit, double upperLimit, double step) {
        // System.out.println("Table for " + function.getClass().getSimpleName() + ":");
        System.out.println("x\t\t\tf(x)");
        for (double x = lowerLimit; x <= upperLimit; x += step) {
            double result = function.apply(x);
            System.out.printf("%.2f\t\t%.2f%n", x, result);
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException{
        Method sqrtMethod = Math.class.getMethod("sqrt", double.class);
        System.out.println("Table for Method:");
        printTable(sqrtMethod, 1, 10, 1);

        System.out.println("---------------------------------------------");
        System.out.println("Table for Function:");
        Function<Double, Double> toHexString = new Function<Double, Double>() {
            @Override
            public Double apply(Double d) {
                return Double.valueOf(Double.toHexString(d));
            }
        };
        printTable(toHexString, 1, 10, 1);
    }
}

/*
 * Оба метода могут быть безопасно использованы, если передаваемые параметры 
 * (например, параметр Method для первого метода или объект Function<Double, Double> для второго метода) 
 * корректны и безопасны. 
 * 
 * Однако, при некорректных параметрах, первый метод может привести к ошибкам, связанным с reflection, таким как IllegalAccessException и InvocationTargetException
 * 
 * Второй метод более удобен в использовании, так как не требует передачи объекта типа Method, а принимает простую функцию. 
 * Также второй метод более эффективен, так как не использует reflection, который может значительно замедлить работу программы.
 * 
 * Итак, второй метод более удобен и эффективен, и поэтому является предпочтительным вариантом.
 */
