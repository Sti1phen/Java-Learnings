package main.java.org.projects.chapter7;
/*
sum double values passed by command line argument
Declare double array as args
Convert String values to double
Use enhanced for to sum values
 */
public class EnhancedForStatement {
    public static void main(String[] args) {
        double sum =0;
        double [] values = new double[args.length];
        for (int counter = 0; counter < args.length; counter++)
            values[counter] = Double.parseDouble(args[counter]);
        for (double value : values)
                sum += value;
        System.out.printf("The sum of the values entered is: %.2f\n", sum);
        }

    }

