package ru.tahautdinov.task8;

public class Convertation {

    public static Act convert(Dogovor a){
        Act b = new Act(a.getNum(), a.getDate(), a.getProduct());
        return b;
    }
}
