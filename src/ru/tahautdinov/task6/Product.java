package ru.tahautdinov.task6;

public class Product {
    private String name;
    private String contractor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", contractor='" + contractor + '\'' +
                '}';
    }

    public Product(String name, String contractor) {
        this.name = name;
        this.contractor = contractor;
    }
}

