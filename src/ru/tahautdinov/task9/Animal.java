package ru.tahautdinov.task9;

public abstract class Animal {
   String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getName();
}
