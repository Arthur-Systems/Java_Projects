package ch12;
//Demo: use of varargs

public class VarargsTest {
   public static void main( String args[] ) {

	   printInvitation("John Wang", "David Smith");
	   printInvitation("Greg Wu", "Paul Nuygen", "Liu Wei", "Kui Zhang");
	   printInvitation();			//Default

	   printInvitation("Yongqiang Gao");

	   System.out.println("sum = " + sumInts(199, 99, 399, 77, 64));

	   totalTax("Jennifer Li", 0.0875, 2899.89, 3109.29, 2930.29);

	}

	public static void printInvitation(String...names) {
		for (String name : names) {
			//makeCard(name);
			System.out.println("Recording info: invitation card has been printed for " + name);
		}
	}
	public static void printInvitation(String name) {
		System.out.println("name = " + name);
	}

	public static int sumInts(int...numbers) {
		int sum = 0;
		for (int num : numbers)
			sum +=num;
		return sum;
	}

	public static void totalTax(String name, double rate, double...amounts) {
		double total = 0.0,
		       tax = 0.0;

		for (double amount : amounts)
			total += amount;

		tax = total * rate;
		System.out.println("Name: " + name + "\nTotal: " + total + "\ntax: " + tax);
	}

}

