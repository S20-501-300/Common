public class Queue16 {
    private Node head;
    private Node tail;

    private static class Node{
        private String item;
        private Node next;

        public Node(String item){
            this.item = item;
            this.next = null;
        }

        public Node getNext(){ return this.next;}
        public String getItem(){ return this.item;}

        void setItem(String str){this.item = str;}
        void setNext(Node next){this.next = next;}

    }

    public Queue16(){
        this.head = null;
        this.tail = null;
    }
    public Queue16(String item){
        Node nd = new Node(item);
        this.head = nd;
        this.tail = nd;
    }

    public void add(String item){
        Node nd = new Node(item);
        this.tail.next = nd;
        this.tail = nd;
    }

    public void remove(){
        this.head = this.head.next;
    }
}
//класс должен быть статическим, потому что объект Node создается каждый раз для объекта и удалется вместе с объектом