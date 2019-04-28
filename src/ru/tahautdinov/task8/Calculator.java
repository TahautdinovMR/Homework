package ru.tahautdinov.task8;

import java.util.Scanner;

public class Calculator {
    static double firstNomb;
    static double secondNomb;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        firstNomb = scan.nextDouble();
        secondNomb = scan.nextDouble();
        sum();
        razn();
        umn();
        delen();
        proc();
    }

    public static void sum(){
        System.out.println(firstNomb + secondNomb);
    }
    public static void razn(){
        System.out.println(firstNomb - secondNomb);
    }
    public static void umn(){
        System.out.println(firstNomb * secondNomb);
    }
    public static void delen(){
        System.out.println(firstNomb / secondNomb);
    }
    public static void proc(){
        System.out.println(firstNomb / secondNomb * 100);
    }

}
