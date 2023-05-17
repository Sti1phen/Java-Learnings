package main.java.org.example.chapter6;

import java.util.Scanner;

/*
initialize radius
Prompt User to input radius of sphere
Input user response
Call method sphereVolume
Print volume
 */
public class SphereVolumeTest {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of a sphere: ");
        radius = input.nextDouble();
        System.out.printf("The Volume of the sphere of radius %.2f is: %.2f\n", radius, SphereVolume.sphereVolume(radius));

    }
}
