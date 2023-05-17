package main.java.org.example.chapter9;
/*

 */
public class BasePlusCommissionEmployeeCompositionTest {
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("Bob", "Lewis", "3333-33-3333",
                5000, 0.04);
        BasePlusCommissionEmployeeComposition employee1 =
                new BasePlusCommissionEmployeeComposition(1000, employee);

        // get base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:\n");
        System.out.printf("%s %s%n", "First name is",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee1.getBaseSalary());

        employee1.setBaseSalary(1000);
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
    } // end main
} // end class BasePlusCommissionEmployeeTest