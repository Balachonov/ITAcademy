package task10.t01main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import static task10.t01main.ProductList.productsList;
import static task10.t01main.Сonstants.*;

public class Order {

    public static ArrayList<Product> ordersList = new ArrayList<>();
    public final String DATA_ORDER = setDataOrder();
    public final long ID_ORDER = setId();

    public void addToOrder(long id) {
        for (Product product : productsList) {
            if (product.getID_PRODUCT() == id) {
                ordersList.add(product);
            }
        }
    }

    public void printOrder() {
        System.out.println(ORDER + "\n");
        for (Product product : ordersList) {
            System.out.println(BOOK_NAME + product.getName() + ID + product.getID_PRODUCT());
        }
        System.out.println("\nДата заказа: " + DATA_ORDER + "\n" + "ID заказа: " + ID_ORDER + "\n");
    }

    public void removeToOrder(long id) {
        for (Product product : productsList) {
            if (product.getID_PRODUCT() == id) {
                ordersList.remove(product);
            }
        }
    }

    private long setId() {
        return (long) (Math.random() * 1000000000);
    }

    private String setDataOrder() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        return format.format(date);
    }
}
