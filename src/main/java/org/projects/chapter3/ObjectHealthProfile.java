package main.java.org.projects.chapter3;
//An app that tests the HealthProfile Class

import java.util.Scanner;

public class ObjectHealthProfile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name (firstname lastname): ");
        String firstName = input.next();
        String lastName = input.next();

        System.out.print("Enter your gender (M or F): ");
        String gender = input.next();

        System.out.print("Enter your date of birth (YYYY MM DD): ");
        String year_ = input.next();
        int year = Integer.parseInt(year_);
        String month_ = input.next();
        int month = Integer.parseInt(month_);
        String day_ = input.next();
        int day = Integer.parseInt(day_);

        System.out.print("Enter your height in inches:");
        double height = input.nextDouble();
        System.out.print("Enter your weight in pounds:");
        double weight = input.nextDouble();


        HealthProfile user1 = new HealthProfile(firstName, lastName, year, month, day,height, weight, gender);

        user1.setFirstName(firstName);
        user1.setLastName(lastName);
        user1.setDayOfBirth(day);
        user1.setMonthOfBirth(month);
        user1.setYearOfBirth(year);
        user1.setHeight(height);
        user1.setWeight(weight);
        user1.setGender(gender);

        System.out.printf("Hello! Welcome to Health Profile. Your info are as follows:\n" +
                "First name: %s\nLast name: %s\nDate of Birth: %d/%d/%d\nGender: %s\nH" +
                "eight: %.2f inches\nWeight: %.2f pounds\n" +
                "Age: %d\nBMI: %.1f\nMaximum Heart Rate: %d\n",user1.getFirstName(),user1.getLastName(),user1.getYearOfBirth(),
                user1.getMonthOfBirth(),user1.getDayOfBirth(),user1.getGender(),
        user1.getHeight(),user1.getWeight(),user1.getAge(),user1.bMI(), user1.maximumHeartRate());
        user1.targetHeartRate();

        System.out.print("\n\nBMI VALUES (according to Department of Health and Human Services" +
                ")\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater\n");
    }


}
