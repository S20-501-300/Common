package Task2;

public class Employee implements Measurable {
    private String name;
    private int measurable;

    public Employee(int n){ this.measurable = n; }
    @Override
    public double getMeasure() {
        return this.measurable;
    }

    Measurable largest(Measurable[] objects){
        Measurable obj = objects[0];
        for(int i=0; i<objects.length-1; i++){
            if(obj.getMeasure() < objects[i+1].getMeasure())
                obj = objects[i+1];
        }
        return obj;
    }
}