package main.java.org.projects.chapter6;

import java.util.Scanner;

/*
Declare Method squareOfAsterisks (void)
Initialize side =1;
for side = 1 to side less than or equal to side
    initialize row =1
    for row =1 to row less than or equal to side
    Print '*'
Print new line
    then Test to apply
 */
public class SquareOfAsterisks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Square the system should display: ");
        int side = input.nextInt();
        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side){
       for (int row = 1; row <= side; row++ ){

           for (int column =1; column <= side; column++)
               System.out.print('*');
           System.out.println();

           }
       }
    }
