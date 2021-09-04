//Business class Payment

public class Payment{		//define Payment class
	 	private double price,	//define an instance variable and a const
				 total;
		private int quantity;
	 	private final double INTEREST_RATE = 0.0875;	//define a const

	public void setPrice(double cost)  		// setter for price
	 		{ price = cost; }
	public double getPrice()				//getter for price
			{ return price; }

	public void setTotal(double amount)		//setter for total
			{ total = amount; }
	public double getTotal()				//getter for total
			{ return total; }

	public void setQuantity(int item)		//setter for quantity
			{ quantity = item; }
 	public int getQuantity()				//getter for quantity
			{ return quantity; }

	public void bill()					//define the method
	 		{ total = quantity * price + quantity * price * INTEREST_RATE; }
 	} // end of Payment
