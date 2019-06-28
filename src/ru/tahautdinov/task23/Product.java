package ru.tahautdinov.task23;

public class Product {
    private String prod;

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    private int quant;

    public Product(String prod, int quant) {
        this.prod = prod;
        this.quant = quant;
    }
}
