package dr.cart;

import org.springframework.format.annotation.NumberFormat;

public class Product {
    private String name;
    private String description;
    private double price;
    private int volume;
    private double sum;

    public Product() {
    }

    public Product(String name, String description, double price, int volume) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.volume = volume;
        this.sum = price * volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getSum() {
        return sum;
    }
}
