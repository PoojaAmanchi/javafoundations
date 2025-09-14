package com.deloi.javafoundation.day2;

abstract class AbstractAccount {
	final static long accNo= 12002490;
	String accType="Savings";
	public AbstractAccount() {
		System.out.println("Account Created");
	}
	abstract protected void trx();
	public void getIFSC() {
		System.out.println("ICIC000054");
	}
	
}
