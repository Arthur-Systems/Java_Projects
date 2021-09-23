//Demo: BigDecmial currency and percent formats

import java.text.NumberFormat;
import java.math.BigDecimal;

public class BigDecimalFormatApp {
    public static void main(String[] args) {

		String loanAmountString = "129876534219876523.123456789";
		String interestRateString = "0.087654321987654321987654321";

        BigDecimal bigLoanAmount = new BigDecimal(loanAmountString);	//Create objects of BigDecimal
		BigDecimal bigInterestRate = new BigDecimal(interestRateString);
		BigDecimal bigInterest = bigLoanAmount.multiply(bigInterestRate);	//BigDecimal multiplication

		NumberFormat currency = NumberFormat.getCurrencyInstance();		//Currency format
		NumberFormat percent = NumberFormat.getPercentInstance();		//Percent format
		percent.setMaximumFractionDigits(3);							//Max 3 decimal points

		//Formatted output
		System.out.println("Loan amount:\t" + currency.format(bigLoanAmount));
		System.out.println("Interest rate:\t" + percent.format(bigInterestRate));
		System.out.println("Interest:\t" + currency.format(bigInterest));
    }
}