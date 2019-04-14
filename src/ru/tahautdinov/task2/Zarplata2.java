package ru.tahautdinov.task2;

import java.util.Scanner;

public class Zarplata2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите зарплату ");
        Double a = in.nextDouble();

        a = a * 0.87;//пересчет суммы при цене 43
        System.out.println("Зарплата с вычетом НДФЛ:" + a);
    }
}
