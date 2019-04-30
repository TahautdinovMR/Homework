package ru.tahautdinov.task9;

public class Student extends Person {
    @Override
    public void run() {
        System.out.println("Я студент, я могу бегать");

    }

    @Override
    public void swim() {
        System.out.println("Я студент, я могу плавать");

    }
}
