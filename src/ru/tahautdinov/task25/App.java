package ru.tahautdinov.task25;

public class App {
    public static void main(String[] args) {
        MapDemo mapDemo = new MapDemo();
        mapDemo.addProduct("milk", 11);
        System.out.println(mapDemo.getProductQuantity("milk"));

        UniqueMap a = new UniqueMap();
        a.addPerson("A", "B");
        a.addPerson("B", "M");
        a.addPerson("C", "D");

        System.out.println(a.isUnique(a.person));

    }



}
