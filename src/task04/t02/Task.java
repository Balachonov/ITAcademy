package task04.t02;

import java.util.Scanner;

public class Task {
    public void multiplicationTable() {
        System.out.println("**** Таблица умножения ****");
        int count = 1;
        while (count < 11) {
            System.out.println(5 + " * " + Integer.toString(count) + " = " + 5 * count);
            count++;
        }
        System.out.println("");
    }

    public void sequenceNumbers() {
        System.out.println("**** Последовательность чисел ****");
        int number = 1;
        while (number <= 512) {
            System.out.print(number + " ");
            number = number * 2;
        }
        System.out.println("");
    }

    public void square() {
        System.out.println("**** Квадрат ****");
        int countY = 0;
        while (countY < 5) {
            int countX = 0;
            while (countX < 5) {
                System.out.print("*");
                countX++;
            }
            System.out.println("");
            countY++;
        }
        System.out.println("");
    }

    public void triangle() {
        System.out.println("**** Треугольник ****");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("");
    }

    public void sumAndMulti(){
        System.out.println("**** Сумма и произведение ****");
        int sum = 0;
        int multi = 1;
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            int temp1 = inputNumber;
            int temp2 = inputNumber;
            while (Integer.toString(temp1).length() > 1) {
                sum = sum + (temp1 % 10);
                temp1 = temp1 / 10;
            }
            while (Integer.toString(temp2).length() > 1) {
                multi = multi * (temp2 % 10);
                temp2 = temp2 / 10;
            }
            System.out.printf("""
                            Введенное число - %s
                            Сумма цифр числа - %s
                            Произведение цифр числа - %s
                            """,
                    inputNumber, sum, multi);
            System.out.println("");
        }
    }
}
