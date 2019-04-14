package ru.tahautdinov.task2;

import java.util.Scanner;

public class FuelPrice2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество литров ");
        int a = in.nextInt();

        a = a * 43;//пересчет суммы при цене 43
        System.out.println("Цена бензина - " + a);
    }
}
