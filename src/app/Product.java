package app;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

// Модель объекта Товара.
public class Product {

    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
