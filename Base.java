public class Base {

	static int priceOfEggs = 20;

	public static void main(String[] args) {
		System.out.println(eggCalculator(17));

	}
	
	static int eggCalculator(int howManyEggs) {
		return howManyEggs * priceOfEggs;
	}

}
