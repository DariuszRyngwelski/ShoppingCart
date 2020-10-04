package dr.cart;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CartService {
    private final List<Product> products = new LinkedList<>();
    private boolean state;
    public void addProducts(Product product){
        products.add(product);
    }

    public List<Product> getProducts() {
        if(!state){
            state=true;
            products.add(new Product("Bułka","Kaizerka",0.29,10));
        }

        return products;
    }
}
