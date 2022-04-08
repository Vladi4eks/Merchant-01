package app;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

// Класс наследует класс-модель,
// и реализует интерфейс базового функционала Товара.
public class ProductA extends Product implements Sales {

    int quantity;
    double price;

    public ProductA(String name, int quantity, double price) {
        super(name);
        this.quantity = quantity;
        this.price = price;
    }

    public String infoProduct() {

        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(quantity, price));
        return "Товар: " + name + "\nОбъем продаж (грн.): " + resultSale;
    }

    @Override
    public double calcSales(int quantity, double price) {
        return quantity * price;
    }
}
