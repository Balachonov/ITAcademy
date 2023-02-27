package task10.t01main;

import java.util.Scanner;

import static task10.t01main.Сonstants.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void firstMenu() {
        System.out.println(HELLO);
        System.out.println();
        System.out.println(ONE + " " + PRODUCT_LIST);
        System.out.println(TWO + " " + ORDER_LIST);
        System.out.println(ZERO + " " + EXIT);
        System.out.println();
        System.out.println(CHOICE);
        boolean isRight = true;
        while (isRight) {
            switch (Integer.parseInt(scanner.next())) {
                case ONE:
                    secondMenu();
                    isRight = false;
                    break;
                case TWO:
                    thirdMenu();
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

    public void secondMenu() {

    }

    public void thirdMenu() {

    }

    public void exit() {

    }
}
