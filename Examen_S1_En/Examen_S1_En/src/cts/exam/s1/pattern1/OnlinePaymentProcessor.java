package cts.exam.s1.pattern1;

public abstract class OnlinePaymentProcessor {
	String processorName;
	
	public OnlinePaymentProcessor(String processorName){
		this.processorName = processorName;
	}
	
	public abstract void processPayment(String clientName, String eventName, double amount);
}
