public class Main {
    public static void main(String[] args) {

        char[][] field = new char[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = empty;
            }
        }
        print(field);

        public static void print ( char[][] field){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
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
