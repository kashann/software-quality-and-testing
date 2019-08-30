package Flyweight;

public class TestFlyWeight {

	public static void main(String[] args) {
		CheckFactory checkFactory = new CheckFactory();
		
		ClientCheckInfo[] infos = new ClientCheckInfo[50];
		
		for(int i = 0; i < 50; i++) {
			infos[i] = new ClientCheckInfo("Gigel#" + i, 50 + i * 2);
		}
		
		String[] format = new String[2];
		format[0] = " Good buy!";
		format[1] = " Or else you...";
		
		for(int i = 0; i < 50; i++) {
			checkFactory.getCheckFormat(format[i%2]).print(infos[i]);
		}
		
		System.out.println("---------------------");
		System.out.println("50 objects printed");
		System.out.println(checkFactory.getNoFormatCheck() + " formats stored");
	}
}
