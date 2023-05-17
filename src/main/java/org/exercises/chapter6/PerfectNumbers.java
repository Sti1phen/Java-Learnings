package main.java.org.example.chapter6;
/*
Method: Create method isPerfect with the factors of the the number from 1 except the number adding up to give itself
e.g 6 (1+2+3= 6)

Initialize number =1
for factor = 1 to number
    if number % factor == 0
        return factor
        sum += factor
        if sum == number
        return factor
        print number    print factors
 */
public class PerfectNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            isPerfect(number);
            }

        }

    public static void isPerfect(int number){
        int sum = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }
                if (sum == number) {
                    System.out.printf("%-5d   ", number);
                    for (int factors =1; factors < number; factors++){
                        if (number % factors == 0)
                            System.out.printf("%d  ", factors);
                    }
                    System.out.println();
                }

    }

    }
