package Task6;

//хз правильно или нет
public class Main {
    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("x", 10, 3);
        DiscountedItem z = new DiscountedItem("z", 10, 3);
        Item y = new Item("y", 7);
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
    }
}
