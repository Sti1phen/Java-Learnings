package main.java.org.projects.chapter3;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRates {

//Class Attributes //Instance Variables
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public HeartRates(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (yearOfBirth > 0 && yearOfBirth < 9999)
            this.yearOfBirth = yearOfBirth;

        if (monthOfBirth > 0 && monthOfBirth <= 12)
            this.monthOfBirth = monthOfBirth;

        if (monthOfBirth == 4 || monthOfBirth == 6 ||monthOfBirth ==  9 || monthOfBirth == 11) {
            if (dayOfBirth > 0 && dayOfBirth < 31)
                this.dayOfBirth = dayOfBirth;
        }
        else if (monthOfBirth == 2) {
            if (dayOfBirth > 0 && dayOfBirth < 30)
                this.dayOfBirth = dayOfBirth;
        }
        else if (monthOfBirth == 1 ||monthOfBirth == 3 || monthOfBirth == 5 ||
                monthOfBirth == 7 || monthOfBirth == 8 ||monthOfBirth == 10 ||
                monthOfBirth == 11 ||monthOfBirth == 12) {
        if (dayOfBirth > 0 && dayOfBirth < 32)
            this.dayOfBirth = dayOfBirth;
        }
        else System.out.println("You've entered an invalid day!");
    }

    public void setFirstName (String name) {

        firstName = name;
    }

    public String getFirstName() {

        return firstName;
    }
    public void setLastName(String name) {
        lastName = name;
    }

    public String getLastName() {

        return lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0 && yearOfBirth < 9999)
            this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0 && monthOfBirth <= 12)
            this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {

        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if (monthOfBirth == 4 || monthOfBirth == 6 ||monthOfBirth ==  9 || monthOfBirth == 11) {
            if (dayOfBirth > 0 && dayOfBirth < 31)
                this.dayOfBirth = dayOfBirth;
        }
        else if (monthOfBirth == 2) {
            if (dayOfBirth > 0 && dayOfBirth < 30)
                this.dayOfBirth = dayOfBirth;
        }
        else if (monthOfBirth == 1 ||monthOfBirth == 3 || monthOfBirth == 5 ||
                monthOfBirth == 7 || monthOfBirth == 8 ||monthOfBirth == 10 ||
                monthOfBirth == 11 ||monthOfBirth == 12) {
            if (dayOfBirth > 0 && dayOfBirth < 32)
                this.dayOfBirth = dayOfBirth;
        }
        else System.out.println("You've entered an invalid day!");

    }
    public int getDayOfBirth() {

        return dayOfBirth;
    }

    public int getAge() {
        Scanner input = new Scanner(System.in);
        LocalDate thisDay = LocalDate.now();
        int year = thisDay.getYear();
        int month = thisDay.getMonthValue();
        int day = thisDay.getDayOfMonth();

        int yearDifference = year - yearOfBirth;
        int monthDifference = month - monthOfBirth;
        int dayDifference = day - dayOfBirth;

        int age = (((yearDifference * 365) + (monthDifference * 31) + dayDifference) / 365);

        return age;
    }

    public int maximumHeartRate() {

        return (220 - getAge());
    }

    public void targetHeartRate() {
        double max_level =  (0.85 * (double) maximumHeartRate());
        double min_level = (0.5 * (double) maximumHeartRate());
        System.out.printf("Your target heart rate range is %.1f to %.1f\n\n", min_level, max_level);
    }
}


