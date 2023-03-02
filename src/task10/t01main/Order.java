package task10.t01main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static task10.t01main.ProductList.productsList;
import static task10.t01main.Constants.*;

public class Order {
    public static ArrayList<Product> ordersList = new ArrayList<>();
    private static final String DATA_ORDER = setDataOrder();
    private static final long ID_ORDER = setId();

    public static void addToOrder(long id) {
        for (Product product : productsList) {
            if (product.getID_PRODUCT() == id) {
                ordersList.add(product);
            }
        }
    }

    public static void removeToOrder(long id) {
        for (Product product : productsList) {
            if (product.getID_PRODUCT() == id) {
                ordersList.remove(product);
            }
        }
    }

    public static void printOrder() {
        System.out.println(ORDER + "\n");
        for (Product product : ordersList) {
            System.out.println(BOOK_NAME + product.getNAME() + ID + product.getID_PRODUCT());
        }
        System.out.println("\n" + DATE_ORDER + DATA_ORDER + "\n" + ID + ID_ORDER + "\n");
    }

    public static String getDATA_ORDER() {
        return DATA_ORDER;
    }

    public static long getID_ORDER() {
        return ID_ORDER;
    }

    private static long setId() {
        return (long) (Math.random() * 1000000000);
    }

    private static String setDataOrder() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        return format.format(date);
    }
}
