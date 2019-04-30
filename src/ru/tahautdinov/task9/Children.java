package ru.tahautdinov.task9;

public class Children extends Person {
    @Override
    public void run() {
        System.out.println("Я ребенок, я умею бегать");
    }

    @Override
    public void swim() {
        System.out.println("Я ребенок я могу плавать");

    }
}
