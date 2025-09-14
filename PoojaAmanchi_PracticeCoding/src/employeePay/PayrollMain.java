package employeePay;

/*2. Employee Payroll System (Inheritance & Polymorphism) Scenario: 
 * A company has different types of employees: full-time, part-time, and contract. 
 * Each type has a different way of calculating salary. I
 *  Key OOPs Concepts: Inheritance: All employees inherit from Employee. Polymorphism: calculateSalary() behaves differently for each subclass.
 */
public class PayrollMain {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Pooja", 40000);
        Employee e2 = new PartTimeEmployee(102, "Priya", 120, 200);
        Employee e3 = new ContractEmployee(103, "Shreya", 80000);

        e1.showDetails();
        System.out.println("Salary: " + e1.calculateSalary());

        e2.showDetails();
        System.out.println("Salary: " + e2.calculateSalary());

        e3.showDetails();
        System.out.println("Salary: " + e3.calculateSalary());
    }
}
