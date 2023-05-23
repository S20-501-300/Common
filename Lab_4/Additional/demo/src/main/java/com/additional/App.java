package com.additional;

import javassist.Modifier;
import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
// import lab3.Comparator.MyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;

/*
 * Don't forget to java --add-opens java.base/java.lang=ALL-UNNAMED
 */

public class App 
{
    static public Object proxyLog(Class<?> cl) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ProxyFactory factory = new ProxyFactory();
        
        Object obj = cl.getDeclaredConstructor().newInstance();
        factory.setSuperclass(obj.getClass());
        
        MethodHandler handler = new MethodHandler() {
            @Override
            public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
                Object result = proceed.invoke(self, args);
                System.out.println("Class: " + proceed.getClass() + "\nMethod: " + thisMethod + "\nArgument: " + Arrays.toString(args) +  "\nResult: " + result);
                return result;
            }
        };

        return factory.create(new Class<?>[0], new Object[0], handler);

        // Class c = createClass();
        // Constructor cons = cl.getConstructor();
        // Object obj = cl.getConstructor().newInstance();
        // ((Proxy)obj).setHandler(handler);
        // return obj;
        // return factory.create(new Class<?>[0], new Object[0], handler);
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Item item1 = new Item();
        item1.setDescription("Fender Stratocaster");
        item1.setPrice(60000);
    
        System.out.printf("Old item:\tPrice = %f; Description = '%s'\n",
        item1.getPrice(), item1.getDescription());
        System.out.println("-----------------------------");

        Item item = (Item) proxyLog(item1.getClass());
        
        (item).setPrice(20000);
        (item).setDescription("Bass");
        
        System.out.println("-----------------------------");
        
        System.out.printf("New item:\tPrice = %f; Description = '%s', equals = %s\n",
            (item).getPrice(), (item).getDescription(), 
            (item.equals(item1) ? "True" : "False"));
        // System.out.println("New Item:");
        // System.out.println("Price = " + item.getPrice());
        // System.out.println("Description = " + item.getDescription());
        // System.out.println("Equals = " + (item.equals(item1) ? "True" : "False"));
    }
}
