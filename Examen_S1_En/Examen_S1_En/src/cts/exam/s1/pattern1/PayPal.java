package cts.exam.s1.pattern1;

public class PayPal extends OnlinePaymentProcessor{

	public PayPal(String processorName) {
		super(processorName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(String clientName, String eventName, double amount) {
		System.out.println("(PayPal) " + processorName + " is getting " + amount + "RON from " + clientName + " (" + eventName + ")");
	}

}
