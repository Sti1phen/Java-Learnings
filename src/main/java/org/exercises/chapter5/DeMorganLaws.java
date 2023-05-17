package main.java.org.example.chapter5;

public class DeMorganLaws {
    public static void main(String[] args) {
        int x =6, y = 7, a =7, j =7, g =5, b=5,i =6;
System.out.print(!(x<5) && !(y>=7)); System.out.print(!((x<5) || (y>=7)));
System.out.println();
        System.out.print(!(a==b) || !(g!=5));System.out.print(!((a==b) && (g!=5)));
        System.out.println();
        System.out.print(!((x<=8) && (y>4)));System.out.print(!(x<=8) || !(y>4));
        System.out.println();
System.out.print(!((i > 4) || (j<=6)));System.out.print(!(i > 4) && !(j<=6));
        System.out.println();



    }
}
