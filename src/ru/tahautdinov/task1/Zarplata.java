package ru.tahautdinov.task1;

public class Zarplata {
    public static void main(String[] args) {
        double a = 80555;//зарплата до вычета
        a = a * 0.87;//с вычетом НДФЛ

        System.out.println("Зарплата на руки составляет: " + a);
    }
}
