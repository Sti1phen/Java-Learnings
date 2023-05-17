package main.java.org.exercises.chapter3;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private double height;
    private double weight;
    private  String gender;

    public HealthProfile(String firstName, String lastName, int yearOfBirth,
                         int monthOfBirth, int dayOfBirth, double height, double weight, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (yearOfBirth > 0 && yearOfBirth < 9999)
            this.yearOfBirth = yearOfBirth;

        else if (monthOfBirth > 0 && monthOfBirth <= 12)
            this.monthOfBirth = monthOfBirth;

        else if (monthOfBirth == 4 || monthOfBirth == 6 ||monthOfBirth ==  9 || monthOfBirth == 11) {
            if (dayOfBirth > 0 && dayOfBirth < 31)
                this.dayOfBirth = dayOfBirth;
        }
        else if (monthOfBirth == 2) {
            if (dayOfBirth > 0 && dayOfBirth < 30)
                this.dayOfBirth = dayOfBirth;
        }
        else if (monthOfBirth == 1 ||monthOfBirth == 3 || monthOfBirth == 5
                || monthOfBirth == 7 || monthOfBirth == 8 ||
                monthOfBirth == 10 || monthOfBirth == 11 ||monthOfBirth == 12) {
            if (dayOfBirth > 0 && dayOfBirth < 32)
                this.dayOfBirth = dayOfBirth;
        }
        else System.out.println("You've entered an invalid day!");

        if (height > 0.0)
            this.height = height;
        if (weight > 0.0)
            this.weight = weight;
        if (gender == "M" || gender =="F")
            this.gender = gender;
        else System.out.println("You entered an incorrect gender");

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

        if (yearOfBirth > 0 && yearOfBirth < 9999)
            this.yearOfBirth = yearOfBirth;

        else if (monthOfBirth > 0 && monthOfBirth <= 12)
            this.monthOfBirth = monthOfBirth;

        else if (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11) {
            if (dayOfBirth > 0 && dayOfBirth < 31)
                this.dayOfBirth = dayOfBirth;
        } else if (monthOfBirth == 2) {
            if (dayOfBirth > 0 && dayOfBirth < 30)
                this.dayOfBirth = dayOfBirth;
        } else if (monthOfBirth == 1 || monthOfBirth == 3 || monthOfBirth == 5 ||
                monthOfBirth == 7 || monthOfBirth == 8 || monthOfBirth == 10 || monthOfBirth == 11
                || monthOfBirth == 12) {
            if (dayOfBirth > 0 && dayOfBirth < 32)
                this.dayOfBirth = dayOfBirth;
        } else System.out.println("You've entered an invalid day!");

    }

    public int getDayOfBirth() {

        return dayOfBirth;
    }

    public void setHeight(double height) {
        if (height > 0.0)
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        if (weight > 0.0)
            this.weight = weight;
    }

    public double getWeight() {

        return weight;
    }

    public void setGender(String gender) {
        if (gender == "M" ||gender =="F")
            this.gender = gender;
        else System.out.println("You entered an incorrect gender");
    }

    public String getGender() {

        return gender;
    }

    public int getAge() {
        Scanner input = new Scanner(System.in);
        LocalDate thisDay = LocalDate.now();
        int year_ = thisDay.getYear();
        int month_ = thisDay.getMonthValue();
        int day_ = thisDay.getDayOfMonth();

        int yearDifference = year_ - yearOfBirth;
        int monthDifference = month_ - monthOfBirth;
        int dayDifference = day_ - dayOfBirth;

        int age = (((yearDifference * 365) + (monthDifference * 31) + dayDifference) / 365);

        return age;
    }

    public int maximumHeartRate() {

        return (220 - getAge());
    }

    public void targetHeartRate() {
        double max_level =  (0.85 * (double) maximumHeartRate());
        double min_level = (0.5 * (double) maximumHeartRate());
        System.out.printf("Target Heart Rate Range: %.1f - %.1f\n\n", min_level, max_level);
    }

    public double bMI ()
    {
        double bmi = (weight * 703) / (height * height);
        return bmi;

    }

}
