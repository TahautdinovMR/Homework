package ru.tahautdinov.task7;

public enum Drink {
    WATER("Вода") , COFFEE("Кофе"), TEA("Чай"), JUICE("Сок");
    String title;

    Drink(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
}
