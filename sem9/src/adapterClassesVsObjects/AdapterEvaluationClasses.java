package adapterClassesVsObjects;

public class AdapterEvaluationClasses extends EvaluationA implements IEvaluationB{

	//method for transforming from Client to int
	int transform(Client c) {
		int total = 0;
		for(int i = 0; i < c.getNoEvents(); i++)
			total += c.getEventCost(i);
		return total;
	}
	
	@Override
	public double evB(Client client) {
		System.out.println("Method evaluation B");
		return this.evA(transform(client));
	}

}
