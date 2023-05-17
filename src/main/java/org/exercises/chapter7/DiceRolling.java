package main.java.org.example.chapter7;

import java.util.Random;

/*
Create method rollingDice
return sum
declare array frequency in main method
increment frequency index = sum
Tabulate result
 */
public class DiceRolling {
    public static void main(String[] args) {
        int [] tally = new int [13];
        int sum;
        for (int counter = 1; counter <= 36000000; counter++){
            sum = diceRolling();
            ++tally[sum];
        }
        display(tally);

    }

    public static int diceRolling(){
        Random dice = new Random();
        int die1 = 1 + dice.nextInt(6);
        int die2 = 1 + dice.nextInt(6);
        return die1 + die2;
    }
    public static void display(int [] array){
        System.out.println("Sum of die\t\tTally");
        for (int counter = 0; counter < array.length; counter++){
            if (counter > 1) {
                System.out.printf("%10d\t\t%5d", counter, array[counter]);
                System.out.println();
            }
        }
    }
}