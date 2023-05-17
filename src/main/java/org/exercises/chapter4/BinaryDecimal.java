package main.java.org.example.chapter4;

import java.util.Scanner;

/*
Top: Print the decimal equivalent of a binary integer input from a user
First Refinement:
Initialize variables
Input Integer, confirm if binary, pick off each digit and convert to decimal
Prints Decimal value
Second Refinement:
Initialize variables sum
Prompt user to input a binary integer
Input binary integer

While not a binary integer
    Print enter a binary integer
    Input binary integer

while input is greater than zero
    count number of digit
    i.e. length of binary number
    count
While input is less than or equal to length
    int  x =1;
    y = (input % 10^(x+1)/10^x);
    if y is not equal to 1 or 0;
        Print "Error! Please enter a binary integer"
    else
        z = y * 2 ^(x-1);
        sum += z;
    x++;

Print Decimal of Binary (sum)
 */
public class BinaryDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int length = 0;
        int count = 1, p=10, n=1, b=1, v, d;

        System.out.print("Converting Binary Number to Decimal\nPlease enter a binary integer: ");
        int binary = input.nextInt();
        int number = binary;

        while (number != 0) {
            number /= 10;
            System.out.println(number);
            length += 1;
        }

        while (count <= length)
        {

            if (count !=1)
            {
             p *= 10;
             n *= 10;
             b *=2;
            }

            v = ((binary % p) / n);
            if(v >=2 ){ System.out.println("Not a binary number");
                System.out.print("Converting Binary Number to Decimal\nPlease enter a binary integer: ");
                binary = input.nextInt();
            break;} else {


                d = v * b;
                sum += d;

                count++;
            }
        }
        System.out.printf("Decimal Equivalent of %d is %d.\n", binary, sum);
    }
}