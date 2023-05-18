package Task14_Comparator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static final Comparator<Employee> SORT_BY_WORK_HOURS_BY_NAME =
         Comparator.comparing(Employee::getWorkHours).thenComparing(Employee::getName);



    public static Comparator<Employee> sort_by_name_by_work_hours(){
        return Comparator.comparing(Employee::getName).thenComparing(Employee::getWorkHours);
    }


    public static void main(String[] args) {
        Employee[] emp = {
                new Employee(6.5, "Kirill"),
                new Employee(8, "Vitek"),
                new Employee(4, "Roma"),
                new Employee(4, "Alexey"),
        };

        System.out.println("Sort by money, by name: \n");


        Arrays.sort(emp, SORT_BY_WORK_HOURS_BY_NAME);
        // Arrays.sort(emp, Comparator.comparing(Employee::getWorkHours).thenComparing(Employee::getName));

        for (int i=0; i < emp.length; i++){
            System.out.println(emp[i].getWorkHours() + "\t" + emp[i].getName());
        }

        System.out.println("Revers sort by name and by money: \n");


        Arrays.sort(emp, sort_by_name_by_work_hours());

        for (int i=0; i < emp.length; i++){
            System.out.println(emp[i].getWorkHours() + "\t" + emp[i].getName());
        }

    }
}
