package ru.tahautdinov.task6;

public class CandyProducts extends Product {

    private int weight;
    private int price;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "CandyProducts{" +
                "weight=" + weight +
                ", price=" + price +
                "} " + super.toString();
    }

    public CandyProducts(String name, String contractor, int weight, int price) {
        super(name, contractor);
        this.weight = weight;
        this.price = price;
    }
}
