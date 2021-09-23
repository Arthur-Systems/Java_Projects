package ch12;

//Demo: use of enum type

public class EnumTest {
 public static void main( String args[] ) {

	    DiscountType myDiscount;

	    myDiscount = DiscountType.BASIC_DISCOUNT;

	    System.out.println(myDiscount.name());
	    System.out.println(myDiscount.toString());

		System.out.println(myDiscount.ordinal());

	    DiscountType yourDiscount = myDiscount;


	  	if (myDiscount.equals(yourDiscount))
			System.out.println("We got the same for basic discount for new customers - 10%.");

		if (myDiscount == yourDiscount)
			System.out.println("We are referring to the same memory location.");

		int compareResult1 = myDiscount.compareTo(yourDiscount);
			System.out.println("compareResult1 = " + compareResult1);

		int compareResult2 = myDiscount.compareTo(DiscountType.SUPER_DISCOUNT);
			System.out.println("compareResult2 = " + compareResult2);
	}
}

enum DiscountType {
	 BASIC_DISCOUNT ,
	 EXTRA_DISCOUNT ,
	 SUPER_DISCOUNT;
}
