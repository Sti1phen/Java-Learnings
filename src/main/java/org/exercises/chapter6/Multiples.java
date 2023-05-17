package main.java.org.example.chapter6;

import java.util.Scanner;

/*
Declare method as boolean with integer argument
Use remainder % to check if Multiple
Use if to output if multiple or not
 */
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a pair of integer where the first is a multiple of the second 'e.g. integer1 integer2': ");
        int multiple = input.nextInt();
        int factor = input.nextInt();
        System.out.println(isMultiple(multiple,factor));

    }


    public static boolean isMultiple(int multiple, int factor){
        boolean ismultiple;
        ismultiple = multiple % factor == 0;
       return ismultiple;
        }

    }

