package ch13;
//package ch13;
//Demo: test of GeneItems

public class GeneItemsTest {
	public static void main(String[] args) {
		GeneItems<String, Integer, Double> items = new GeneItems<String, Integer, Double>("Java", 15, 79.89);
		items.setSecondObj(20);
		System.out.println("Item name: " + items.getFirstObj()
							+ " number: " + items.getSecondObj()
							+ " price: " + items.getThirdObj());
	}
}