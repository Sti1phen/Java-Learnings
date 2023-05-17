package main.java.org.example.chapter5;

import java.util.Scanner;

/*
Calculate and Display total retail value of five product
Initialize double product1, product2, product3, product4, product5, sum =0;
while (input.has next())
    Prompt user to input product number and quantity sold
    Switch between product to input quantity of product sold and calculate total prices of the product
    x = quantity sold
    total
    sum += total

Print sum:
 */
public class Sales {
    public static void main(String[] args) {
        double product1 = 2.98, product2 = 4.50, product3 = 9.98, product4 = 4.49, product5 = 6.87, total, sum = 0;
        int product, quantity;
        System.out.print("Calculating Sales of Product 1 to 5\nPress keys <Ctrl> and 'd' on your computer when " +
                "done inputting product number and quantity sold\nEnter product number and quantity sold as: " +
                "ProductNumber QuantitySold\n");
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            product = Integer.parseInt(input.next());
            quantity = Integer.parseInt(input.next());
            switch (product) {
                case 1:
                    total = quantity * product1;
                    sum += total;
                    break;
                case 2:
                    total = quantity * product2;
                    sum += total;
                    break;
                case 3:
                    total = quantity * product3;
                    sum += total;

                    break;
                case 4:
                    total = quantity * product4;
                    sum += total;

                    break;
                case 5:
                    total = quantity * product5;
                    sum += total;

                    break;
            }

        }
        System.out.printf("Total retail value sold is: %.2f \n", sum);
    }
}