package main.java.org.projects.chapter7;
/*

 */
public class SelfReview {
    public static void main(String[] args) {
//        final int ARRAY_SIZE = 10;
//        double sum = 0;
//        double[] array = new double[ARRAY_SIZE];
//        double element4 = array[3];
//        array[8] = 1.667;
//        array[5] = 3.333;
//        for (int x = 0; x < array.length; x++)
//            sum +=array[x];
//        System.out.printf("%.3f\n", sum);
//        int [][] table = new int[3][3];
//        System.out.printf("Number of element is: %d\n", table.length * table[0].length);
//        for (int x= 0; x < table.length; x++){
//            for (int y =0; y < table[x].length; y++)
//                table[x][y] = x + y;
//            }
//        displayArray(table);
//        }
//        public static void displayArray(int [][] array){
//            for (int[] ints : array) {
//                for (int anInt : ints)
//                    System.out.printf("%d   ", anInt);
//                System.out.println();
//            }
        int [][] t = new int [2][3];
        System.out.print("\t");
        for (int column = 0; column < t[0].length; column++)
            System.out.printf("%d\t", column);
        System.out.println();
        for (int row =0; row < t.length; row++) {
            System.out.printf("%d\t", row);
            for (int value : t[row])
                System.out.printf("%d\t", value);
            System.out.println();
        }
        }

    }