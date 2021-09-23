package ch12;

//Demo: use of enum type

public class EnumTest3 {
	   public static void main( String args[] ) {

		   	for(DiscountTypes type : DiscountTypes.values())
		   	    System.out.println("type: " + type.getExplain() + " rate: " + type.getRate());

		    for(Coin type : Coin.values())
		   	    System.out.println("type: " + type.getValue());
		}
	}

	enum DiscountTypes {

		 BASIC_DISCOUNT("for new customers", "10%"),
		 EXTRA_DISCOUNT("for returing customers", "20%"),
		 SUPER_DISCOUNT("for royal customers with 3 years", "30%");

		 final private String explain;
		 final private String rate;

		 private DiscountTypes(String explain, String rate) {
			 this.explain = explain;
			 this.rate = rate;
		 }
		 public String getExplain() {
			 return explain;
		 }
		 public String getRate() {
			 return rate;
		 }
	 }

	enum Coins {
		PENNY { int value() { return 1; }},
	    NICKLE { int value() { return 5; }},
		DIME { int value() { return 10; }},
		QUARTER { int value() { return 25; }};

		abstract int value();					//必须定义为抽象方法
	}

	enum Coin {
		PENNY (1),
	    NICKEL (5),
		DIME (10),
		QUARTER (25);
		private int value = 0;

	Coin(int value) {					//构造器
	  this.value = value;
	}

	int getValue() {
	  return value;
		}
	}