package main.java.org.projects.chapter6;

import java.util.Scanner;

/*
a. Declare method to calculate integer part when a is divided by b
b. Declare method to calculate integer remainder  when a % b
c.Use a. and b. to display digits input from user
Initialize count = 0;
while number !=0
    number /=10
    count++

 */
public class SeparatingDigits {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Separating Digits");
        System.out.print("Enter an integer between 1 and 99999: ");
        int integer = input.nextInt();
        while (integer < 1 || integer > 99999) {
            System.out.print("Enter integer between 1 and 99999: ");
            integer = input.nextInt();
        }
        displayDigits(integer);

    }

    public static int integerPart(int a, int b) {
        return a / b;
    }

    public static int remainderPart(int a, int b) {
        return a % b;
    }


    public static void displayDigits(int integer) {
int number = integer;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
switch (count) {
    case 1:
        System.out.printf("%d  ",remainderPart(integer,10));
        break;
    case 2:
        System.out.printf("%d  ",integerPart(integer,10));
        System.out.printf("%d  ",remainderPart(integer,10));
        break;
    case 3:
        System.out.printf("%d  ",integerPart(integer,100));
        System.out.printf("%d  ",remainderPart(integerPart(integer,10),10));
        System.out.printf("%d  ",remainderPart(integer, 10));
        break;
    case 4:
        System.out.printf("%d  ",integerPart(integer,1000));
        System.out.printf("%d  ",remainderPart(integerPart(integer,100),10));
        System.out.printf("%d  ",remainderPart(integerPart(integer,10),10));
        System.out.printf("%d  ",remainderPart(integer, 10));
        break;
    case 5:
        System.out.printf("%d  ",integerPart(integer,10000));
        System.out.printf("%d  ",remainderPart(integerPart(integer,1000),10));
        System.out.printf("%d  ",remainderPart(integerPart(integer,100),10));
        System.out.printf("%d  ",remainderPart(integerPart(integer,10),10));
        System.out.printf("%d  ",remainderPart(integer, 10));
}
        System.out.println();

        }
}