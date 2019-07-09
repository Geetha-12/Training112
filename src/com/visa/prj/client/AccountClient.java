package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("SB1210");
		Account sec = new Account("SB120");
		
		first.deposit(5000); //while compiling becomes deposit(first,5000)
		sec.deposit(2500);		
		System.out.println("first account");
		System.out.println("Balance : " + first.getBalance());
		
		System.out.println("second account");
		System.out.println("Balance : " + sec.getBalance());
		
		System.out.println("*********");
		
		Account mohan = new Account("SB143");
		Account goutham = new Account("SB143");
		Account ref = mohan;
		
		if(ref == mohan) {
			System.out.println("ref and mohan points to same location");
		}
		if(mohan.equals(goutham)) {
			System.out.println("Same content!!!");
		}
	}
		
		

}
