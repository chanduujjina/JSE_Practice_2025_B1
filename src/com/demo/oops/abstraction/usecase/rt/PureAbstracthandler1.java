package com.demo.oops.abstraction.usecase.rt;

public class PureAbstracthandler1 {
	
	public static void main(String[] args) {
		
		PaymentGateway request1 = new PayPal();
		
		request1.initiatePayment(10000);
		
		request1.verifyPayment("TX10001");
		
		
		
	}
	
	

}

interface PaymentGateway {
	void initiatePayment(double amount);//public abstract
	void verifyPayment(String transactionId);
	
}


class PayPal implements PaymentGateway {

	@Override
	public void initiatePayment(double amount) {
		System.out.println("Pay pal intaited payment :"+amount);
		
	}

	@Override
	public void verifyPayment(String transactionId) {
		System.out.println("Pay pal requested  for the verfication of transaction id :"+transactionId);
		
	}
	
}

class Razorpay implements PaymentGateway {
	@Override
	public void initiatePayment(double amount) {
		System.out.println("Razorpay intaited payment :"+amount);
		
	}

	@Override
	public void verifyPayment(String transactionId) {
		System.out.println("Razorpay requested  for the verfication of transaction id :"+transactionId);
		
	}
}