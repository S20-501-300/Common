package Task14_Comparator;

public class Employee {
    private double workHours;
    private String name;

    public Employee(double workHours, String name){ this.workHours = workHours; this.name = name; }
    public Employee(){this.name = "Null"; this.workHours = 0; }
    public double getWorkHours(){ return this.workHours; }
    public String getName(){ return name; }
    public void setWorkHours(double workHours){ this.workHours = workHours; }
    public void setName(String name){ this.name = name; }

}
