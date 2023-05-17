package main.java.org.example.chapter6;

import java.util.Scanner;

/*
use switch statement to select any the value that falls with the user response
 */
public class QualityPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Student's Grade System\nInput Student's average: ");
        int average = input.nextInt();
        qualityPoints(average);
    }
    public static void qualityPoints (int average){
        int result;
        switch (average/10){
            case 9:
                 result = 4;
                break;
            case 8:
               result = 3;
                break;
            case 7:
                result = 2;
                break;
            case 6:
                result =1;
                break;
            default:
                result = 0;
        }

        System.out.printf("Student's average is: %d\n", result);
    }


}