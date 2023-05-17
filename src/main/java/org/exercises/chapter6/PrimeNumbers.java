package main.java.org.example.chapter6;
/*
Initialize number=2
Prime numbers are not divisible by any other number except itself and 1
For prime = 1; to number
    if (!(number % prime == 0))
    print number

 */
public class PrimeNumbers {
    public static void main(String[] args) {
for (int number = 1; number <= 10000; number++){
    primeNumbers(number);

}
            System.out.println();
    }

    public static void primeNumbers(int number) {
        for (int n = 2; n <= number; n++) {

            if (number % n == 0) {
                if ((number / n > 1))
                    break;
                else if (number/n ==1) {
                    System.out.printf("%5d\t", number);

                }

                }

            }
        }
    }
