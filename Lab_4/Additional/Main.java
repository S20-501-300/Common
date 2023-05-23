package Additional;

// import javassist.Modifier;
// import javassist.util.proxy.MethodFilter;
// import javassist.util.proxy.MethodHandler;
// import lab3.Comparator.MyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
// import javassist.util.proxy.ProxyFactory;


public class Main {
    public static Object proxyLog(Object o) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ProxyFactory factory = new ProxyFactory();
        factory.setSuperclass(o.getClass());
        MethodHandler handler = new MethodHandler() {
            @Override
            public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
                Object result = proceed.invoke(self, args);
                System.out.println("Class: " + o.getClass() + "\nMethod: " + thisMethod + "\nArgument: " + Arrays.toString(args) +  "\nResult: " + result);
                return result;
            }
        };
        return factory.create(new Class<?>[0],new Object[0], handler);
    }
        public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
                Point point1 = new Point();
            point1.setX(1);
            point1.setY(1);
            Point point = (Point) proxyLog(point1);
                (point).setX(1);
                (point).setY(1);
                (point).getX();
                (point).getY();
                point.equals(point1);
                point.hashCode();
                point.toString();
        }
}