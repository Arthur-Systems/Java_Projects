package Square;
import javax.swing.JOptionPane;
public class SquareValidationApp {
	public static void main(String[] args) {
		double sideLength = 0;
		boolean isValid = false;
		while (!isValid) {
			try {
				sideLength = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the side of the square: "));
				if (sideLength < 0) {
					throw new NegativeDoubleException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
			} catch (NegativeDoubleException e){//message is not displayed by this file.
			}
		}
		Square square = new Square(sideLength);
		JOptionPane.showMessageDialog(null, "The perimeter is " + square.computePerimeter());
		JOptionPane.showMessageDialog(null, "The area is " + square.computeArea());
		JOptionPane.showMessageDialog(null, "The length of the side is " + square.getSideLength());
	}   //end of main()

}		//end of the class


