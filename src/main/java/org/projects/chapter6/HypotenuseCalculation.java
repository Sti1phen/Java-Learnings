package main.java.org.projects.chapter6;
/*
Display Table with Triangles, sides, and Hypotenuse
Use method Hypotenuse.hypotenuse to calculate the hypotenuse
 */
public class HypotenuseCalculation {
    public static void main(String[] args) {
        System.out.println("Triangle\tSide 1\tSide 2\tHypotenuse");
        System.out.printf("1\t\t\t3.0\t\t4.0\t\t\t%.2f\n", Hypotenuse.hypotenuse(3.0, 4.0));
        System.out.printf("2\t\t\t5.0\t\t12.0\t\t%.2f\n", Hypotenuse.hypotenuse(5.0,12.0));
        System.out.printf("3\t\t\t8.0\t\t15.0\t\t%.2f\n", Hypotenuse.hypotenuse(8.0,15.0));
    }
}
