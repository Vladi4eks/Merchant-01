package app;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

public class App {

    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;

    public static void main(String[] args) {
        initVars();
        showData(processData());
    }

    private static void initVars() {
        merchantName = "Bob";
        email = "bobs@mail.com";
        phone = "059-123-4567";
        productName = "Bayraktar";
        quantity = 5000;
        price = 50000;
    }

    private static String processData() {
        return null;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
