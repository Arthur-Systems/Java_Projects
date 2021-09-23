package ch12;
//package ch12;

enum DiscountType2 {										//De enum
	//Define enumeration type:  each member field has two subfields
	 BASIC_DISCOUNT("for new customers", "10%"),
	 EXTRA_DISCOUNT("for returning customers", "20%"),
	 SUPER_DISCOUNT("for royal customers with 3 years", "30%");

	 final private String explain;
	 final private String rate;

	 private DiscountType2(String explain, String rate) {			//Constructor
		 this.explain = explain;
		 this.rate = rate;
	 }
	 public String getExplain() {									//Methods
		 return explain;
	 }
	 public String getRate() {
		 return rate;
	 }
}
