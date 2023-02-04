package task05.t01main;

import static task05.t01main.Constants.*;
import static task05.t01main.Constants.TASK_4;

public class ArrayRunner {
    ArrayCreate arrayCreate = new ArrayCreate();
    public void runArray() {
        System.out.println(TASK_1);
        System.out.println("Первая диагональ: ");
        for (int i = 0; i < arrayCreate.createFirstDiagonal().length; i++) {
            System.out.print(arrayCreate.createFirstDiagonal()[i] + " ");
        }
        System.out.println("\nПбочная диагональ:");
        for (int i = 0; i < arrayCreate.createSecondDiagonal().length; i++) {
            System.out.print(arrayCreate.createSecondDiagonal()[i] + " ");
        }
        System.out.print("\nКак вы видите ");
        arrayCreate.equalsDiagonalArray();
        System.out.println(TASK_2);
        System.out.println("Объединенный массив диагоналей:");
        arrayCreate.printConcatDiagonalArray();
        System.out.println("\n" + TASK_3);
        arrayCreate.toSBDouble();
        System.out.println(TASK_4);
        arrayCreate.printMatrix();
    }

}
