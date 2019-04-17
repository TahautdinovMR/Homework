package ru.tahautdinov.task4;

import java.util.Scanner;

public class NumInfo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                int a = in.nextInt();
        if (a > 0)
            System.out.println("Число полжительное,");
        else if (a == 0)
            System.out.println("Число равно нулю");
        else
            System.out.println("Число отрицательное,");

        if (a % 2 == 0)
            System.out.println("четное");
        else
            System.out.println("нечетное");





    }
}
