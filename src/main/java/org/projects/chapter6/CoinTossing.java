package main.java.org.projects.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

/*
Create static final random toss generator

Create a String menu option
Prompt User to choose either Toss Coin or End Game
Input user response = input
String tossCoin = "Toss Coin"
String endGame = "End Game"
Coin Toss;

while input equals Toss Coin

public static int flip()
Create an enum type Coin with HEADS and TAILS
int flip = randomNumber
if flip = 1
    Toss = Coin.HEADS
if flip = 0
    Toss = Coin.TAILS
 */
public class CoinTossing {
    private static final SecureRandom tossCoin = new SecureRandom();
    private enum Coin {HEADS, TAILS}

    public static void main(String[] args) {
        int head = 0, tail = 0;
        Scanner input = new Scanner(System.in);
        String playGame = "Toss Coin";
        String endGame = "End Game";
        System.out.print("Menu Option\nEnter Toss Coin to continue tossing coin or End Game to end the game: ");
        String option = input.nextLine();
        while (option.equalsIgnoreCase(playGame)) {
               Coin flip = flip();
                if (flip == Coin.HEADS)
                    ++head;
                else
                    ++tail;

            System.out.printf("Number of Heads: %d\nNumber of Tails: %d\n", head, tail);
            System.out.print("Menu Option\nEnter Toss Coin to continue tossing coin or End Game to end the game: ");
            option = input.nextLine();
        }
        if (option.equalsIgnoreCase(endGame))
            System.out.println();
    }
    public static Coin flip(){

        int toss = tossCoin.nextInt(2);
        if (toss == 1)
           return Coin.HEADS;
        return Coin.TAILS;
    }

}