public class Main {
    public static void main(String[] args) {

        public static final int size = 5;
    public static final char empty = '-';
    public static final char cross = 'X';
    public static final char zero = 'O';

    public static void main(String[] args) {
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = empty;
            }
        }

        Scanner scanner = new Scanner(System.in);

        boolean isCrossTurn = true;

        while (true) {
            printField(field);
            System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
            String input = scanner.nextLine(); // "2 3"
            String[] parts = input.split(" "); // ["2" , "3"]
            int r = Integer.parseInt(parts[0]) - 1; // 2-1 = 1
            int c = Integer.parseInt(parts[1]) - 1; // 3-1 = 2

            if (field[r][c] != empty) {
                System.out.println("Сюда ходить нельзя");
                continue;
            }

            field[r][c] = isCrossTurn ? cross : zero;
            if (isWin(field, isCrossTurn ? cross : zero)) {
                printField(field);
                System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                break;
            } else {
                isCrossTurn = !isCrossTurn;

            }
        }

        System.out.println("Игра закончена!");

    }

    public static boolean isWin(char[][] field, char player) {
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player)
            return true;
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player)
            return true;
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player)
            return true;

        if (field[0][0] == player && field[1][0] == player && field[2][0] == player)
            return true;
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player)
            return true;
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player)
            return true;

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player)
            return true;
        return field[2][0] == player && field[1][1] == player && field[0][2] == player;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


}

//        int[][][] arrThree = new int[3][4][2];
//        System.out.println(Arrays.deepToString(arrThree));

//        int[][] arri = new int[3][5];// создание массива в массиве с 3мя пустыми ячейками со значением 0
//        arri[1] = new int[]{1};
////        arri[0] = new int[]{0,2,4};
////        arri[1] = new int[]{1};
////        arri[2] = new int[]{31,44};
//        System.out.println(Arrays.deepToString(arri));

        //System.out.println(arri[1]);

//        String[] arrs = {"Hello","!","World"};
//        for (int i = 0; i<arrs.length; i++) {
//            System.out.println(arrs[i]);
//        }
//        int[][] arri = {{0,2,4},{1},{31,44}};
//        arri[2][0]=55;
//        for (int i=0; i< arri.length;i++) {
//            for (int j = 0; j < arri[i].length; j++) {
//                System.out.println(arri[i][j]);
//            }
//
//        }
//        System.out.println(Arrays.toString(arri[2]));
//        System.out.println(arri[2][0]);
//        arri[2] = new int[3]; // во вторая ячейку массива массивов создается ссылка на новый массив
//        System.out.println(Arrays.deepToString(arri));// более детальный вывод двухмерного массива

    }

    public static final int size = 3;
    public static final char empty = '_';
    public static final char cross = 'x';
    public static final char zero = '0';


}
