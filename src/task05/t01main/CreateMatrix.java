package task05.t01main;

public final class CreateMatrix {
    public static String[][] matrix = createMatrix();

    private static String[] createArray() {
        String[] tempArray = new String[100];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = RandomInArray.randomString();
        }
        for (int i = 2; i < tempArray.length; i += 3) {
            tempArray[i] = RandomInArray.randomDouble();
        }
        return tempArray;
    }

    private static String[][] createMatrix() {
        String[][] matrix = new String[10][10];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = createArray()[count++];
            }
        }
        return matrix;
    }
}
