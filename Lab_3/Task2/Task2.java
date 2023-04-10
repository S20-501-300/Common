package Task2;
public class Task2 {

    public static double average(Measurable[] objects) {
        int count = 0;
        double sum = 0;

        while (count < objects.length){
            sum += objects[count].getMeasure();
            count++;
        }
        return sum / count;
    }

    private static Measurable largest(Measurable[] objects){
        Measurable obj = objects[0];
        for(int i=0; i<objects.length-1; i++){
            if(obj.getMeasure() < objects[i+1].getMeasure())
                obj = objects[i+1];
        }
        return obj;
    }

    public static void main(String[] args) {
//        Task2.Measurable[] objects = new Task2.Measurable[10];
//        for(int i=0; i<10; i++){
//            objects[i] = new Task2.Employee(i+1);
//        }
//        double av_empl = average(objects);
        Measurable[] objects = new Measurable[10];
        Employee employee = new Employee(10);
        for (int i = 0; i < 10; i++) {
            if (employee instanceof Measurable)
                objects[i] = (Measurable) new Employee(10);
        }
        //Если заранее известно, что объект, хранящийся в переменной типа Measurable, на самом деле относится к типу Employee,
        //то его типа можно преобразовать след образом
        //
        //Measurable mess = ...;
        //Employee emp = (Employee) mess;
        //System.out.println(emp.getMeasure());

        System.out.println(largest(objects).getMeasure());
    }
}
