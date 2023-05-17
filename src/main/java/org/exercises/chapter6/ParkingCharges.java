package main.java.org.example.chapter6;
/*
Calculate and DisplayParking Charges of each customer that Parked yesterday and also display charge of the current customer
Initialize parking garage fee for 3 hours
double initFees = 2.00
Enter each customer's parking duration
create a non-static method that ask for duration in hours and minutes that a customer parked for
Instance variable
name, duration
duration no more than 24 hours

create method calculateCharge
charge for first three hours initFees = 2
Charge over 10 will equals 10
 */
public class ParkingCharges {
    private String name;
    private double duration;
    public ParkingCharges(String customerName, double duration){
        name = customerName;
        if (duration >=1|| duration < 25)
            this.duration = duration;
        if (duration > 24)
            this.duration =24;
        if (duration < 1)
            this.duration = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDuration(double duration) {
        if (duration >=1|| duration < 25)
            this.duration = duration;
        if (duration > 24)
            this.duration =24;
        if (duration < 1)
            this.duration = 1;
    }

    public double getDuration() {
        return duration;
    }

    public double calculateCharge (){
        double additionalFees = 0.5;
        double initialFees = 2.00;
        double customerCharge = 0.0;
        if (duration <= 3)
            customerCharge = initialFees;
        if (duration > 3)
            customerCharge = initialFees + (duration - 3) * additionalFees;
        if (customerCharge > 10.00)
            customerCharge = 10.00;
        return customerCharge;
        }

    }
