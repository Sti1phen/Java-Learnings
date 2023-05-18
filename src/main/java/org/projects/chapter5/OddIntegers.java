package main.java.org.projects.chapter5;
/*
Calculates the product of odd integers from 1 to 15
Initialize variable i =1;
product=1;

Use for statement
for (i<=15; i+=2)
    product *=i;

Print result
 */

public class OddIntegers {
    public static void main(String[] args) {
        int i,  product =1;

        for (i=1; i <= 15; i+=2)
            product *=i;
        System.out.printf("Product of odd numbers from 1 to 15 is: %d\n", product);
    }
}