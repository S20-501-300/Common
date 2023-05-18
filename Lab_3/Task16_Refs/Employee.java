package Task16_Refs;

public class Employee {
    private String name;

    public Employee(String name){ this.name = name; }
    public Employee(){this.name = "Null"; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    void hi(){ 
        System.out.println("Hi from " + this.name);
    }

}
