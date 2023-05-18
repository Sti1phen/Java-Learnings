package main.java.org.projects.chapter4;
/*
Initialize variables e = 0, counter =0;

Prompt user to enter number of terms
Input user response

Calculate e = 1+ x/1! + x2/2! +....
x =n
p = x;

while counter <=n
    if counter equal 0 or 1
        m =1
        p = 1
    else
            int x = 2;
            p = counter
            m = counter;
            while (x <= counter) {
                 m *= (x - 1);
                 p*=counter
                 x++;
                    }
    e+=p/m
    counter++;
 */
import java.util.Scanner;
public class EulerSeries {

public static void main(String[] args) {
        int m, p=1, counter = 1; double e=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Finding natural number with exponent\nEnter nth to stop calculation of natural number: ");
        int n = input.nextInt();

        while (n <0) {
        System.out.print("Enter a non zero integer: ");
        n = input.nextInt();
        }
        while (counter <= n) {
                if (counter==1) {
                    m=1;
                    p = n;
                }


                 else {
                     int x = 2;
                     m = counter;
                        while (x <= counter) {
                            m *= (x - 1);
                            x++;
                        }
                        p*=n;
                     }
                System.out.printf("p is %d\nm is %d\n", p, m);
             e+= (double) p/m;
                 counter++;
            }
        System.out.printf("e value is %.3f\n", e);
        }

}