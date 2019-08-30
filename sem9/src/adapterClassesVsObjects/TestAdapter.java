package adapterClassesVsObjects;

public class TestAdapter {
	
	public static void main(String[] args) {
		//Company A
		System.out.println("COMPANY A");
		IEvaluationA evaluationA = new EvaluationA();
		System.out.println(evaluationA.evA(1500));
		
		//COMPANY B
		Client c = new Client("Gigel", 2, new int[] {100, 1500});
		//IEvaluationB evaluationB = new EvaluationB();
		IEvaluationB evaluationB = new AdapterEvaluationClasses(); //or new AdapterEvaluationObjects();
		System.out.println(evaluationB.evB(c));
	}	
}
