package dr.cart;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CartService {
    private final List<Product> products = new LinkedList<>();

    public void addProducts(Product product){
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
