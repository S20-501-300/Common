package Task1;

public class Employee implements Measurable{
    private int measurable;

    public Employee(int n){ this.measurable = n; }
    @Override
    public double getMeasure() {
        return this.measurable;
    }
}
