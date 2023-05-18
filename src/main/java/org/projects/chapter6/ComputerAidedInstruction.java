package main.java.org.projects.chapter6;
/*
Produce two random one-digit number
Use method question to prompt multiplication of numbers generated
    method return answer
Prompt student to provide answer
Input user response
while true (i.e. the user has an int response)
    while user response != product
        Count Incorrect entry
        Print Try again
        Input user response

Count Incorrect entry
Print Very Good

if correct entry and incorrect entry == 10
Print % score and tell student congratulations or Ask help from teacher
Reset program

Call method Question again
Input user response

In method question, produce two positive number with secure Random
Select random question using Secure random 1 to 5
For difficulty level
make a switch that takes parameter int difficultyLevel


Difficulty level
Prompt user to enter difficulty level
If 1
    Prompt question from difficulty level 1
else if 2
    Prompt question from difficulty level 2
else
    Prompt question from difficulty level 3

Varying Type of Problem


*/
import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAidedInstruction {
    private static final SecureRandom positive_integers = new SecureRandom();
    public static void main(String[] args) {
        int count_correct = 0, count_wrong = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a difficulty level from 1 to 3: ");
        int difficultyLevel = input.nextInt();
        int product = question(difficultyLevel);
        int userResponse = input.nextInt();

        while (true) {
            while (userResponse != product) { //Keep trying until user input a correct answer
                count_wrong += wrong();
                userResponse = input.nextInt();
            }

            count_correct += correct();//if userResponse is correct

            if ((count_correct + count_wrong) == 10) {
                double percent_correct = ((double) count_correct / 10) * 100;
                if (percent_correct >= 75) {
                    System.out.println("\nCongratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("\nPlease ask your teacher for extra help.");
                }
                break;
            }
            product = question(difficultyLevel);
            userResponse = input.nextInt();

        }
    }
        public static int question(int difficultyLevel) {
            int questionNumber = 1 + positive_integers.nextInt(6);
            int number1 =0, number2 = 0;
            switch (difficultyLevel) {
                case 1:
                    number1 = positive_integers.nextInt(10);
                    number2 = positive_integers.nextInt(10);
                    break;
                case 2:
                    number1 = positive_integers.nextInt(100);
                    number2 = positive_integers.nextInt(100);
                    break;
                case 3:
                    number1 = positive_integers.nextInt(1000);
                    number2 = positive_integers.nextInt(1000);
                    break;
            }
            switch (questionNumber) {
                case 1:
                    System.out.printf("%d multiplied by %d = ", number1, number2);
                    break;
                case 2:
                    System.out.printf("What is %d times %d ? ", number1, number2);
                    break;
                case 3:
                    System.out.printf("How much is %d times %d : ", number1, number2);
                    break;
                case 4:
                    System.out.printf("%d times %d = ", number1, number2);
                    break;
                case 5:
                    System.out.printf("What is %d of %d ? ", number1, number2);
                    break;
                case 6:
                    System.out.printf("A number %d is multiplied by %d. What is the result? ", number1, number2);
            }
            return number1 * number2;
        }

        public static int correct(){
        int number =1 + positive_integers.nextInt(4);
        switch (number){
            case 1:
                System.out.println("Very Good");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
        }
        return 1;
        }
        public static int wrong(){
            int number =1 + positive_integers.nextInt(4);
            switch (number){
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don't give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
            }
            return 1;
        }
    }