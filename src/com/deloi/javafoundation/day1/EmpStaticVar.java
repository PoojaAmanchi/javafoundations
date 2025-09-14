package com.deloi.javafoundation.day1;
public class EmpStaticVar {
	int eid;
	String eName;
	static String org = "ABC";

	public EmpStaticVar(int eid, String eName) {
		this.eid = eid;
		this.eName = eName;
	}

	void show() {
		System.out.println(eid + " " + eName + " " + org);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpStaticMeth e1 = new EmpStaticMeth(123, "priya");
		EmpStaticMeth e2 = new EmpStaticMeth(345, "praneetha");
		e1.show();
		e2.show();

	}

}
