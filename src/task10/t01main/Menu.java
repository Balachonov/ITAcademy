package task10.t01main;

import java.util.Scanner;

import static task10.t01main.ProductList.*;
import static task10.t01main.Сonstants.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Order order = new Order();

    public void firstMenu() {
        System.out.println(HELLO);
        System.out.println();
        System.out.println(ONE + " " + PRODUCT_LIST);
        System.out.println(TWO + " " + PRODUCT_DESCRIPTION);
        System.out.println(THREE + " " + ORDER_LIST);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE:
                    productListMenu();
                    isRight = false;
                    break;
                case TWO:
                    productDescriptionMenu();
                    isRight = false;
                    break;
                case THREE:
                    orderMenu();
                    isRight = false;
                    break;
                case ZERO:
                    exit();
                    isRight = false;
                    break;
                default:
                    System.out.println(TRUE_CHOICE);
                    break;
            }
        }
    }

    public void productListMenu() {
        for (Product product : productsList) {
            System.out.println(product.printNameId());
        }
        System.out.println();
        System.out.println(PRODUCT_TO_ORDER);
        System.out.println(ONE + " " + BACK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        long choice = Long.parseLong(scanner.next());
        if (choice == ONE) {
            firstMenu();
        }
        if (choice == ZERO) {
            exit();
        } else {
            order.addToOrder(choice);
            addMenu();
        }
    }

    public void addMenu(){
        System.out.println();
        System.out.println(ONE + " " + BACK);
        System.out.println(TWO + " " + ADD_BOOK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE:
                    firstMenu();
                    isRight = false;
                    break;
                case TWO:
                    productListMenu();
                    isRight = false;
                    break;
                case ZERO:
                    exit();
                    isRight = false;
                    break;
                default:
                    System.out.println(TRUE_CHOICE);
                    break;
            }
        }
    }

    public void productDescriptionMenu() {
        for (Product product : productsList) {
            System.out.print(product);
        }
        System.out.println();
        System.out.println(ONE + " " + BACK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE:
                    firstMenu();
                    isRight = false;
                    break;
                case ZERO:
                    exit();
                    isRight = false;
                    break;
                default:
                    System.out.println(TRUE_CHOICE);
                    break;
            }
        }
    }

    public void orderMenu() {
        order.printOrder();
        System.out.println();
        System.out.println(PRODUCT_OUT_ORDER);
        System.out.println(ONE + " " + BACK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        long choice = Long.parseLong(scanner.next());
        if (choice == ONE) {
            firstMenu();
        }
        if (choice == ZERO) {
            exit();
        } else {
            order.removeToOrder(choice);
            removeMenu();
        }
    }

    public void removeMenu(){
        System.out.println();
        System.out.println(ONE + " " + BACK);
        System.out.println(TWO + " " + REMOVE_BOOK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE:
                    firstMenu();
                    isRight = false;
                    break;
                case TWO:
                    orderMenu();
                    isRight = false;
                    break;
                case ZERO:
                    exit();
                    isRight = false;
                    break;
                default:
                    System.out.println(TRUE_CHOICE);
                    break;
            }
        }
    }

    public void exit() {
        System.out.println("fdfsfv");
    }


}
