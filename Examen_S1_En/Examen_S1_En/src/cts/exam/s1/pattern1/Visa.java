package cts.exam.s1.pattern1;

public class Visa extends OnlinePaymentProcessor{

	public Visa(String processorName) {
		super(processorName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(String clientName, String eventName, double amount) {
		System.out.println("(Visa) " + processorName + " is getting " + amount + "RON from " + clientName + " (" + eventName + ")");
	}

}
