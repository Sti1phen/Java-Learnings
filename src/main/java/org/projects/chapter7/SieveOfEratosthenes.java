package main.java.org.projects.chapter7;

import java.util.Arrays;
/*
Create a boolean array with 1000 elements
Initialize all element to true using Arrays.fill

from array index 2, set elements whose index are multiple of index which is true equal to false
i.e. for index 2: prime.length
if primeNumbers[index] = true
    for isPrime = index +1: till prime.length
    if (isPrime % index == 0)
    primeNumber[isPrime] = false

Use method display primeNumber
Create method display primeNumber
argument boolean array PrimeNumber
for index = 2 : length of array
if primeNumber[index] == true
Print index
Print newline
*/
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] primeNumbers = new boolean[1000];
        Arrays.fill(primeNumbers, true);

        for (int index = 2; index < primeNumbers.length; index++) {
            if (primeNumbers[index]) {
                for (int isNotPrime = index + 1; isNotPrime < primeNumbers.length; isNotPrime++) {
                    if (isNotPrime % index == 0)
                        primeNumbers[isNotPrime] = false;
                }
            }
        }
        displayPrimeNumbers(primeNumbers);
    }

    public static void displayPrimeNumbers(boolean[] array) {
        int count = 0;
        System.out.println("Prime numbers between 2 and 999 are: ");
        for (int index = 2; index < array.length; index++) {
            if (array[index]) {
                System.out.printf("%d\t", index);
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
        System.out.println();
        }
    }