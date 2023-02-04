package task05.t01main;

import java.util.Arrays;

import static task05.t01main.Constants.*;

public class ArrayCreate {

    public String[] createFirstDiagonal() {
        String[] firstDiagonal = new String[CreateMatrix.matrix.length];
        int countFirst = 0;
        for (int i = 0; i < CreateMatrix.matrix.length; i++) {
            firstDiagonal[countFirst] = CreateMatrix.matrix[i][i];
            countFirst++;
        }
        return firstDiagonal;
    }

    public String[] createSecondDiagonal() {
        String[] secondDiagonal = new String[CreateMatrix.matrix.length];
        int countSecond = 0;
        for (int i = 0; i < CreateMatrix.matrix.length; i++) {
            secondDiagonal[countSecond] = CreateMatrix.matrix[i][9 - i];
            countSecond++;
        }
        return secondDiagonal;
    }

    public void equalsDiagonalArray() {
        if (Arrays.equals(createFirstDiagonal(), createSecondDiagonal())) {
            System.out.println(EQUALS_ARRAY_TRUE);
        } else {
            System.out.println(EQUALS_ARRAY_FALSE);
        }
    }

    public String[] concatDiagonalArray() {
        String[] concatDiagonalArray = Arrays.copyOf(createFirstDiagonal(),
                createFirstDiagonal().length + createSecondDiagonal().length);
        System.arraycopy(createSecondDiagonal(), 0, concatDiagonalArray,
                createFirstDiagonal().length, createSecondDiagonal().length);
        return concatDiagonalArray;
    }

    public void printConcatDiagonalArray() {
        for (String s : concatDiagonalArray()) {
            System.out.print(s + " ");
        }
    }

    public void toSBDouble() {
        int count = 0;
        StringBuilder strBuilder = new StringBuilder();
        for (String s : concatDiagonalArray()) {
            if (isNumeric(s)) {
                count++;
            } else {
                strBuilder.append(s);
                System.out.print(strBuilder.substring(1, 4) + ",");
                strBuilder.setLength(0);
            }
        }
        System.out.println();
        double[] arrayDouble = new double[count];
        int tempContainer = 0;
        for (String s : concatDiagonalArray()) {
            if (isNumeric(s)) {
                arrayDouble[tempContainer] = Math.round(Double.parseDouble(s));
                tempContainer++;
            }
        }
        for (double v : arrayDouble) {
            System.out.print(v + "_");
        }
        System.out.println();
    }

    public void printMatrix() {
        for (String[] strings : CreateMatrix.matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private boolean isNumeric(String containerDiagonalArray) {
        return containerDiagonalArray != null && containerDiagonalArray.matches("[-+]?\\d*\\.?\\d+");
    }
}
