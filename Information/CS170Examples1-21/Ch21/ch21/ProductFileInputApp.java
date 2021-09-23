package ch21;

//Driver class for ProductFileInput

public class ProductFileInputApp {
    public static void main(String[] args) {
		String fileName = "C:/Java_Art_Examples_1-23/Ch21/productFiles/objects.dat";

		ProductFileInput in = new ProductFileInput();

		in.createInputfile(fileName);
		in.showData();
		in.closeInputFile();
    }
}