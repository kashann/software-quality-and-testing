package adapterClassesVsObjects;

public class EvaluationA implements IEvaluationA{

	@Override
	public double evA(int total) {
		System.out.println("Method evaluation A");
		if (total > 1000)
			return 0.05;
		return 0;
	}

}
