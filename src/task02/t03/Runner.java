package task02.t03;

import java.util.Scanner;

public class Runner {
    public void doThemes(){
        System.out.println("Типы данных. Переменные. Операторы");
        System.out.println("");
    }

    public void lastDigitNumber(){
        System.out.printf("""
                        *** Вывести последнюю цифру числа ***
                        
                        Введите любое целое число: """);
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int lastDigitNumber = inputNumber%10;
        System.out.printf("""
                        Последняя цифра введенного вами числа - %s
                        
                        """,
                lastDigitNumber);
    }
}
