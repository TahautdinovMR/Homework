package ru.tahautdinov.task9;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");
        System.out.println(dog.getName());
        dog.run();
        dog.swim();
        System.out.println(cat.getName());
        cat.run();
        Children brad = new Children();
        brad.run();
        brad.swim();
        Person mike = new Student();
        mike.run();
        mike.swim();

    }
}
