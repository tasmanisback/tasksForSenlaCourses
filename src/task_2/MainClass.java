  
package task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");

        try {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("Наибольший общий делитель: %d;\nНаименьшее общее кратно: %d.",
                     Program.gcd(a, b), Program.lcm(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}