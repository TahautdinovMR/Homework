package ru.tahautdinov.task9;

public class Cat extends Animal implements Run {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void run() {
        System.out.println("я могу бегать");


    }
}
