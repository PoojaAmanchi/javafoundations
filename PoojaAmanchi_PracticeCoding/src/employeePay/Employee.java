package employeePay;

public abstract class Employee {
    protected int id;
    protected String name;
    public Employee() {
    	
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public abstract double calculateSalary();

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}