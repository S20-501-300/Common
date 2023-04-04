package com.task17;

import java.util.Iterator;

public class Queue17 implements Iterable<String> {
    private Node head;
    private Node tail;
    private int SZ = 0;

    private class MyIterator implements Iterator<String> {
        private Node node = head;

        @Override
        public boolean hasNext() {
            return this.node != null;
        }

        @Override
        public String next() {
            String result = this.node.item;
            this.node = this.node.next;
            return result;
        }

        @Override
        public void remove() {
            // In case if remove() without first next()
            if (this.node == null || this.node.prev == null) {
                throw new IndexOutOfBoundsException();
            }

            Node prev = this.node.prev;
            Node prevprev = prev.prev;

            // In case if remove() right after first next()
            if (prevprev == null) {
                Queue17.this.head = this.node;
                this.node.prev = null;
                return;
            }

            // Otherwise

            prevprev.next = this.node;
            this.node.prev = prevprev;
        }
    }
    private static class Node {
        private String item;
        private Node next;
        private Node prev;

        public Node(String item){
            this.item = item;
            this.next = null;
        }

        public Node getNext(){ return this.next;}
        public String getItem(){ return this.item;}

        void setItem(String str){this.item = str;}
        void setNext(Node next){this.next = next;}

    }

    public Queue17(){
        this.head = null;
        this.tail = null;
    }
    public Queue17(String item){
        Node nd = new Node(item);
        this.head = nd;
        this.tail = nd;
        this.SZ = 1;
    }
    
    public int size(){
        return SZ;
    }

    public void add(String item){
        Node new_node = new Node(item);
        if (this.SZ == 0) {
            this.head = new_node;
            this.tail = new_node;
            this.SZ++;
            return;
        }

        this.tail.next = new_node;
        new_node.prev = this.tail;
        this.tail = new_node;
        this.SZ += 1;
    }

    public void remove(){
        this.head = this.head.next;
        this.SZ -= 1;
    }

    public Iterator<String> iterator() {
        return (Iterator<String>) new MyIterator();
    }
    
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Iterator<String> it = this.iterator(); it.hasNext(); ) {
            String item = it.next();
            
            stringBuilder.append("\"" + item + "\"");
            
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
