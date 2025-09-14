package com.deloi.javafoundation.day2;

public class EmpTask1Impl extends Emptask1AbsEncap {

    @Override
 public void showDetails() {
        System.out.println("EID: " + getEid() + "  Location: " + loc +
           "  Salary: " + getSal() + "  Loan: " + getLoanAmt()+" pf:"+pf);
    }

    public static void main(String[] args) {
        EmpTask1Impl emp = new EmpTask1Impl();
        emp.setEid(101);
        emp.setSal(60000);
        emp.setLoanAmt(5000);

        emp.showDetails();
       
    }
}

