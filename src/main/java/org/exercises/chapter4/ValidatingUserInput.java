package main.java.org.example.chapter4;// Fig. 4.12: Analysis.java
//Initialize passes to zero
//Initialize failures to zero
//Initialize student counter to one
//  While student counter is less than or equal to 10
//  Prompt the user to enter the next exam result
//  Input the next exam result
//      If the student passed
//          Add one to passes
//          Add one to student counter
//      Else if failed
//          Add one to failures
//          Add one to student counter
//      Else
//          Print Re-enter correct result
//          Print the number of passes
//          Print the number of failures

//        If more than eight students passed
//        Print “Bonus to instructor!”
// Analysis of examination results using nested control statements.
import java.util.Scanner; // class uses class Scanner
public class ValidatingUserInput
{
    public static void main(String[] args)
    {
// create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
// initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
// process 10 students using counter-controlled loop
        while (studentCounter <= 10)
        {
// prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
// if...else is nested in the while statement
            if (result == 1)
            {
                passes = passes + 1;
                // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;}
            else if (result==2)
            {
                failures = failures + 1;
                // increment studentCounter so loop eventually terminates
                studentCounter = studentCounter + 1;
            }

            else
            {
                System.out.print("You entered an invalid result.");
                System.out.print("Enter a correct result (1 = pass, 2 = fail): ");
            }
        }
// termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
// determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
} // end class Analysis