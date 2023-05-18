package main.java.org.projects.chapter6;

import java.util.Scanner;

/*
Write the methods given:
Celsius to Fahrenheit and vice versa
Prompt user to choose Temperature Conversion and enter a temperature
Input user response
if C
    Use Celsius to Fahrenheit method
    and Display result

If F
    Use Fahrenheit to Celsius method and
    display result
 */
public class TemperatureConversions {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion");
        System.out.print("Enter the unit of the temperature you want to convert and its value" +
                " \n(e.g 'F 40 meaning convert 40 fahrenheit to celsius' or \nC 40 meaning convert 40 celsius to fahrenheit): ");
        Scanner input = new Scanner(System.in);
        String temperatureUnit = input.next();
        double temperatureValue = input.nextDouble();

        String fahrenheit = "F";
        String celsius = "C";

        if (temperatureUnit.equals("F"))
            System.out.printf("Answer is %d degree C\n", celsius(temperatureValue));
        else if (temperatureUnit.equals("C"))
            System.out.printf("Answer is %d degree F\n", fahrenheit(temperatureValue));
        }


    public static int celsius(double fahrenheit){
        int celsius = (int) (5.0 / 9.0 * (fahrenheit - 32));

        return celsius;
    }

    public static int fahrenheit(double celsius){
        int fahrenheit = (int) (9.0 / 5.0 * celsius + 32);
        return fahrenheit;
    }
}