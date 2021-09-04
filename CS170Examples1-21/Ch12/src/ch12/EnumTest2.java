package ch12;
//package ch12;

//import static ch12.DiscountType2.*;		//Static import

public class EnumTest2 {
   		public static void main( String args[] ) {

	   		for(DiscountType2 type : DiscountType2.values())		////Call values()
	   	    	System.out.println("type: " + type.getExplain() + " rate: " + type.getRate());

		}
}
