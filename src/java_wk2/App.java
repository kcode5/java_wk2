package java_wk2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declarations
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 2;
		double moneyInWallet = 4;
		int thirstLevel = 6;				
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		boolean willGoSwimming = (isHotOutside && !isWeekday);
		boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekday);
		boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk));
				
		//print even numbers from 0 to 100
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println();
				
		//print every 3rd number counting back from 100 to 0
		i = 100;
		while (i >= 0) {
			System.out.println(i);
			i = i - 3;
		}
		System.out.println();
				
		//print every other number from 1 to 100
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println();
				
		//print every number from 1 to 100. if div by 3. print "Hello". if div by 5
		//print "World". if div by both 3 and 5, print "Hello World".
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hello World");
			}
			else if (i % 3 == 0) {
				System.out.println("Hello");
					}
			else if (i % 5 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(i);
			}	
		}	
	}
}
