package Task14;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static Comparator<Employee> sort_by_money_by_name(){
        return Comparator.comparing(Employee::getMoney).thenComparing(Employee::getName);
    }

    public static Comparator<Employee> sort_by_name_by_money(){
        return Comparator.comparing(Employee::getName).thenComparing(Employee::getMoney);
    }



    public static void main(String[] args) {



        Employee[] emp = {
                new Employee(12, "A"),
                new Employee(15, "A"),
                new Employee(7, "C"),
                new Employee(7, "D"),
        };

        System.out.println("Sort by money, by name: \n");


        Arrays.sort(emp, sort_by_money_by_name());

        for (int i=0; i < emp.length; i++){
            System.out.println(emp[i].getMoney() + "   " + emp[i].getName());
        }

        System.out.println("Revers sort by name and by money: \n");


        Arrays.sort(emp, sort_by_name_by_money());

        for (int i=0; i < emp.length; i++){
            System.out.println(emp[i].getMoney() + "   " + emp[i].getName());
        }

    }
}
