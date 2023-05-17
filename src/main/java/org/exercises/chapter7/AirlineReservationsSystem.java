package main.java.org.example.chapter7;
/*
Declare and Initialize
firstClass = 0;
economy=5;
Declare and initialize boolean seatingChart 11
seatingChart[0] = true;
    for (int count = 0; count < seatingChart.length; ++count)
             boolean status = seatingChart[count]
             do{
              Prompt user for reservation alternative
1 : First Class
2: Second Class
Input user's response
if user response is 1
    ++firstClass
    if firstClass <= 5
    Print Welcome on Board. \nYour seat number is (firstClass) in the first class section of the plane.
        seatingChart[firstClass] = true
    else
        Print firstClass section is full\n Type Yes to get a seat in the economy section and No to wait for next flight
        Input user's response
            if   user's response = yes
                if economy < 10
                    ++economy
                    Print Welcome on Board. \nYour seat number is (economy) in the first class section of the plane.
                    seatingChart[economy] = true
                else    the economy section is full too. Next flight leaves in 3 hours
           if user's response = no
                Print Next flight leaves in 3 hours

if user response is 2
    ++economy
    if economy <= 10
        seatingChart[economy] = true
        Print Welcome on Board. \nYour seat number is (economy) in the economy section of the plane.
    else
        Print economy section is full\n Type Yes to get a seat in the firstClass section and No to wait for next flight
        Input user's response
            if   user's response = yes
                if firstClass <5
                    ++firstClass
                    Print Welcome on Board. \nYour seat number is (firstClass) in the economy section of the plane.
                    seatingChart[firstClass] = true
                else    the firstClass section is full too. Next flight leaves in 3 hours
           if user's response = no
                Print Next flight leaves in 3 hours

              }(while firstClass + economy = 15)
*/

import java.util.Scanner;

public class AirlineReservationsSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      int firstClass = 0, economy = 5, firstClass_response =1, economy_response = 2;
      String response1_yes = "yes";
      boolean [] seatingChart = new boolean[11];
      seatingChart[0] = true;
        do{
            System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
            int response = input.nextInt();
            if (response == firstClass_response){
                if (firstClass < 5) {
                    ++firstClass;
                    System.out.printf("Welcome on board\nYour seat number is %d in the %s section.\n", firstClass, "first class");
                    seatingChart[firstClass] = true;
                }
                else {
                    System.out.printf("Sorry! %s section is fully reserved.\nPlease type yes to " +
                            "reserve a space in the economy section or no to wait for next flight: ", "first class");
                    String response2 = input.next();
                    if (response2.equalsIgnoreCase(response1_yes)){
                        if (economy < 10){
                            ++economy;
                            System.out.printf("Welcome on board\nYour seat number is %d in the %s section.\n", economy, "economy");
                            seatingChart[economy] = true;
                        }
                        else System.out.println("Economy section is full. Next flight leaves in next 3 hours.\n");
                    }
                    else System.out.println("Next flight leaves in next 3 hours.\n");
                }
                }

            if (response == economy_response){
                if (economy < 10) {
                    ++economy;
                    System.out.printf("Welcome on board\nYour seat number is %d in the %s section.\n", economy, "economy");
                    seatingChart[economy] = true;
                }
                else {
                    System.out.printf("Sorry! %s section is fully reserved.\nPlease type yes to " +
                            "reserve a space in the economy section or no to wait for next flight: ", "first class");
                    String response2 = input.next();
                    if (response2.equalsIgnoreCase(response1_yes)){
                        if (firstClass < 5){
                            ++firstClass;
                            System.out.printf("Welcome on board\nYour seat number is %d in the %s section.\n", firstClass, "first class");
                            seatingChart[firstClass] = true;
                        }
                        else System.out.println("First Class section is full.\nNext flight leaves in next 3 hours.\n");
                    }
                    else System.out.println("Next flight leaves in next 3 hours.\n");
                }
               
            }

        }while ( (firstClass + economy) < 15);

    }
}
