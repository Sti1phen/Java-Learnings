package main.java.org.projects.chapter6;

import java.util.Scanner;

/*

 */
public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Minimum Value\nEnter three (3) values (separate by one space): ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();

        System.out.printf("Minimum number is: %f\n", minimum(number1,number2,number3));

    }

    public static float minimum(float number1, float number2, float number3){
        return  Math.min(Math.min(number1, number2),number3);

    }

}