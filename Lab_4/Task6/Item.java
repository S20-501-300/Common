package Task6;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price){ this.description = description; this.price = price; }
    public double getPrice(){ return price; }
    public boolean equals(Object otherObject) {
//        if (!(otherObject instanceof Item)) return false;
    // Быстрая проверка объектов на сходство
        if (this == otherObject) return true;
    // возвратить логическое значение false, если параметр
    // принимает пустое значение null
        if (otherObject == null) return false;
    // проверить, относится ли объект otherObject к типу Item
        if (getClass() != otherObject.getClass()) return false;
    // проверить, содержат ли переменные экземпляра одинаковые значения
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
                    && price == other.price;
    }
}
