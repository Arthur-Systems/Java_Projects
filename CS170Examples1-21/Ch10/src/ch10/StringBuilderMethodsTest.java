package ch10;

//Test methods in StringBuilder class

public class StringBuilderMethodsTest {
   public static void main( String args[] ) {
	   StringBuilder phone = new StringBuilder("510-651-5168");
	   int length = phone.length();
	   System.out.println("length = " + length);	//length = 12

	   int capacity = phone.capacity();
	   System.out.println("capacity = " + capacity); //capacity = 28

	   phone.setLength(3);
	   System.out.println("phone = " + phone);  //phone = 510
	   System.out.println("capacity = " + phone.capacity()); //capacity = 28

	   phone.setLength(12);
	   System.out.println("phone = " + phone);				//phone = 510
	   System.out.println("capacity = " + capacity);		//capacity = 28

	   StringBuilder phone2 = new StringBuilder("510-651-5168");
	   phone2.append(" ext. 299");		//phone2 = "510-651-5168 ext. 299"
	   System.out.println("phone2 = " + phone2);

	   phone2.delete(4, 7);				//phone2 = "510--5168 ext. 299"
	   System.out.println("phone2 = " + phone2);

	   phone2.insert(4, "659");			//phone2 = "510-659-5168 ext. 299"
	   System.out.println("phone2 = " + phone2);

	   phone2.replace(0, 3, "408");		//phone2 = "408-659-5168 ext. 299"
	   System.out.println("phone2 = " + phone2);

	   phone2.deleteCharAt(7);			//phone2 = "408-6595168 ext. 299"
	   System.out.println("phone2 = " + phone2);

	   phone2.setCharAt(2, '9');			// phone2 = "409-6595168 ext. 299"
	   System.out.println("phone2 = " + phone2);
	}
}




