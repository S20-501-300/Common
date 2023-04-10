package Task1;

public class Task1 {

    public double average(Measurable[] objects){
        int count = 0;
        double sum = 0;

        while (count < objects.length){
            sum += objects[count].getMeasure();
            count++;
        }
        return sum/count;
    }

    public void main(String[] args) {
        Measurable[] objects = new Measurable[10];
        for(int i=0; i<10; i++){
            objects[i] = new Employee(i+1);
        }
        double av_empl = average(objects);
        System.out.println(av_empl);
    }
}