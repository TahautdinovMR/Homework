package ru.tahautdinov.task2;

import java.util.Scanner;

public class TimeConvert2 {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество секунд ");
            Float a = in.nextFloat();

            a = a / 3600;//пересчет суммы при цене 43
            System.out.println("Перевод в часы - " + a);
        }
}

