package main.java.org.projects.chapter4;
/*
Algorithm Pseudocode Development
Top - Determine the credit limit of each customer in a departmental-store
First Refinement
Initialize variables
input facts, calculate new balance
determine if new balance is greater than credit limit and display credit limit exceeded if not
Second refinement
Initialize totalCredit = 0
Initialize totalCharge = 0
Initialize creditLimit = 0

Prompt account user to input Account number, credit at the end of the month, charge at the end of the month
and beginning balance,allowed credit limit Calculate new balance

Print new balance

If new balance is less than creditLimit
    Print "Credit Limit Exceeded"
 */

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter balance at the beginning of the month: ");
        int balance = input.nextInt();
        System.out.print("Enter total item charge to your account this month: ");
        int totalCharge = input.nextInt();
        System.out.print("Enter total credit applied to your account this month: ");
        int totalCredit = input.nextInt();
        System.out.print("Enter your allowed credit limit: ");
        int allowedCreditLimit = input.nextInt();

        CreditLimit user1 = new CreditLimit(accountNumber,balance,totalCredit,totalCharge,allowedCreditLimit);

        System.out.printf("Your new account balance will be: %d\n", user1.getBalance());

        if (user1.getAllowedCreditLimit() > user1.getBalance())
            System.out.print("\"Credit Limit Exceeded\".\n");
    }
}