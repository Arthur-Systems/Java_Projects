package ch21;

//Driver for ProductRandomFile

public class ProductRandomFileApp {
    public static void main(String[] args) {
    	String fileName = "C:/Java_Art_Examples_1-23/Ch21/products.dat";			//File path and name
  		ProductRandomFile productFile = new ProductRandomFile(fileName);	   //Create object
  		productFile.createData();											//Call the methods
  		productFile.showData();												 
  		productFile.closeFile();											 
    }
}