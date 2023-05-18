package main.java.org.projects.chapter6;

import java.security.SecureRandom;

/*

 */
public class RandomNumberExercise {
    static SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        int n, counter;
        for (counter = 1; counter <= 2; counter++) {
            n = 1 + randomNumbers.nextInt(2);
            System.out.printf("%d   ", n);
        }
        System.out.println();
        for (counter = 1; counter <= 100; counter++) {
            n = 1 + randomNumbers.nextInt(100);
            System.out.printf("%d   ", n);
            if (counter % 5 == 0)
                System.out.println();
        }
        for (counter = 1; counter <= 10; counter++) {
            n = randomNumbers.nextInt(10);
            System.out.printf("%d   ", n);
            if (counter % 2 == 0)
                System.out.println();
        }
        for (counter = 1; counter <= 112; counter++) {
            n = 1000 + randomNumbers.nextInt(112);
            System.out.printf("%d   ", n);
            if (counter % 20 == 0)
                System.out.println();
        }
        for (counter = 1; counter <= 112; counter++) {
            n = 1000 + randomNumbers.nextInt(112);
            System.out.printf("%d  ", n);
            if (counter % 20 == 0)
                System.out.println();
        }
        System.out.println();
        for (counter = 1; counter <= 3; counter++) {
            n = -1 + randomNumbers.nextInt(3);
            System.out.printf("%d  ", n);
        }

        System.out.println();
        for (counter = 1; counter <= 15; counter++) {
            n = -3 + randomNumbers.nextInt(15);
            System.out.printf("%d  ", n);
            if (counter % 5 == 0)
                System.out.println();
        }

        n = 2 + 2*randomNumbers.nextInt(5);
        System.out.printf("%d  \n", n);
        n = 3 + 2*randomNumbers.nextInt(5);
        System.out.printf("%d  \n", n);
        n = 6 + 4*randomNumbers.nextInt(5);
        System.out.printf("%d  \n", n);

    }
}
