package main.java.org.projects.chapter4;
//Top: Display a square of a particular length ender by the user (length should be between 1 - 20) made of asterisks
//First Refinement: Initialize variables
//input length of sides, and display the square both the first row and last row and the middle
//
//Second refinement:
//Initialize sides =0; initialize counter = sides;
//store asterisk with star
//store space with space;

//prompt user to input length of square
//Input square-length
//
// While counter is equal to sides
//      Print first row and last row with asterisks
//          (int fullAsterisks =1)
//          if (int fullAsterisks == 1 || fullAsterisks == sides)
//         { while fullAsterisks <= sides
//              print star
//                 ++fullAsterisks}
//      else
//          Print other rows with asterisk (space ) asterisks
//              int asterisk&space = 1
//              if asterisk$space == 1 || asterisk&space == sides
//              print star
//              else
//                  while asterisk&space <=side
//                         print Space
//
//
//

import java.util.Scanner;

public class AsteriskSquare {
    public static void main(String[] args) {
        int sides = 0;
        String star = "*";
        String space = " ";
        int counter = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of square you want displayed: ");
        sides = input.nextInt();
//        if (sides < 1)
//            sides =1;
//        else if (sides > 20)
//            sides = 20;
        while (counter <= sides)
        {
            int fullAsterisks = 1;
            if (fullAsterisks == 1 || fullAsterisks == sides)
                {   while (fullAsterisks <= sides)
                    {
                        System.out.print(star);
                        ++fullAsterisks;
                    }
                }
            else
            {
                int asteriskSpace = 1;
                if (asteriskSpace == 1 || asteriskSpace == sides)
                {
                    System.out.print(star);
                }

                else
                {
                    while (asteriskSpace < sides)
                    {
                        System.out.print(space);
                        ++asteriskSpace;
                    }
                }

            }
            ++counter;
        }

    }
}


