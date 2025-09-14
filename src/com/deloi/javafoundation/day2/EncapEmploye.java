package com.deloi.javafoundation.day2;

public class EncapEmploye {
    private int eid;
    private String name;
    private int salary = 10000; // default salary

    // Getters & Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    // Calculate new salary after adding PF percentage
    public void calSal(int percentage) {
        double pf = salary * percentage / 100.0;
        salary += pf;   // add calculated PF to salary
        show();
    }
    public void show() {
        System.out.println("Id: " + eid + " Name: " + name +
        		" Salary: " + salary);
    }
}
