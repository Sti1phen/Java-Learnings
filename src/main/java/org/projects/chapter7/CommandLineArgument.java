package main.java.org.projects.chapter7;
/*

 */
public class CommandLineArgument{
    public static void main(String[] args) {
// declare variable array and initialize it with an array object
        int[] array;
        if(args.length == 0)
            array = new int[10];

        else array = new int [Integer.parseInt(args[0])];// create the array object

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
// output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}