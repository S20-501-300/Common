/*
 * Using only the conditional operator, write a program that reads three integers and
prints the largest. Repeat with Math.max
 */

package task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
        System.out.println(Math.max(a, Math.max(b, c)));
        scanner.close();
    }
}