package ch10;
//Calculator2 class for simple expression computing

import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class Calculator2 {

		private String expression;
		private char operator;

		double operandValue,
			   currentTotal;

        public Calculator2() {
			expression = null;
			operator = ' ';
			operandValue = 0.0;
        	currentTotal = 0.0;
        }

        public void requestInput() {
        	expression = JOptionPane.showInputDialog("Please enter your expression: ");
		}

		public void parseExpression() {
		//	String operatorStr;
			StringTokenizer tokens = new StringTokenizer(expression);
		     		currentTotal = Double.parseDouble(tokens.nextToken());
		     		while (tokens.hasMoreTokens()) {
		       		//	operatorStr = tokens.nextToken();
		       			operator = expression.charAt(0);
		       			operandValue = Double.parseDouble(tokens.nextToken());
		       			compute();
					}
		}
		public void compute() {
			switch (operator) {
				case '+':  currentTotal += operandValue;
					   	   break;
				case '-':  currentTotal -= operandValue;
				   	       break;
				case '*':  currentTotal *= operandValue;
					       break;
				case '/':  currentTotal /= operandValue;
				           break;
				default:   System.out.println("wrong operator...");
						   break;
				}
		}
		public String toString() {
		 	return expression + "\nThe total after the calculation: " + currentTotal;
		}
}
