package main.java.org.example.chapter7;

import java.util.Scanner;

/*
Collect ProductNumber SalesPersonNumber DollarValue daily
Add dollarValue by ProductNumber and by SalePersonNumber
Store these in array sales
display array sales in a tabular format with totaled row and totaled column

Initialize ProductNumber1 ProductNumber2 ProductNumber3 ProductNumber4 ProductNumber5
salesNumber1 salesNumber2 salesNumber3 salesNumber4
initialize array double sales as 5 by 4
Initialize day = 1
While day is less than or equal 30
Increment day
Prompt user to enter Salesperson number product number total dollar value of product sold
Input user's response
responseProduct
responseSalesPerson
responseDollarValue
sales[responseProduct][responseSalesPerson] += dollarValue

Create method display
argument two-dimensional array
Print Column header %5\t
for count < sales[0].length Sales Person %d
Print newline
Print array header
for count < sales.length    Product Number %d
Println total
    for (double sale : [] sales)
        Print each
   rowTotal method
   Print newline

ColumnTotal method


create method rowTotal
double rowTotal =0;
argument double [] row
for double column : row
rowTotal +=column
return rowTotal

create method column total
argument sales
double [] columnTotal = new double [sales[0].length]
for count = 0, count < sale.length
    for column < sales[0].length
        columnTotal[column] +=sales[count][column]
return columnTotal
for counter < columnTotal. length
    Print columnTotal[counter]
    Print tab
 */
public class TotalSales {
    private double[][] sales = new double [5][4];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] sales = new double[5][4];
        for (int day = 1; day <= 1; day++) {
            System.out.printf("Day %d\n", day);
            for (int productNumber = 0; productNumber < sales.length; productNumber++) {
                for (int salesPersonNumber = 0; salesPersonNumber < sales[0].length; salesPersonNumber++) {
                    System.out.printf("Please enter the dollar value of Product %d submitted " +
                            "by Sales Person %d: ", productNumber + 1, salesPersonNumber + 1);

                    double responseDollarValue = input.nextDouble();
                    sales[productNumber][salesPersonNumber] += responseDollarValue;
                }
                System.out.println();
            }
        }
        displayTwoDimensionalArray(sales);
    }
    public static double rowTotal(double [] rows) {
        double rowTotal = 0;
        for (double salesPersonByProduct : rows)
            rowTotal += salesPersonByProduct;
        return rowTotal;
    }
    public static void columnTotal(double [][] array) {
        double[] columnTotal = new double[array[0].length];
        for (double[] doubles : array) {
            for (int salesBySalesPerson = 0; salesBySalesPerson < array[0].length; salesBySalesPerson++)
                columnTotal[salesBySalesPerson] += doubles[salesBySalesPerson];
        }
        System.out.printf("%16s", "Total");
            for (double v : columnTotal)
                System.out.printf("%13.2f\t", v);
            System.out.println();

        }

        public static void displayTwoDimensionalArray (double[][] array){
            System.out.print("                 ");
            for (int columnHeader = 0; columnHeader < array[0].length; columnHeader++) {
                System.out.printf("Salesperson %d\t", columnHeader + 1);
            }
            System.out.println("Total");
            for (int row = 0; row < array.length; row++) {
                System.out.printf("Product Number %d", row + 1);

                for (double sale : array[row])
                    System.out.printf("%13.2f\t", sale);
            System.out.println(rowTotal(array[row]));
            }
            columnTotal(array);
        }
    }
