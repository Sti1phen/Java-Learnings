package main.java.org.projects.chapter4;
//ClassAverage problem using counter-controlled repetition
import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //initialization phase
        int total = 0;
        int gradeCounter = 1;

        //processing phase uses counter-controlled repetition
        while(gradeCounter <=10) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;//increment counter by one (1)
        }

        int average = total /10;

        //Display results

        System.out.printf("\nTotal of all grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);
    }
}
        //end class ClassAverage