package main.java.org.projects.chapter5;
/*
Print triangle patterns
Initialize count =1
for count =1 til 4 increment count

A.
Initialize row, column
Print 10 row of stars with for
for row till 10 (increment)
    at each row, print number of stars equal to row number
    Print number of blank spaces equals 10 -row

    for row till 10 (decrement)
    at each row, print number of stars equal to row number

    for row till 10 (decrement)
    at each row,
    Print 10 - (row) spaces
    print number of stars equal to row number

    for row till 10 (increment)
    at each row,
    Print 10 - (row) spaces
    print number of stars equal to row number

    move to next row
Print new line

B.
Print 10 row of stars with for
for row till 10 (decrement)
    at each row, print number of stars equal to row number
    move to next row
Print new line

C.
Print 10 row of stars with for
for row till 10 (decrement)
    at each row,
    Print 10 - (row) spaces
    print number of stars equal to row number
    move to next row
Print new line

D.
Print 10 row of stars with for
for row till 10 (increment)
    at each row,
    Print 10 - (row) spaces
    print number of stars equal to row number
    move to next row
Print new line
 */
public class ModifiedTrianglePrinting {

    public static void main(String[] args) {
        int row, column, y, z, x, g, i, r, k;
//(a)
        for (row = 1; row <= 10; row++) {
            for (column = 1; column <= row; column++)
                System.out.print('*');
            for (i = 1; i <= (10 - row); i++)
                System.out.print(' ');
            for (y = 10; y >= row; y--)
                System.out.print('*');
            for (z = 1; z <= (row - 1); z++)
                System.out.print(' ');
            for (x = 1; x <= (row - 1); x++)
                System.out.print(' ');
            for (g = 10; g >= row; g--)
                System.out.print('*');
            for (r = 9; r >= row; r--)
                System.out.print(' ');
            for (k = 1; k <= row; k++)
                System.out.print('*');

            System.out.println();
        }
    }
}