package Task14;

public class Employee {
    private int money;
    private String name;

    public Employee(int money, String name){ this.money = money; this.name = name; }
    public Employee(){this.name = "Null"; this.money = 0; }
    public int getMoney(){ return this.money; }
    public String getName(){ return name; }
    public void setMoney(int money){ this.money = money; }
    public void setName(String name){ this.name = name; }

}
