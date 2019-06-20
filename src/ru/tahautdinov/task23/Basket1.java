

package ru.tahautdinov.task23;
import java.util.List;


public interface Basket1 {

        void addProduct(String product, int quantity);

        void removeProduct(String product);

        void updateProductQuantity(String product, int quantity);

        void clear();

        List<String> getProducts();

        int getProductQuantity(String product);


}
