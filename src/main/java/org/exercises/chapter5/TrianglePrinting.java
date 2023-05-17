package main.java.org.example.chapter5;
/*
Print triangle patterns
Initialize count =1
for count =1 til 4 increment count

A.
Initialize row, column
Print 10 row of stars with for
for row till 10 (increment)
    at each row, print number of stars equal to row number
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
public class TrianglePrinting {
    public static void main(String[] args) {
        int row, column;
//(a)
        for (row = 1; row <= 10; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
//(b)
        for (row = 10; row >= 1; row--)
        {
            for (column = 1; column <= row; column++) {
                System.out.print('*');
            }
            System.out.println();
        }

//(c)
        for (row =10; row >=1; row--) {
            for (column = 1; column <= (10 - row); column++) {

                System.out.print(' ');
            }
            for (column = 1; column <= row; column++) {

                System.out.print('*');
            }
            System.out.println();
        }
//(d)
        for (row =1; row <=10; row++) {
            for (column = 1; column <= (10 - row); column++) {

                System.out.print(' ');
            }
            for (column = 1; column <= row; column++) {

                System.out.print('*');
            }
            System.out.println();
        }

        }

    }
