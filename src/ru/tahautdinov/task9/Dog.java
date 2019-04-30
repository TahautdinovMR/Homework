package ru.tahautdinov.task9;

public class Dog extends Animal implements Run, Swim {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Я могу бегать");
    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать");

    }
}
