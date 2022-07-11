import java.util.Random;

public class Main {
    public static final int size = 8;

    public static void main(String[] args) {

        int[][] colors = new int[size][size];
        createArray(colors);
        System.out.println("Случайная Матрица");
        printMatrix(colors);
        System.out.println("Перевернутая Матрица на 90 градусов");
        printMatrix(turnArray(colors));
        System.out.println("Перевернутая матрица на 180 градусов");
        printMatrix(turnArray(turnArray(colors)));
        System.out.println("Перевернутая матрица на 270 градусов");
        printMatrix(turnArray(turnArray(turnArray(colors))));
    }

    public static void createArray(int[][] colors) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    public static void printMatrix(int[][] colors) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.format("%4d", colors[i][j]);

            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] turnArray(int[][] colors) {
        int[][] rotatedColors = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedColors[j][size - i - 1] = colors[i][j];

            }

        }
        return rotatedColors;
    }


}