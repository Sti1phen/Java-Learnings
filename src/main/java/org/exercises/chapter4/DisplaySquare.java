package main.java.org.example.chapter4;
import java.util.Scanner;

//Top: Display a square of side l when user enter side of square
/*
initialize variables
input user square size, arrange the asterisks in the shape od a square of size l
display square of sides size l

Initialize
string "*", " ", counter =1, row, column
While counter is less than or equal to size
    if counter is 1 or size
    int row =1
        while row is less than or equal to size
        print star
        move to next row
        *****
    else
        int column 1
            while column is less than or equal size
            if column 1
                Print star
            if column == size
                Print star
                Print empty line(or go to next line)
            else Print Space
            move to next column
   move to next counter
 */
public class DisplaySquare {
    public static void main(String[] args) {
        int counter =1; int size;
        String star = "*"; String space = " ";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of square you want displayed: ");
        size = input.nextInt();
        if (size < 1)
            size = 1;
        if (size > 20)
            size = 20;
        while (counter <= size)
        {
            if (counter == 1 || counter ==size)
            {
                int row = 1;
                while (row <= size)
                {
                    System.out.print(star);
                    row++;
                }
                System.out.println();
            }
            else
            {
                int column =1;
                while (column <=size)
                {
                    if (column == 1)
                        System.out.print(star);
                    if (column == size)
                    {
                        System.out.print(star);
                        System.out.println();
                    }
                    else System.out.print(space);
                    column++;
                }


                }
                counter++;

                }

            }

        }