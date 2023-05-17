package main.java.org.example.chapter3;
//An object of class HeartRates

import java.util.Scanner;

public class ObjectHeartRates {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name as Firstname Lastname: ");
        String firstName = input.next();
        String lastName = input.next();

        System.out.print("Enter date of birth as YYYY MM DD: ");
        String year_ = input.next();
        int year = Integer.parseInt(year_);
        String month_ = input.next();
        int month = Integer.parseInt(month_);
        String day_ = input.next();
        int day = Integer.parseInt(day_);


        HeartRates stephen = new HeartRates(firstName, lastName, year, month, day);

        stephen.setFirstName(firstName);
        stephen.setLastName(lastName);
        stephen.setDayOfBirth(day);
        stephen.setMonthOfBirth(month);
        stephen.setYearOfBirth(year);

    System.out.printf("\nDear %s %s, you are %d years old.\nYour Maximum Heart Rate is %d.\n", stephen.getFirstName(),stephen.getLastName(),stephen.getAge(), stephen.maximumHeartRate());
    stephen.targetHeartRate();

    }

}