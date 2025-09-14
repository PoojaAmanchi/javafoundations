package com.deloi.javafoundation.day2;

public class AbstractAccImplBank extends AbstractAccount {
	@Override
	protected void trx() {
		System.out.println("Trx Success");
	}
	public static void main(String[] args) {
		AbstractAccImplBank b=new AbstractAccImplBank();
		System.out.println(accNo);
		System.out.println(b.accType);
		b.trx();
		b.getIFSC();
	}
	

}
