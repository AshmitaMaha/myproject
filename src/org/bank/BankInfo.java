package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("balance is 1200");
	}
	public void fixed() {
		System.out.println("balance is 12000");
	}
	public static void main(String[] args) {
		BankInfo tc = new BankInfo();
		tc.saving();
		tc.deposit();
		tc.fixed();
		
	}
}
