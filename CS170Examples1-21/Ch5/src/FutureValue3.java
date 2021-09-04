//Business class: FutureValue3

public class FutureValue3 {
		private String name;			//Declare instance variables
		private int years;
		private double  monthlyInvest,
			 	yearlyRate,
			 	futureValue;

		//following are setXx() and getXxx() for class variables
		public void setName(String userName) {
					name = userName;
				}
		public String getName() {
					return name;
				}

		public void setMonthlyInvest(double monthlyInvestment) {
					monthlyInvest = monthlyInvestment;
				}
		public double getMonthlyInvest() {
					return monthlyInvest;
				}
		public void setYearlyRate(double yearlyReturnRate) {
					yearlyRate = yearlyReturnRate;
				}
		public double getYealyRate() {
					return yearlyRate;
				}
		public void setYears(int investYears){
					years = investYears;
				}
		public int getYears() {
					return years;
				}
		public double getFutureValue() {
					return futureValue;
				}
		public void futureValueCompute() {  //Method to compute the future value
					double monthlyReturnRate = yearlyRate/12/100;
					int months = years * 12;
					int i = 1;
					do  {
						futureValue = (futureValue + monthlyInvest) *
									  (1 + monthlyReturnRate);
						i++;
			 		}	while (i <= months);		//End of do-while
		}		   				//End of the method
	}	//End of FutureValue3
