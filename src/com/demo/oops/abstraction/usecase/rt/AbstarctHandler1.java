package com.demo.oops.abstraction.usecase.rt;

public class AbstarctHandler1 {
	
	public static void main(String[] args) {
		Bank request1 = new HDFC("HDFC");
		double calculateInterest = request1.calculateInterest(100000, 2);
		
		System.out.println(calculateInterest);
		
		Bank request2 = new ICICI("ICICI");
		
		double calculateInterest2 = request2.calculateInterest(200000, 1);
		
		System.out.println("Bank name "+request2.getBankName()+" intereset amount::"+calculateInterest2);
		
		
	}

	
}

abstract class Bank {
	
	
	private String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	abstract double getRateOfInterest();
	
	//concrete method
	public double calculateInterest(double principal, double time) {
		
		return (principal*time*getRateOfInterest())/100;
	}

}


class HDFC extends Bank {
	
	
	public HDFC(String bankName) {
		super(bankName);
	}

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.2;
	}
}

class SBI extends Bank {
	public SBI(String bankName) {
		super(bankName);
	}

	@Override
	double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.8;
	}
}

class ICICI extends Bank {
	public ICICI(String bankName) {
		super(bankName);
	}

	@Override
	double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.5;
	}
}