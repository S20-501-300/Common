import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task1_additional {

    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year and month:");
        int year = 2023, month = 1;
        if (in.hasNextInt())
            year = in.nextInt();
        else
            throw new RuntimeException();
        if (in.hasNextInt())
            month = in.nextInt();
        else
            throw new RuntimeException();

        if (year<1 || month>13 || month<1)
            throw new RuntimeException();
        printNumbersOfMonth(LocalDate.of(year, month, 1), month);
    }

    public static void printNumbersOfMonth(LocalDate date, int month) {
        int dayOfWeek = date.getDayOfWeek().getValue();

        showNamesOfWeekDays(dayOfWeek);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == (dayOfWeek==1?7:dayOfWeek-1)) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }

    public static void showNamesOfWeekDays(int day) {
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4s", DayOfWeek.of(i+day==7?7:(i+day)%7).toString().substring(0, 3));
        }
        System.out.println();
    }
}
