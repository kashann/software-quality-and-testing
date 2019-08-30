package Behavioral.State;

public class TestState {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.afisare("exemplu 1");
		editor.setStare("bold");
		editor.afisare("exemplu 2");
	}

}
