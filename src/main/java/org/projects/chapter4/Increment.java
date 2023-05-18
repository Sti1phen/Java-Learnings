package main.java.org.projects.chapter4;
//Demonstrate post-incrementing and pre-incrementing
public class Increment {

    public static void main(String[] args) {

        int c =5;
        System.out.printf("c before post-incrementing is: %d\n", c);
        System.out.printf("          post-incrementing c: %d\n", c++);
        System.out.printf("       c after post-increment: %d\n", c);

        System.out.println();

        //demonstrate pre-increment
        c = 5;
        System.out.printf("c before pre-incrementing is: %d\n", c);
        System.out.printf("          pre-incrementing c: %d\n", ++c);
        System.out.printf("       c after pre-increment: %d\n", c);

    }
}