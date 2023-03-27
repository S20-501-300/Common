import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_additional {

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
        System.out.print("Type day (1 - Saturday to 7 - Sunday): ");
        int dayOfWeek = 0;

        try {
            dayOfWeek = in.nextInt();
            in.close();
        } catch (InputMismatchException e) {
            in.close();
            System.out.println("Must be integer!");
            System.exit(1);
        }

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Must be in range [1; 7]!");
            System.exit(1);
        }

        printDays();

        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }
        
        for (int day = 1; day <= 30; day++) {
            System.out.printf("%2d  ", day);

            if (day % 7 == (8 - dayOfWeek) % 7) {
                System.out.println();
            }
        }

    }
}