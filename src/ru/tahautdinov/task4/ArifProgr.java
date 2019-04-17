package ru.tahautdinov.task4;

import java.util.Scanner;

public class ArifProgr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый член");
        int a = in.nextInt();
        System.out.println("Введите разность прогрессии");
        int b = in.nextInt();
        System.out.println("Введите количество членов прогрессии");
        int c = in.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.println(a);
            a = a + b;//для геометрической прогрессии знак умножения и переменная "разность" называется "знаменателем"

        }

    }





}
