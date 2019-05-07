package ru.tahautdinov.task7;

public class VendingMachine {
    private Drink drink;
    int price;

    public VendingMachine(Drink drink, int price) {
        this.drink = drink;
        this.price = price;
    }

    public Drink getDrink() {
        return drink;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return drink.getTitle() + " " + price;
    }
}
