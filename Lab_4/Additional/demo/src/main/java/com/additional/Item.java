package com.additional;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    // public Item(String description, double price){ this.description = description; this.price = price; }

    public double getPrice(){ return this.price; }
    public String getDescription(){ return this.description; }
    
    public void setPrice(double price){ this.price = price; }
    public void setDescription(String description){ this.description = description; }

    @Override
    public String toString(){
        return getClass().getName() + "[ price="+ Double.toString(getPrice()) + ", "+ "description="+ getDescription()+" ]";
    }

    @Override
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
        Item6 other = (Item6) otherObject;
        return Objects.equals(description, other.getDescription())
                    && price == other.getPrice();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getPrice(), getDescription());
    }
}
