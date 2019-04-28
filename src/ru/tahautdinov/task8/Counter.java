package ru.tahautdinov.task8;

public class Counter {
    public static int counter = 0;

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        count();
    }

    public Counter() {
        counter++;
    }
    public static void count(){
        System.out.println(counter);
    }
}
