package main.java.org.example.chapter5;
/*
Print Diamond Shape
Initialize row =1,  rows of diamond
Divide actual row given by 2 and plus 1 = answer
for row1 to 5
    Print space equals answer minus row
    Print star equals number of row
    Print star equals row -1 (in addition on a row)
    Print next line
for row row/2 to 1
    Print space equals answer minus row
    Print star equals number of row
    Print star equals row -1 (in addition on a row)
    Print next line
 */
public class DiamondPrinting {
    public static void main(String[] args) {
        int row, column;
        for (row =1; row <= (9/2 +1); row++) {
            for (column = 1; column <= 5 - row; column++)
                System.out.print(' ');
            for (column = 1; column <= row; column++)
                System.out.print('*');
            for (column =1; column <=(row-1); column++)
                System.out.print('*');
            System.out.println();
            }
            for (row=(9/2); row >= 1; row--){
                for (column = 1; column <=5-row; column++)
                    System.out.print(' ');
                for (column = 1; column <= row; column++)
                    System.out.print('*');
                for (column =1; column <=(row-1); column++)
                    System.out.print('*');
                System.out.println();
                }

    }
}