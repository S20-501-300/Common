package com.task17;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Queue17 queue = new Queue17();
        queue.add("first item");
        queue.add("second item");
        queue.add("third item");
        queue.add("fourth item");

        System.out.println(queue.toString());

        Iterator<String> it = queue.iterator();
        it.next();
        String elem = it.next();

        System.out.printf("Previous iterator element \"%s\"\n", elem);
        System.out.println("Removing...");
        it.remove();
        System.out.println(queue.toString());
        System.out.println("Removing...");
        it.remove();
        System.out.println(queue.toString());
        System.out.println("Removing...");
        it.remove();
        System.out.println(queue.toString());
    }
}
