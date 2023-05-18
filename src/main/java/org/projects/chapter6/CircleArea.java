package main.java.org.projects.chapter6;

import java.util.Scanner;

/*
Prompt user for radius of circle
Input user response
call method circleArea

Declare method circle area to take argument radium
Calculate area
return area
 */
public class CircleArea {
    public static void main(String[] args) {
        System.out.print("Enter the radius of a circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.printf("Area of the circle of radius %.2f is equals %.2f\n", radius, circleArea(radius));
    }
    public static double circleArea(double radius){
        return Math.PI * radius * radius;
    }
}
