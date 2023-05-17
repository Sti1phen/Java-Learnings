package main.java.org.example.chapter6;
/*
Create objects of class Parking Charges
Calculate current customers charge
calculate total running charge for yesterday's receipts
    Sum the current charge for all customers
 */
public class ParkingChargesTest {
    public static void main(String[] args) {
        double total =0;
        ParkingCharges user1 = new ParkingCharges("Nkechi", 24);
        user1.calculateCharge();
        total += user1.calculateCharge();
        System.out.printf("%s spent %.1f hours\nParking Charge due is: %.2f\nTotal running receipt is: %.2f\n",
                user1.getName(),user1.getDuration(),user1.calculateCharge(), total);
        ParkingCharges user2 = new ParkingCharges("Chioma", 0.5);
        user2.calculateCharge();
        total += user2.calculateCharge();
        System.out.printf("%s spent %.1f hours\nParking Charge due is: %.2f\nTotal running receipt is: %.2f\n",
                user2.getName(),user2.getDuration(),user2.calculateCharge(), total);
        ParkingCharges user3 = new ParkingCharges("David", 12);
        user3.calculateCharge();
        total += user3.calculateCharge();
        System.out.printf("%s spent %.1f hours\nParking Charge due is: %.2f\nTotal running receipt is: %.2f\n",
                user3.getName(),user3.getDuration(),user3.calculateCharge(), total);

    }
}