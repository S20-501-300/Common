import java.util.ArrayList;

public class Invoice15 {
    private static class Item { // Класс Item вложен в класс Invoice String description; int quantity; double unitPrice;
        String description;
        int quantity;
        double unitPrice;
        double price() { return quantity * unitPrice; }
        public Item(){};
        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
    }

    public void addltem(String description, int quantity, double unitPrice) {
        Item newltem = new Item();
        newltem.description = description;
        newltem.quantity = quantity;
        newltem.unitPrice = unitPrice;
        items.add(newltem);
    }
    private ArrayList<Item> items = new ArrayList() ;
}