package ch21;

public class ProductFileInput {
	ObjectInput in;
	Object object;
	Product product;
	int count = 0;
	double 	price = 0.0,
			total = 0.0;

public void createInputfile(String fileName) {
	in = new ObjectInput(fileName);
}
public void showData() {;
	while (in.hasMore()) {
		object = in.getObject();
		if (object instanceof Product) {
			product = (Product)object;
			System.out.println("Data " + ++count);
			System.out.println("Product ID: " + product.getID());
			System.out.println("Product tile: " + product.getTitle());

			price = product.getPrice();
			System.out.println("Product price: " + Formatter.currency(price));
			total += price;
		}
		else break;
	}
	System.out.println("Price total: " + Formatter.currency(total));
}
public void closeInputFile() {
	in.closeFile();
}
}