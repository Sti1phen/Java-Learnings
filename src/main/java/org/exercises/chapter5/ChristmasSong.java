package main.java.org.example.chapter5;
/*
On the first day of Christmas my true love sent to me
A partridge in a pear tree

On the second day of Christmas my true love sent to me
Two turtle doves,
And a partridge in a pear tree.

On the third day of Christmas my true love sent to me
Three French hens,
Two turtle doves,
And a partridge in a pear tree.

/Subsequent verses follow the same pattern. Each verse deals with the next day of Christmastide,
adding one new gift and then repeating all the earlier gifts, so that each verse is one line longer than its predecessor./

four calling birds
five gold rings
six geese a-laying
seven swans a-swimming
eight maids a-milking
nine ladies dancing
ten lords a-leaping
eleven pipers piping
twelve drummers drumming

initialiaze day;
Use for repetition for 1 to 12

switch day
    Print on the ___day of Christmas my true love sent to me....
    break;

    Switch day
    Print remaining of each verse
 */
public class ChristmasSong {
    public static void main(String[] args) {
        int day;
        for (day =1; day <= 12; day++){
            switch (day) {
                case 1:
                    System.out.print("On the first day of Christmas\nMy true love sent to me\n");
                    break;
                case 2:
                    System.out.print("On the second day of Christmas\nMy true love sent to me\n");
                    break;
                case 3:
                    System.out.print("On the third day of Christmas\nMy true love sent to me\n");
                    break;
                case 4:
                    System.out.print("On the fourth day of Christmas\nMy true love sent to me\n");
                    break;
                case 5:
                    System.out.print("On the fifth day of Christmas\nMy true love sent to me\n");
                    break;
                case 6:
                    System.out.print("On the sixth day of Christmas\nMy true love sent to me\n");
                    break;
                case 7:
                    System.out.print("On the seventh day of Christmas\nMy true love sent to me\n");
                    break;
                case 8:
                    System.out.print("On the eighth day of Christmas\nMy true love sent to me\n");
                    break;
                case 9:
                    System.out.print("On the ninth day of Christmas\nMy true love sent to me\n");
                    break;
                case 10:
                    System.out.print("On the tenth day of Christmas\nMy true love sent to me\n");
                    break;
                case 11:
                    System.out.print("On the eleventh day of Christmas\nMy true love sent to me\n");
                    break;
                case 12:
                    System.out.print("On the twelfth day of Christmas\nMy true love sent to me\n");
            }

            switch (day){
                case 12:
                    System.out.print("Twelve drummers drumming\n");
                case 11:
                    System.out.print("Eleven pipers piping\n");
                case 10:
                    System.out.print("Ten lords a-leaping\n");
                case 9:
                    System.out.print("Nine ladies dancing\n");
                case 8:
                    System.out.print("Eight maids a-milking\n");
                case 7:
                    System.out.print("Seven swans a-swimming\n");
                case 6:
                    System.out.print("Six geese a-laying\n");
                case 5:
                    System.out.print("Five gold rings\n");
                case 4:
                    System.out.print("Four calling birds\n");
                case 3:
                    System.out.print("Three French hens\n");
                case 2:
                    System.out.print("Two turtle doves\n");
                case 1:
                    System.out.print("And a partridge in a pear tree.\n");
            }
            System.out.println();
        }

    }
}