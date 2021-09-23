//The driver code for Payment class

import javax.swing.JOptionPane;

public class PaymentApp {
		public static void main(String[] args) {
			Payment payment = new Payment(); 	//create an object of Payment
			String str;		//define a local variable
			str = JOptionPane.showInputDialog("Enter a price: ");	 //input a price

			payment.setPrice(Double.parseDouble(str));	//convert to double then call setter

			str = JOptionPane.showInputDialog("Enter a quantity: "); //input quantity

			payment.setQuantity(Integer.parseInt(str));  //convert to int then call  setter
			payment.bill();	//call method to compute
			//display the result
			JOptionPane.showMessageDialog(null, "Total amount:  " + payment.getTotal());
		} 	//end of main()
} 		//end of PaymentApp


