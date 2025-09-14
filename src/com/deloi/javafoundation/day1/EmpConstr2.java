package com.deloi.javafoundation.day1;

public class EmpConstr2 {
int eid;
String eName;
String loc;
public EmpConstr2(){
	
}
public EmpConstr2(int eid1, String eName1, String loc) {
	super();
	eid = eid1;
	eName = eName1;
	this.loc = loc;
}
void show() {
	System.out.println("eid: "+eid+" eName: "+eName+" loc: "+loc);
}
public static void main(String[] args) {
	EmpConstr2 e1=new EmpConstr2(1,"Pooja","hyd");
	e1.show();
}
}
