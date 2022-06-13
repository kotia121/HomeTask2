package by.tms.hometask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0, j = 1;
        System.out.println(i);
        System.out.println(j);
        while (i + j < number) {
            int sum = i + j;
            System.out.println(sum);
            i = j;
            j = sum;
        }

    }
}

