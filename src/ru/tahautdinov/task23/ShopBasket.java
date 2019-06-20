package ru.tahautdinov.task23;

import java.util.ArrayList;
import java.util.List;

public class ShopBasket implements Basket1{

    public List<String> prod = null;
    public List<Integer> quant = null;

    public ShopBasket() {
        List<String> prod = new ArrayList<>();
        List<Integer> quant = new ArrayList<>();
    }



    public void addProduct(String product, int quantity) {
        prod.add(product);
        quant.add(quantity);

    }


    public void removeProduct(String product) {

        int a = prod.indexOf(product);
        prod.remove(product);
        quant.remove(a);


    }


    public void updateProductQuantity(String product, int quantity) {
        int a = prod.indexOf(product);
        quant.remove(a);
        quant.add(a, quantity);

    }


    public void clear() {
        prod.removeAll(prod);
        quant.removeAll(quant);

    }

    public List<String> getProducts(){

        return prod;

    }

    public int getProductQuantity(String product) {
        int a = prod.indexOf(product);
        return quant.get(a);

    }
}

