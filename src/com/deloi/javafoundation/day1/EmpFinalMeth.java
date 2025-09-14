package com.deloi.javafoundation.day1;
class Dept{
	final void m1() {
		//error cause final method cannot be overridden
	}
}
public class EmpFinalMeth extends Dept {
@override
void m1() {
	
}
}
