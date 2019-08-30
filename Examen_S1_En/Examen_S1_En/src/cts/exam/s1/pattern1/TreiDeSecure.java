package cts.exam.s1.pattern1;

import java.util.ArrayList;

public class TreiDeSecure implements OnlinePaymentInterface{
	private ArrayList<OnlinePaymentProcessor> procesori;
	
	public TreiDeSecure() {
		super();
		this.procesori = new ArrayList<OnlinePaymentProcessor>();
	}
	
	public void addProcessor(OnlinePaymentProcessor p) {
		procesori.add(p);
	}

	@Override
	public void onlinePay() {
		for (OnlinePaymentProcessor p : procesori) {
			p.processPayment("client", "event", 1234);
		}
		procesori.clear();
	}

}
