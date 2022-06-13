package by.tms.hometask2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите колличество дней =");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введите колличество осадков за периуд =");
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int precipitation = scanner.nextInt();
            sum += precipitation;
            if (max == 0 || precipitation > max) {
                max = precipitation;
            }

        }
        double avg = (double) sum / n;
        System.out.println("Количество дней =" + n);
        System.out.println("Сумму осадков за этот период =" + sum);
        System.out.println("Среднее количество осадков за этот период =" + avg);
        System.out.println("Максимальное количество дневных осадков за этот период =" + max);
    }
}

