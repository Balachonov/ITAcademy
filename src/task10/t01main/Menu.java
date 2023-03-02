package task10.t01main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import static task10.t01main.ProductList.*;
import static task10.t01main.Order.*;
import static task10.t01main.Constants.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);

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
                case ONE -> {
                    productListMenu();
                    isRight = false;
                }
                case TWO -> {
                    productDescriptionMenu();
                    isRight = false;
                }
                case THREE -> {
                    orderMenu();
                    isRight = false;
                }
                case ZERO -> {
                    exit();
                    isRight = false;
                }
                default -> System.out.println(TRUE_CHOICE);
            }
        }
    }

    private void productListMenu() {
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
            Order.addToOrder(choice);
            addMenu();
        }
    }

    private void addMenu() {
        System.out.println();
        System.out.println(ONE + " " + BACK);
        System.out.println(TWO + " " + ADD_BOOK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE -> {
                    firstMenu();
                    isRight = false;
                }
                case TWO -> {
                    productListMenu();
                    isRight = false;
                }
                case ZERO -> {
                    exit();
                    isRight = false;
                }
                default -> System.out.println(TRUE_CHOICE);
            }
        }
    }

    private void productDescriptionMenu() {
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
                case ONE -> {
                    firstMenu();
                    isRight = false;
                }
                case ZERO -> {
                    exit();
                    isRight = false;
                }
                default -> System.out.println(TRUE_CHOICE);
            }
        }
    }

    private void orderMenu() {
        Order.printOrder();
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
            Order.removeToOrder(choice);
            removeMenu();
        }
    }

    private void removeMenu() {
        System.out.println();
        System.out.println(ONE + " " + BACK);
        System.out.println(TWO + " " + REMOVE_BOOK);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE -> {
                    firstMenu();
                    isRight = false;
                }
                case TWO -> {
                    orderMenu();
                    isRight = false;
                }
                case ZERO -> {
                    exit();
                    isRight = false;
                }
                default -> System.out.println(TRUE_CHOICE);
            }
        }
    }

    private void exit() {
        System.out.println();
        System.out.println(ONE + " " + YES);
        System.out.println(TWO + " " + NO);
        System.out.println();
        System.out.println(SURE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE -> {
                    try {
                        saveFilesOrderAndProduct();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    isRight = false;
                }
                case TWO -> {
                    firstMenu();
                    isRight = false;
                }
                default -> System.out.println(TRUE_CHOICE);
            }
        }
    }

    private void saveFilesOrderAndProduct() throws IOException {
        File productFile = Path.of("resources", "productList.txt").toFile();
        File orderFile = Path.of("resources", "orderList.txt").toFile();
        try (var writerOne = new BufferedWriter(new FileWriter(productFile, true));
             var writerTwo = new BufferedWriter(new FileWriter(orderFile, true))) {
            for (Product product : productsList) {
                writerOne.append(BOOK_NAME).append(product.getNAME());
                writerOne.newLine();
                writerOne.append(DATE_PUBLICATION).append(product.getDATA_PUBLICATION());
                writerOne.newLine();
                writerOne.append(ID).append(String.valueOf(product.getID_PRODUCT()));
                writerOne.newLine();
                writerOne.append(DESCRIPTION).append(product.getDESCRIPTION());
            }

            for (Product product : ordersList) {
                writerTwo.append(BOOK_NAME).append(product.getNAME());
                writerTwo.newLine();
                writerTwo.append(DATE_PUBLICATION).append(product.getDATA_PUBLICATION());
                writerTwo.newLine();
                writerTwo.append(ID).append(String.valueOf(product.getID_PRODUCT()));
                writerTwo.newLine();
                writerTwo.append(DESCRIPTION).append(product.getDESCRIPTION());
            }
            writerTwo.newLine();
            writerTwo.append(DATE_ORDER).append(Order.getDATA_ORDER());
            writerTwo.newLine();
            writerTwo.append(ID).append(String.valueOf(getID_ORDER()));
        }
    }
}





