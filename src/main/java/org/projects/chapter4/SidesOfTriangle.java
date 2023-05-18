package main.java.org.projects.chapter4;

import java.util.Scanner;

/*
The sides of a triangle rule asserts that the sum of the lengths of
any two sides of a triangle has to be greater than the length of the third side.

Determine whether 3 non-zero input from user represent sides of a triangle

initialize count =3

Prompt user to enter 3 non-zero integers that can form sides of a triangle
Input user 3 non zero input
a, b, c;

if a + b <= c or b + c <= a or a + c <= b
    Print the integers entered cannot form sides of a triangle
else
    Print the integers entered are sides of a triangle
 */
public class SidesOfTriangle {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle (separate input by space): ");
        x = Integer.parseInt(input.next());
        y = Integer.parseInt(input.next());
        z = Integer.parseInt(input.next());
        while (x <= 0 || y <= 0 || z <= 0) {
            System.out.print("Incorrect input! Enter three sides of a triangle (separate input by space) ");
            x = Integer.parseInt(input.next());
            y = Integer.parseInt(input.next());
            z = Integer.parseInt(input.next());
        }

        int a = x + y;
        int b = x + z;
        int c = y + z;

        if (a <= z || b <= y || c <= x)
            System.out.print("The lengths entered cannot form the sides of a triangle\n");
        else System.out.print("The length of sides entered are the sides of a triangle\n");
    }
}

