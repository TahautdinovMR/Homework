package ru.tahautdinov.task2;

import java.util.Random;
import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {

        Random rand = new Random();
        int a = rand.nextInt(100);
        //System.out.println(a);

        Scanner in = new Scanner(System.in);


        int c = 0;
        int d = a;
        System.out.println("Введите число от 0 до 100, либо 999 для выхода");
        c = in.nextInt();
        while (c != a) {

            if (d > Math.abs(a - c)) {
                System.out.println("Тепло");
                d = a - c;
            } else if (c == 999)
                break;
            else
                System.out.println("Холодно");
            c = in.nextInt();
        }
        if (a == c)
            System.out.println("Ты угадал");


    }


}
