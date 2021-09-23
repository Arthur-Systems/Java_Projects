package ch10;
//Calculator class for simple expression computing
import javax.swing.JOptionPane;

public class Calculator {
		private String expression;
		private char operator;
		private double operandValue,
			        currentTotal;
        public Calculator() {			//Constructor
			expression = null;
			operator = ' ';
			operandValue = 0.0;
        	currentTotal = 0.0;
        }
        public void requestInput() {  	//handle the user’s entry
        	expression = JOptionPane.showInputDialog("Please enter your expression: ");
		}
		public void parseExpression() {	//Translate to operators and operands
			//char[] operators = new char[1];
			String[] expressions = expression.split(" ");	//form operator and operand tokens using “split”
		     		currentTotal = Double.parseDouble(expressions[0]); 		//obtain first operand
		     		for(int i = 1; i < expressions.length; i += 2) {		//obtain remaining operators and operands
		       			operator = expressions[i].charAt(0);				//Get operator
		       			operandValue = Double.parseDouble(expressions[i+1]); //Get the value of operand
						compute();			//Call compute()
					}
		}
		public void compute() {		//Method compute()
			switch (operator) {
				case '+':  currentTotal += operandValue;
					   	   break;
				case '-':  currentTotal -= operandValue;
				   	       break;
				case '*':  currentTotal *= operandValue;
					       break;
				case '/':  currentTotal /= operandValue;
				           break;
				default:   System.out.println("wrong operator...");	//Display the error message
						   break;
				}
		}
		public String toString() {		//Override toString()
		 	return expression + "\nThe total after the calculation: " + currentTotal;
		}
}
