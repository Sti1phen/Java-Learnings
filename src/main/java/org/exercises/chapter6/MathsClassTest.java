package main.java.org.example.chapter6;
/*
Verify if example 6.2 is correct
 */
public class MathsClassTest {
    public static void main(String[] args) {
        System.out.println("Methods\t\tExample");
        System.out.print("abs(x)\t\t");
        System.out.printf("%.1f\n", Math.abs(23.7));
        System.out.print("abs(x)\t\t");
        System.out.printf("%.1f\n", Math.abs(0.0));
        System.out.print("abs(x)\t\t");
        System.out.printf("%.1f\n", Math.abs(-23.7));
        System.out.print("ceil(x)\t\t");
        System.out.printf("%.1f\n", Math.ceil(9.2));
        System.out.print("ceil(x)\t\t");
        System.out.printf("%.1f\n", Math.ceil(-9.8));
        System.out.print("floor(x)\t");
        System.out.printf("%.1f\n", Math.floor(-9.2));
        System.out.print("cos(x)\t\t");
        System.out.printf("%.1f\n", Math.cos(0.0));
        System.out.print("exp(x)\t\t");
        System.out.printf("%.1f\n", Math.exp(1.0));
        System.out.print("abs(x)\t\t");
        System.out.printf("%.1f\n", Math.abs(23.7));
        System.out.print("log(x)\t\t");
        System.out.printf("%.1f\n", Math.log(Math.E*Math.E));
        System.out.print("max(x,y)\t");
        System.out.printf("%.1f\n", Math.max(2.3,12.7));
        System.out.print("min(x,y)\t");
        System.out.printf("%.1f\n", Math.min(2.3, 12.7));
        System.out.print("min(x,y)\t");
        System.out.printf("%.1f\n", Math.min(-2.0,-12.7));
        System.out.print("Exponentiation Method(base, integer)\t");
        System.out.printf("%d\n", Exponentiation.integerPower(3, 4));
        System.out.print("sin(x)\t\t");
        System.out.printf("%.1f\n", Math.sin(0.0));
        System.out.print("sqrt(x)\t\t");
        System.out.printf("%.1f\n", Math.sqrt(900));
        System.out.print("tan(x)\t\t");
        System.out.printf("%.1f\n", Math.tan(0.0));
        System.out.print("floor(x)\t\t");
        System.out.printf("%.1f\n", Math.floor(7.5));
        System.out.print("abs(x)\t\t");
        System.out.printf("%.1f\n", Math.abs(0.0));
        System.out.print("ceil(x)\t\t");
        System.out.printf("%.1f\n", Math.ceil(0.0));
        System.out.print("abs(x)\t\t");
        System.out.printf("%.1f\n", Math.abs(-6.4));
        System.out.print("ceil(x)\t\t");
        System.out.printf("%.1f\n", Math.ceil(-6.4));
        System.out.print("ceil(x)\t\t");
        System.out.printf("%.1f\n", Math.ceil(-Math.abs(-8+Math.floor(-5.5))));


    }
}