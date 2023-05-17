package main.java.org.example.chapter4;
/*Top Print a table that display 10, 100, 1000* of number 1 to 5
First Refinement: Initialize variables
Loop Condition, find(or print) 10*, 100*, 1000*
Print the on a table

Second Refinement:
Initialize number = 1
initialize 10s  100s    1000s

While number is less than or equals 5
    Print number    number *10  number*100  number*1000
    number++;
 */

public class LoopTable {
    public static void main(String[] args) {
        int number = 1;
        int t, h, th;
        System.out.print("N     10*N        100*N       1000*N\n");

        while (number <=5)
        {
            t = 10 * number;
            h = 100 * number;
            th = 1000 * number;
            System.out.printf("%d     %d          %d          %d\n",number,t, h, th);
            number++;
        }
    }
}
