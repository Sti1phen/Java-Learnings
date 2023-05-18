package main.java.org.projects.chapter7;

import java.security.SecureRandom;
import java.util.IllegalFormatCodePointException;

/*
Mimic the race of a Tortoise and a Hare on a 70 squares line
Declare 1-D array position - 70 elements
Do ...while (tortoise == 70 or hare == 70)
Use a for statement to move from 1 to 10 of array position
    Adjusting position of animal

    use variable tortoise for position of tortoise and hare for hare
    Initialize tortoise = 1, hare = 1;

//    Create method adjust (argument - randomGenerator for both tortoise and hare)

     moveTortoise //create randomNumber Generator which determines how to adjust both animals
     moveHare
     tortoise +=moveTortoise
     hare +=moveHare
     if tortoise or hare < 1
     tortoise or hare = 1;

    create method display array argument array, position tortoise, position hare
    for index 1 to array.length
    array[tortoise] =1; array hare
    if array[tortoise] = 1
    System.out.print ("T") i.e. print space
    else if array[hare] = 1
    print H
    else if tortoise == hare
    set array tortoise = 1
        then print OUCH!!!
    else print space
    Print newline

    if tortoise == 70
        Print tortoise wins
        break
    if hare == 70
        print hare wins
        break
    if tortoise && hare == 70
        print tie
 */
public class TortoiseHare {
    private static final SecureRandom movement = new SecureRandom();

    public static void main(String[] args) {
        int[] position = new int[70];
        int tortoise = 1, hare = 1;

        do {
            for (int timeTick = 1; timeTick <= 100; timeTick++) {
                int moveTortoise = 1 + movement.nextInt(10);
                switch (moveTortoise) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        tortoise += 3;
                        break;
                    case 6:
                    case 7:
                        tortoise -= 6;
                        break;
                    case 8:
                    case 9:
                    case 10:
                        tortoise += 1;
                        break;
                }
                int moveHare = 1 + movement.nextInt(10);
                switch (moveHare) {
                    case 1:
                    case 2:
                        hare += 0;
                    case 3:
                    case 4:
                        hare += 9;
                    case 5:
                        hare -= 10;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        hare += 1;
                        break;
                    case 9:
                    case 10:
                        hare -= 2;
                        break;
                }
                if (tortoise < 1 || hare < 1) {
                    tortoise = 1;
                    hare = 1;
                }
                displayPosition(position, tortoise, hare);
            }

            if (tortoise == 70){
                System.out.println("TORTOISE WINS.  YAY!!!");
                break;
            }
            if (hare == 70){
                System.out.println("Hare wins. Yuch");
                break;
            }
//            if (tortoise == 70 && hare == 70){
//                System.out.println("TORTOISE WINS");
//                break;
//            }

        } while (tortoise != 70 || hare != 70) ;
    }
    public static void displayPosition(int [] array, int tortoisePosition, int harePosition){
       if (tortoisePosition == harePosition)
           array[tortoisePosition] = 2;
       else {
           array[tortoisePosition] = 1;
           array[harePosition] = 1;
       }
        for (int index = 0; index < array.length; index++){
            if (array[tortoisePosition] == 1)
                System.out.print("T");
            else if (array[harePosition]==1)
                System.out.print("H");
            else if (array[tortoisePosition] == 2)
                System.out.print("OUCH!!!");
            else
                System.out.print(" ");
            }
        System.out.println();
        }
    }
