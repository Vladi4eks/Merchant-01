package app;

import java.util.Scanner;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

// Класс-входная точка в приложение.
public class App {

    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static MerchantA merchantA;
    static String infoMerchant;
    static String infoProduct;

    public static void main(String[] args) {
        initVars();
        showData(processData());
    }

    // Инициализация переменных
    private static void initVars() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        merchantName = scan.nextLine();

        System.out.println("Введите ваш номер телефона: ");
        phone = scan.nextLine();

        System.out.println("Введите ваш email: ");
        email = scan.nextLine();

        System.out.println("Введите имя товара: ");
        productName = scan.nextLine();

        System.out.println("Введите кол-во товара: ");
        quantity = scan.nextInt();

        System.out.println("Введите стоимость товара: ");
        price = scan.nextDouble();

        scan.close();
    }

    // Передача данных на обработку
    private static String processData() {
        merchantA = new MerchantA(merchantName, phone, email);
        infoMerchant = merchantA.infoMerchant();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(merchantA.calcBonus(sales));
        return infoMerchant + infoProduct + "\nБонус (грн.): " + roundBonus;
    }

    // Вывод данных
    private static void showData(String output) {
        System.out.println(output);
    }
}
