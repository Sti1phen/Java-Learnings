package main.java.org.projects.chapter6;

import java.util.Scanner;

/*
Modify Square of Any Character to take any parameter and read the character from the user
 */
public class SquareOfAnyCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character and the side of Square you want displayed 'e.g. $ 6': ");
        char fill = input.next().charAt(0);
        int side = input.nextInt();
        squareOfAnyCharacter(side, fill);
    }

    public static void squareOfAnyCharacter(int side, char fillCharacter){
        for (int row = 1; row <= side; row++ ){

            for (int column =1; column <= side; column++)
                System.out.print(fillCharacter);
            System.out.println();

        }
    }


}
