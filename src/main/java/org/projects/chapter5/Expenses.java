package main.java.org.projects.chapter5;

public class Expenses {
    private double food;
    private double clothing;
    private double transportation;
    private double vacations;
    private double education;
    private double housing;
    private double healthCare;
    public Expenses(double food, double clothing, double education, double housing,
                    double healthCare, double transportation, double vacations){
        if (food >= 0.0)
            this.food =food;
        else System.out.print("You entered an incorrect expense!");
        if (clothing >= 0.0)
            this.clothing =clothing;
        else System.out.print("You entered an incorrect expense!");
        if (education >= 0.0)
            this.education =education;
        else System.out.print("You entered an incorrect expense!");
        if (housing >= 0.0)
            this.housing =housing;
        else System.out.print("You entered an incorrect expense!");
        if (healthCare >= 0.0)
            this.healthCare =healthCare;
        else System.out.print("You entered an incorrect expense!");
        if (transportation >= 0.0)
            this.transportation=transportation;
        else System.out.print("You entered an incorrect expense!");
        if (vacations >= 0.0)
            this.vacations =vacations;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setFood(double food) {
        if (food >= 0.0)
            this.food =food;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setVacations(double vacations) {
        if (vacations >= 0.0)
            this.vacations =vacations;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setEducation(double education) {
        if (education >= 0.0)
            this.education =education;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setHealthCare(double healthCare) {
        if (healthCare >= 0.0)
            this.healthCare =healthCare;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setHousing(double housing) {
        if (housing >= 0.0)
            this.housing =housing;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setTransportation(double transportation) {
        if (transportation >= 0.0)
            this.transportation=transportation;
        else System.out.print("You entered an incorrect expense!");
    }

    public void setClothing(double clothing) {
        if (clothing >= 0.0)
            this.clothing =clothing;
        else System.out.print("You entered an incorrect expense!");
    }

    public double getClothing() {

        return clothing;
    }

    public double getEducation() {

        return education;
    }

    public double getFood() {

        return food;
    }

    public double getHealthCare() {

        return healthCare;
    }

    public double getHousing() {

        return housing;
    }

    public double getTransportation() {

        return transportation;
    }

    public double getVacations() {

        return vacations;
    }

}
