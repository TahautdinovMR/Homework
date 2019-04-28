package ru.tahautdinov.task8;

public class Count {
    public static int counter = 0;

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        count();
    }

    public Count() {
        counter++;
    }
    public static void count(){
        System.out.println(counter);
    }
}
