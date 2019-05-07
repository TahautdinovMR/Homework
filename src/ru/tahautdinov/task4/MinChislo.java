package ru.tahautdinov.task4;

import java.util.Scanner;

public class MinChislo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        if (a > b)
            System.out.println("Наименьшее число " + b);
        else if (a < b)
            System.out.println("Наименьшее число " + a);
        else System.out.println("Числа равны ");

    }
}
