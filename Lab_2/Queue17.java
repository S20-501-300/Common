public class Queue17 {
    private Node head;
    private Node tail;
    private int SZ = 0;

    private class Iterator{
        private Node node;
        public Iterator(){this.node = null; }
        //public Iterator(Node node){ this.node = node; }
        public Iterator(int i){
            Node par = Queue17.this.head;
            for(int j=0; j<i; j++){
                if(par == null){
                    this.node = null;
                    break;
                } else if (par.next == null) {
                    this.node = par;
                }else if(j+1 == i){
                    this.node = par;
                }else
                    par = par.next;
            }
        }

        public Node hasNext(){
            return this.node.next;
        }
        public void next(){
            this.node = this.node.next;
        }
        
        public void remove(){
            Queue17 outer = Queue17.this;
            Node prev;
            if (node == outer.head)
                prev = null;
            else
                prev = outer.head;
            if (prev == null){
                throw new IllegalStateException();
            }else {
                while(prev.next != node)
                    prev = prev.next;
                if (prev == outer.head){
                    outer.remove();
                }else{
                    Node prevprev = outer.head;
                    while (prevprev.next != node)
                        prevprev = prevprev.next;
                    prevprev.next = node.next;
                    if (prev == outer.tail)
                        outer.tail = prevprev;
                    outer.SZ -= 1;
                }
                node = null;
            }
        }
    }
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
    
    public int getSZ(){
        return SZ;
    }

    public void add(String item){
        Node nd = new Node(item);
        this.tail.next = nd;
        this.tail = nd;
        this.SZ += 1;
    }

    public void remove(){
        this.head = this.head.next;
        this.SZ -= 1;
    }
}
