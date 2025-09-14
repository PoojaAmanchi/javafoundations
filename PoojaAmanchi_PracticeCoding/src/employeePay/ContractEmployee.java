package employeePay;

public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(int id, String name, double contractAmount) {
    	this.id = id;
        this.name = name;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}
