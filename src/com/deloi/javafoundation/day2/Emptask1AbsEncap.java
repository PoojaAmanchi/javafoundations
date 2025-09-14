package com.deloi.javafoundation.day2;
public abstract class Emptask1AbsEncap {
    private int eid;
    private int sal;
    private int loanAmt;
    protected final static String loc = "Hyderabad";
    protected final static int pf = 18000;
    public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(int loanAmt) {
		this.loanAmt = loanAmt;
	}
	// Abstract method
    public abstract void showDetails();
   
}
