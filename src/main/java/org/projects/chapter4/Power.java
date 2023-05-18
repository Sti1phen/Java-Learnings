package main.java.org.projects.chapter4;


import java.util.Scanner;

public class Power {

    public int getPowerPlusOne(int number, int index) {
        int x =1;
        while ( x <= index) {
            number *=10;
            x++;
        }
        return number;
    }
    public int getPower(int number, int index) {
        int x =1;
        while ( x <= index) {
            if (x==1)
                number *=1;
            else {
                number *=10;
            }
            x++;
        }

        return number;
    }

    public int getPowerMinusOne(int number, int index) {
        int x =1;
        while ( x <= index) {
            if (x ==1)
                number = 1;
            else if (x ==2) {
                number *=1;
            }
            else {
                number *=2;
                x++;
            }

        }
        return number;
    }
}
