package task_5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        try {

            List<Integer> integers = new ArrayList<>();
            int n = in.nextInt();
            if (n > 0) {
                for (int i = 0; i < n + 1; i += 2) {
                    integers.add(i);
                    System.out.print(i + " ");
                }
                System.out.println("\nСумма = " + Program.getSum(integers));

            } else System.out.println("Длина последовательности должна быть больше 0.");

        } catch (InputMismatchException e) {
            System.out.println("Некоректный ввод.");
        }
    }
}