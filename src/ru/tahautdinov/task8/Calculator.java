package ru.tahautdinov.task8;

import java.util.Scanner;

public class Calculator {
    static double firstNomb;
    static double secondNomb;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        firstNomb = scan.nextDouble();
        secondNomb = scan.nextDouble();
        System.out.println(sum(firstNomb, secondNomb));
        System.out.println(razn(firstNomb, secondNomb));
        System.out.println(umn(firstNomb, secondNomb));
        System.out.println(delen(firstNomb, secondNomb));
        System.out.println(proc(firstNomb, secondNomb));
    }

    public static double sum(double a, double b){
        return a + b;
    }
    public static double razn(double a, double b){
        return a - b;
    }
    public static double umn(double a, double b){
        return a * b;
    }
    public static double delen(double a, double b){
        return a / b;
    }
    public static double proc(double a, double b){
        return a / b * 100;
    }



}
