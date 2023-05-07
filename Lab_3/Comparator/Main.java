public class Main {
    public static void main(String[] args){
        Unit a = new Unit(1, 5);
        Unit b = new Unit(1, 10);

        MyComparator<Unit> comp = new Test();
        System.out.println(comp.compare(a, b));
        System.out.println(comp.thenComparing((a1, b1) -> a1.getSecond()-b1.getSecond()).compare(a, b));
    }
}
