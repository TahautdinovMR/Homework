package ru.tahautdinov.task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopBasket implements Basket1 {

    //public List<String> prod = null;
    //public List<Integer> quant = null;
    public List<Product> product = null;

    public ShopBasket() {
        product = new ArrayList<>();


    }


    public void addProduct(String product, int quantity) {
        Product prod = new Product(product, quantity);
        this.product.add(prod);


    }


    public void removeProduct(String product) {

        Iterator<Product> iterator = this.product.iterator();

        while (iterator.hasNext()) {
            Product a = iterator.next();
            if (a.getProd().equals(product)) {
                iterator.remove();
            }

        }


    }


    public void updateProductQuantity(String product, int quantity) {
        Iterator<Product> iterator = this.product.iterator();

        while (iterator.hasNext()) {
            Product a = iterator.next();
            if (a.getProd().equals(product)) {
                a.setQuant(quantity);
            }


        }
    }


    public void clear() {
        product.clear();


    }

    public List<String> getProducts() {

        List<String> pr = new ArrayList<>();
        for (Product a: product
             ) {String b = a.getProd();
             pr.add(b);

        }

        return pr;

    }

    public int getProductQuantity(String product) {
        Iterator<Product> iterator = this.product.iterator();

        while (iterator.hasNext()) {
            Product a = iterator.next();
            if (a.getProd().equals(product)) {
                return a.getQuant();
            }
        }
        return 0;

}}

