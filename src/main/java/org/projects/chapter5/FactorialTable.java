package main.java.org.projects.chapter5;
/*
Factorial 1 to 20
Initialize variable i =1;

Println Number          Factorial
for i=1; i <=20; i++
    Printf (%-2d            %8d, i, factorial)
    New Line

Static factorial method
public static void factorial(number)
 */
public class FactorialTable {

        public static void main(String[] args) {
                int i;
                System.out.println("NUMBER\t\t\t\tFACTORIAL");
                for (i = 1; i <= 20; ++i) {
                        System.out.printf("%-2d\t\t\t\t\t%4d", i, factorial(i));
                        System.out.println();
                }
        }


        public static long factorial(int i) {
               int n  = 2;
                long m = i;
                if (i == 1) {
                        m = 1;
                }
                else {
                        while (n <= i) {
                                m *= (n - 1);
                                n++;
                        }
                }
                return m;

        }
}

