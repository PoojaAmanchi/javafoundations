package bankAccountSystem;

/*
 * 4. Bank Account System (Encapsulation & Inheritance) Scenario: 
 * A bank offers savings and checking accounts. Both have deposit and withdraw methods, but only savings accounts earn interest.
 */
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA1001", "Pooja", 5000, 0.05);
        CheckingAccount ca = new CheckingAccount("CA2001", "Priya", 3000);

        System.out.println("Savings Account");
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.addInterest();

        System.out.println("\nChecking Account");
        ca.deposit(500);
        ca.withdraw(1000);
    }
}
