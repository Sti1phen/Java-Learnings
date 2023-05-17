package main.java.org.example.chapter6;
/*
Declare base, exponent
initialize count =1;
baseEqual = base;
For count = 1 and less than or equal to exponent;
    Calculate base *= baseEqual
return base
 */
public class Exponentiation {

    public static int integerPower(int base, int exponent){
        int baseEqual = base;
        int count;
        for (count =1; count < exponent; count++){
            base *= baseEqual;
        }
        return base;
    }

}
