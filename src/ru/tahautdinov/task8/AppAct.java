package ru.tahautdinov.task8;

import java.time.LocalDate;

public class AppAct {
    public static void main(String[] args) {
        Dogovor first = new Dogovor(12, "12.12.2018", new String[2]);
        System.out.println(first);
        System.out.println(Convertation.convert(first));
    }

}
