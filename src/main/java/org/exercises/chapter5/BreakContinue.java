package main.java.org.example.chapter5;
/*

 */
public class BreakContinue
{
    public static void main(String[] args)
    {
        int count; // control variable also used after loop terminates
        for (count = 1; count <= 10; count++) // loop 10 times
        {
            if (count == 5)
                count =6; // terminates loop if count is 5
            System.out.printf("%d ", count);
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }

    }
//public class BreakContinue {
//    public static void main(String[] args) {
//        int t =1, m =5;
//        while (t < 7) {
//            System.out.print("El-yon\n");
//            System.out.printf("The value of t is %d\n", t);
//            if (t==5)
//                t=8;
//            t++;
//        }
//        System.out.printf("The value of t is %d\n", t);
//    }

