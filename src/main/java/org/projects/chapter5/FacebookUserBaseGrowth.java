package main.java.org.projects.chapter5;
/*
Initialize principal, amount(user2), principal(user1) and, number of month, rate;
rate factor = 1+r, interest-equivalent = amount/principal;
Use for to calculate the number of month it will take to get to 1.5 billion and 2 billion
for user1 to user 2 user++
 */
public class FacebookUserBaseGrowth {
    public static void main(String[] args) {
        double amount1, amount2, principal = 1000000000, number = 1;
        double rateFactor = 1 + 0.04;
        for (amount1 = 1000000000; amount1 <= 1500000000; amount1++) {
            double compoundInterest = amount1 / principal;
            number = ((Math.log10(compoundInterest)) / (Math.log10(rateFactor)));
        }
        System.out.printf("The number of month Facebook will take to grow its user base to 1.5 billion is: %.1f\n\n", number);

        for (amount2 = 1000000000; amount2 <= 2000000000; amount2++) {
            double compoundInterest = amount2 / principal;
            number = ((Math.log10(compoundInterest)) / (Math.log10(rateFactor)));
        }
        System.out.printf("The number of month Facebook will take to grow its user base to 2 billion is: %.1f\n\n", number);
    }
}
