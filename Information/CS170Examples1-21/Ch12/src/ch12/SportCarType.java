package ch12;

enum SportCarType {
	PORSCHE("Made: Germany", 120000),
	FERRARI("Made: Italy", 150000),
	JAGUAR("Made: English", 110000);

	final private String make;
	final private int price;
	private SportCarType(String make, int price) {
		this.make = make;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public int getPrice() {
		return price;
	}
}
