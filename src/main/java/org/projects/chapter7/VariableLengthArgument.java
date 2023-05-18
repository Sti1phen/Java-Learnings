package main.java.org.projects.chapter7;
/*
Create Method Product with variable length argument
then create method main and initialize integers
Call method product
 */


public class VariableLengthArgument {

    public static void main(String[] args) {
        int number1 = 30, number2 = 2, number3 = 6, number4 = 60, number5 = 20;
       System.out.println(product(number1, number5, number4));
       System.out.println(product(number2, number3));
    }

    public static int product(int... numbers){
        int product=1;
        for (int integer : numbers)
            product *= integer;
        return product;
    }
}