import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*  Метод nextInt модифицирующий, так как он меняет значение полей объекта
        Внутри есть команда setRadix(radix); которая изменяет внутреннее значение сканнера
        */


        int n = in.nextInt();
        in.close();

        // ============================================================ //
        // ############################################################ //
        // ============================================================ //
        
        Random random = new Random();

        // Метод nextInt - метод доступа, так как он не меняет объекта
        int s = random.nextInt();
    }

}