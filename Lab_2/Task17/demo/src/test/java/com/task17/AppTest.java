package com.task17;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testQueue() {
        Queue17 queue = new Queue17();
        queue.add("first item");
        queue.add("second item");
        queue.add("third item");
        queue.add("fourth item");

        assertTrue("Checking toString", 
            queue.toString()
                .equals("[\"first item\", \"second item\", \"third item\", \"fourth item\"]")
        );

        Iterator<String> it = queue.iterator();
        it.next();
        String elem = it.next();

        assertTrue("Checking second iterator element", 
            elem.equals("second item")
        );

        it.remove();

        assertTrue("Checking first remove result", 
            queue.toString()
                .equals("[\"first item\", \"third item\", \"fourth item\"]")
        );
        it.remove();
        assertTrue("Checking first remove result", 
            queue.toString()
                .equals("[\"third item\", \"fourth item\"]")
        );

        try {
            it.remove();
            assertTrue("remove() not thrown exception", false);
        } catch (IndexOutOfBoundsException e) {
            assertTrue("remove() thrown exception", true);
        }
    }
}
