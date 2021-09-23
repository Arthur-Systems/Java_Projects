package ch21;

//Driver class for ProductObjectFileOutput

public class ProductObjectFileOutputApp {
    public static void main(String[] args) {
		String fileName = "C:/Java_Art_Examples_1-23/Ch21/productFiles/objects.dat";

		ProductFileOutput out = new ProductFileOutput();

		out.createOutputfile(fileName);
		out.createData();
		out.closeOutputFile();
    }
}