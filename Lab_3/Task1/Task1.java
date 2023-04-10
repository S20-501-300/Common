package Task1;

public class Task1 {
    public static double average(Measurable[] objects){
        int count = 0;
        double sum = 0;

        while (count < objects.length) {
            sum += objects[count].getMeasure();
            count++;
        }
        return sum / count;
    }

    public static void main(String[] args) {
        Measurable[] objects = new Measurable[10];
        
        System.out.printf("[");

        for(int i = 0; i < 10; i++) {
            objects[i] = new Square(i + 1);
            System.out.printf("%f, ", objects[i].getMeasure());
        }
        System.out.printf("]\n");

        double av_empl = average(objects);
        System.out.println(av_empl);
    }
}