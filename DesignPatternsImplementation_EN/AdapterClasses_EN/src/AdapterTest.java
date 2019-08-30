
public class AdapterTest {

	public static void main(String[] args) {
		//Company A
		System.out.println("COMPANY A");
		IEvaluationA evaluationA = new EvaluationA();
		System.out.println(evaluationA.evA(1500));
		
		//Company B
		Client c = new Client("Gigel", 2, new int[] {100,1500});
		System.out.println("COMPANY B");
		//IEvaluationB evaluationB = new EvaluationB();
		IEvaluationB evaluationB = new AdapterEvaluationClasses();
		System.out.println(evaluationB.evB(c));
		
	}

}
