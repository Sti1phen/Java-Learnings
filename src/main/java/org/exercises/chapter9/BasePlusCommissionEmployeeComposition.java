package main.java.org.example.chapter9;
/*
Rewrite Class BasePlusCommissionEmployee of CommissionEmployee to use composition rather than inheritance
Write BasePlusCommissionEmployee
Create CommissionEmployee Object and insert object method where and when needed.
 */
public class BasePlusCommissionEmployeeComposition {

    private double baseSalary; // base salary per week
    // six-argument constructor
private CommissionEmployee employee;
//    CommissionEmployee employee = new CommissionEmployee("Bob","Lewis",
//            "333-33-333-33", 300.00, 0.04);
    public BasePlusCommissionEmployeeComposition( double baseSalary, CommissionEmployee employee) {
        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }
    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }
    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }
    // calculate earnings
    public double earnings() {
        return getBaseSalary() + employee.earnings();
    }
    // return String representation of BasePlusCommissionEmployee
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                employee.toString(), "base salary", getBaseSalary());
    }
}
