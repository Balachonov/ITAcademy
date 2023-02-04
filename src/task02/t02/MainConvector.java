package task02.t02;

import java.util.Scanner;
/*
            Двоично - десятичный конвектор чисел
 */
public class MainConvector {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное десятичное число");
        int inputDecimalNumber = Integer.parseInt(scanner.next());
        System.out.println("Введите положительное двоичное число");
        String inputBinaryNumber = scanner.next();

        SimpleConvectorBinary simpleConvectorBinary = new SimpleConvectorBinary();
        String simpleOutputBinary = simpleConvectorBinary.simpleConversionDecimalToBinary(inputDecimalNumber);
        int simpleOutputDecimal = simpleConvectorBinary.simpleConversionBinaryToDecimal(inputBinaryNumber);

        HardConvectorBinary hardConvectorBinary = new HardConvectorBinary();
        String hardOutputBinary = hardConvectorBinary.hardConversionDecimalToBinary(inputDecimalNumber);
        int hardOutputDecimal = hardConvectorBinary.hardConversionBinaryToDecimal(inputBinaryNumber);

        System.out.printf("""
                        Данные, полученные из простого конвектора:
                        Ваше введенное десятичное число - %s, его двоичное представление - %s
                        Ваше введенное двоичное число - %s, его десятичное представление - %s
                        ******************
                        """, inputDecimalNumber, simpleOutputBinary, inputBinaryNumber, simpleOutputDecimal);

        System.out.printf("""
                        Данные, полученные из самописного конвектора:
                        Ваше введенное десятичное число - %s, его двоичное представление - %s
                        Ваше введенное двоичное число - %s, его десятичное представление - %s
                        ******************
                        """, inputDecimalNumber, hardOutputBinary, inputBinaryNumber, hardOutputDecimal);
    }
}
