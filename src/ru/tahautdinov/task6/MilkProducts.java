package ru.tahautdinov.task6;

public class MilkProducts extends Product {
    private int size;
    private int price;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MilkProducts{" +
                "size=" + size +
                ", price=" + price +
                "} " + super.toString();
    }



    public MilkProducts(String name, String contractor, int size, int price) {
        super(name, contractor);
        this.size = size;
        this.price = price;
    }
}
