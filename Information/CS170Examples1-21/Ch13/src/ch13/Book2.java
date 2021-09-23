package ch13;
//Demo: subclass Book2 inherits Item for lower bound test

public class Book2 extends Item {
		private String publisher;

		public Book2(String name, double price, String publisher) {
			super(name, price);
			this.publisher = publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getPublisher() {
			return publisher;
		}
		public String toString() {
			return super.toString() + " publisher: " + publisher;
		}
	}