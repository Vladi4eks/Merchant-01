package app;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

// Модель объекта Продавца.
public class Merchant {

    private final String name;
    private final String phone;

    public Merchant(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
