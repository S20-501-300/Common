package Task6;

public class DiscountedItem extends Item{
    private double discount;
    public DiscountedItem(String description, double price, double discount){
        super(description, price);
        this.discount = discount; }
    public boolean equals(Object otherObject) {
        //Проверка на принадлежность к Item
        //if (!(otherObject instanceof Item)) return false;
        //Проверка не пройдет, если otherObject не относится к DiscountedItem
        if (!super.equals(otherObject)){
            Item other = (Item) otherObject;
            return super.getPrice()-discount == other.getPrice();
        }else{
            DiscountedItem other = (DiscountedItem) otherObject;
            return super.getPrice()-discount == other.getPrice()-other.discount;
        }



    }
}
