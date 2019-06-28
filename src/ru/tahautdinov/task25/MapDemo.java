package ru.tahautdinov.task25;

import java.util.*;

public class MapDemo implements Basket {

    Map<String, Integer> prod;

    public MapDemo() {
        prod = new HashMap<>();
    }



    @Override
    public void addProduct(String product, int quantity) {

        prod.put(product, quantity);

    }

    @Override
    public void removeProduct(String product) {
        prod.remove(product);

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

        prod.put(product, quantity);

    }

    @Override
    public void clear() {

        prod.clear();

    }

    @Override
    public List<String> getProducts() {
        Set<String> prodKeys = prod.keySet();
        List<String> listProd = new ArrayList(prodKeys);

        return listProd;
    }

    @Override
    public int getProductQuantity(String product) {
        int a = prod.get(product);
        return a;
    }
}
