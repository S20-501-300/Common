
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {

    public static void printDays() {
        System.out.print("Sa");
        System.out.print("  ");
        System.out.print("Mo");
        System.out.print("  ");
        System.out.print("Tu");
        System.out.print("  ");
        System.out.print("Th");
        System.out.print("  ");
        System.out.print("We");
        System.out.print("  ");
        System.out.print("Fr");
        System.out.print("  ");
        System.out.println("Su");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type year: ");
        int year = in.nextInt();
        System.out.print("Type month: ");
        int month = in.nextInt();
        in.close();

        printDays();

        LocalDate date = LocalDate.of(year, month, 1);
        

        DayOfWeek day1 = date.getDayOfWeek();
        int value = day1.getValue();
        for (int i = 1; i <= value; i++) {
            System.out.print("    ");
        }
        
        for (; date.getMonthValue() == month; date = date.plusDays(1)) {
            DayOfWeek day = date.getDayOfWeek();
            System.out.printf("%2d  ", date.getDayOfMonth());

            if (day.getValue() % 7 == 6) {
                System.out.println();
            }
        }

    }
}