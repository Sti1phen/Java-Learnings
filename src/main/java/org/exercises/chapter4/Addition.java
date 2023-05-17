package main.java.org.example.chapter4;
//Exercise 4.6

public class Addition {

    public static void main(String[] args) {
        int sum =0;
        int x = 1;

        while (x <=10)
        {
            sum += x;
            x++;
        }

        System.out.printf("The sum is: %d\n", sum);
    }
}