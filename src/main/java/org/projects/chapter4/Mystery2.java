package main.java.org.projects.chapter4;

//// Exercise 4.25: Mystery2.java
//public class Mystery2
//{
//    public static void main(String[] args)
//    {
//        int count = 1;
//        while (count <= 10)
//        {
//            System.out.println(count % 2 == 1 ? "****" : "++++++++");
//            ++count;
//        }
//    }
//} // end class Mystery2

// Exercise 4.26: Mystery3.java
public class Mystery2
{
    public static void main(String[] args)
//    {
//        int row = 10;
//        while (row >= 1)
//        {
//            int column = 1;
//            while (column <= 10)
//            {
//                System.out.print(row % 2 == 1 ? "<" : ">");
//                ++column;
//            }
//            --row;
//            System.out.println();
//        }
//    }
//} // end class Mystery3
    {
        int x =9; int y = 11;
//        if (x < 10)
//            if (y > 10)
//                System.out.println("*****");
//            else
//                System.out.println("#####");
//
//            System.out.println("$$$$$");
        if (x < 10)
        {
            if (y > 10)
                System.out.println("*****");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

    }
}