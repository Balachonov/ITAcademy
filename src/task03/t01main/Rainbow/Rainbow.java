package task03.t01main.Rainbow;

import java.util.Scanner;

public class Rainbow {
    public static final String RED = "красн";
    public static final String ORANGE = "оранжев";
    public static final String YELLOW = "желт";
    public static final String GREEN = "зелен";
    public static final String BLUE = "голуб";
    public static final String INDIGO = "син";
    public static final String VIOLET = "фиолетов";

    public void colorDetection(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("""
                        Привет! Сегодня ты поработаешь колористом. Правда на выбор только 7 цветов радуги. Напомню:
                        1 - %sый
                        2 - %sый
                        3 - %sый
                        4 - %sый
                        5 - %sой
                        6 - %sий
                        7 - %sый.                    
                        """,
                RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET);
        System.out.print("Пора сделать свой выбор. Введи номер первого цвета: ");
        int firstColorNumber = Integer.parseInt(scanner.next());
        System.out.print("Ты хочешь выбрать еще один цвет? Ответь ДА или НЕТ: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("да"))
        {
            System.out.print("Отлично. Введи номер второго цвета: ");
            int secondColorNumber = Integer.parseInt(scanner.next());
            System.out.print("Выбор сделан. Твой цвет - ");
            printTwoColor(firstColorNumber, secondColorNumber);
        }
        else {
            System.out.print("Выбор сделан. Твой цвет - ");
            printOneColor(firstColorNumber);
        }
    }

    private void printOneColor(int firstColorNumber){

            switch (firstColorNumber){
                case 1:
                    System.out.println(RED + "ый.");
                    break;
                case 2:
                    System.out.println(ORANGE + "ый.");
                    break;
                case 3:
                    System.out.println(YELLOW + "ый.");
                    break;
                case 4:
                    System.out.println(GREEN + "ый.");
                    break;
                case 5:
                    System.out.println(BLUE + "ой.");
                    break;
                case 6:
                    System.out.println(INDIGO + "ий.");
                    break;
                case 7:
                    System.out.println(VIOLET + "ый.");
                    break;
            }
    }

    private void printTwoColor(int firstColorNumber, int secondColorNumber){

        switch (secondColorNumber){
            case 1:
                System.out.print(RED + "о-");
                break;
            case 2:
                System.out.print(ORANGE + "о-");
                break;
            case 3:
                System.out.print(YELLOW + "о-");
                break;
            case 4:
                System.out.print(GREEN + "о-");
                break;
            case 5:
                System.out.print(BLUE + "о-");
                break;
            case 6:
                System.out.print(INDIGO + "е-");
                break;
            case 7:
                System.out.print(VIOLET + "о-");
                break;
        }
        printOneColor(firstColorNumber);
    }

}
