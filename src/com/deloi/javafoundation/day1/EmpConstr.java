package com.deloi.javafoundation.day1;
public class EmpConstr {
int eid;
String eName;
String loc;
public EmpConstr(){
	
}
public EmpConstr(int eid, String eName, String loc) {
	super();
	this.eid = eid;
	this.eName = eName;
	this.loc = loc;
}
void show() {
	System.out.println("eid: "+eid+" eName: "+eName+" loc: "+loc);
}
public static void main(String[] args) {
	EmpConstr e1=new EmpConstr(1,"Pooja","hyd");
	e1.show();
}
}
