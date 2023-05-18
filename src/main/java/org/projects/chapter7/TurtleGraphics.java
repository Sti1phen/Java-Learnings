//package main.java.org.projects.chapter7;
//
//import java.util.Scanner;
//
///*
//Declare and initialize array floor 20 by 20
//Read Turtle command from array turtleCommand
//set turtle to starting position,
// Initialize middleRow = 7, middleColumn = 7;
//To read command, Use For row =1; till floor.length (last command prompt)
//                    for column
//                    read command
//Use command
//switch command
//perform movement by turtle by setting floor array to 1 for each move,
//otherwise, leave blank
//display movement by * if command = 6,
//create method display
//break if command = 9
//
//create method turnRight (argument row1, row2, column1, column 2)
//if row equal row2 and column1 < column2
// row -=1
//
//if row1 > row2 and column1 equals column2
// column -=1
//if row 1equal row2 and column1 > column2
// column +=1
//if row equal row2 and column1 equals column2
// column +=1
// if row 1 < row2 and column1 equals column2
//
//create method turnLeft
//
//if row equal row2 and column1 < column2
// row +=1
//
//if row1 > row2 and column1 equals column2
// column +=1
//if row 1 < row2 and column1 = column2
// column -=1
//if row equal row2 and column1 equals column2
// column -=1
// if row 1 equal row2 and column > column 2
// row -=1
//
// */
//public class TurtleGraphics {
//
//    public static void main(String[] args) {
//        int[][] floor = new int[20][20];
//        int middleRow = 7, middleColumn = 7;
//        Scanner input = new Scanner(System.in);
//        int[][] turtleCommand = {{2}, {5, 12}, {3}, {5, 12}, {3}, {5, 12}, {3}, {5, 12}, {1}, {6}, {9}};
//
//        for (int row = 0; row < turtleCommand.length; row++) {
//            for (int command = 0; command < turtleCommand[row].length; command++) {
//                switch (turtleCommand[row][command]) {
//                    case 1:
//                        floor[middleRow][middleColumn] = 0;
//                        break;
//                    case 2:
//                        floor[middleRow][middleColumn] = 1;
//                        break;
//                    case 3:
//                        floor[middleRow][middleColumn += 1] = 1;
//
//                        break;
//                    case 4:
//                        floor[middleRow][middleColumn -= 1] = 1;
//                        break;
//                    case 5:
//                        switch ((turtleCommand[row][command + 1])) {
//                            case 1:
//                            case 2:
//                            case 3:
//                            case 4:
//                            case 5:
//                            case 6:
//                            case 7:
//                            case 8:
//                            case 9:
//                            case 10:
//                            case 11:
//                            case 12:
//                            case 13:
//                            case 14:
//                            case 15:
//                            case 16:
//                            case 17:
//                            case 18:
//                            case 19:
//                                for (int movement = 1; movement <= (turtleCommand[row][command + 1]); movement++) {
//
//                                    try {
//                                        floor[middleRow][middleColumn += movement] = 1;
//                                    } catch (ArrayIndexOutOfBoundsException e) {
//                                        System.out.println(e);
//                                        System.out.printf("floor[%d][%d]\n", middleRow, middleColumn);
//                                    }
//                                }
//                        }
//                        break;
//                    case 6:
//                        displayArrayFloor(floor);
//                        break;
//
//                    case 9:
//                        break;
//                }
//            }
//        }
//    }
//
//    public static void displayArrayFloor(int[][] array) {
//        for (int[] ints : array) {
//            for (int column = 0; column < array[0].length; column++){
//                if (ints[column] == 1)
//                    System.out.print("*");
//                else System.out.print(" ");
//        }
//    }
//        System.out.println();
//}
//public static int turnRight(int previousRow, int currentRow, int previousColumn, int currentColumn){
//        if (previousRow == currentRow && previousColumn == currentColumn)
//            return currentColumn +=1;
//        else if (previousRow == currentRow && previousColumn == currentColumn)
//            return
//        else if (previousRow == currentRow && previousColumn == currentColumn)
//            else if ()
//
//        }
//}
//}