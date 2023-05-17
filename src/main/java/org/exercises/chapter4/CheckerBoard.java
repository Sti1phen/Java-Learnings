package main.java.org.example.chapter4;
/*
Display checkerBoard Pattern
Initialize variable count =8;

Use System.out.print("*");
    System.out.print(" ");
    System.out.println();

While count <=8
    if count == 2 || count =4|| count ==6||count ==8
        int y = 1;
        while y <=9
            if y == 1
                System.out.print(" ");
            else
                System.out.print("* ");
                x++;
                System.out.println();
    else

    int x  =1;
    while x <=8
        System.out.print("* ");
        x++;
        System.out.println();
 */
public class CheckerBoard {
    public static void main(String[] args) {

        int count =1;
        while (count <=8)
        {
            if (count == 2 || count == 4 || count == 6 || count == 8)
            {
                int y =1;
                while (y <=9)
                {
                    if (y ==1)
                        System.out.print(" ");
                    else
                    {
                        System.out.print("* ");
                    }
                    y++;
                }
                System.out.println();
            }
            else
            {
                int x = 1;
                while (x <= 8)
                {
                    System.out.print("* ");
                    x++;
                }
                System.out.println();
            }
            count++;
        }
    }
}