package main.java.org.example.chapter4;
/*
Display Multiples of two in an infinite loop
Initialize variable, number = 2
//While loop (since it will keep displaying the multiples
while number == 2
    number *= number;
 */
public class Multiple2LoopInfinte {
    public static void main(String[] args) {
        int number =2;
        while (number !=0)
        {
            int x =2;
            number *= x;
            System.out.printf("%d\n", number);
        }
    }
    /*
    Question 4.34
    int sum
    int x, y;
    sum = x + y;
    System.out.printf("%d\n", sum+=1);
     */
}