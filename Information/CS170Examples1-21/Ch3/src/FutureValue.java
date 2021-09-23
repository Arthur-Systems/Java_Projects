//class FutureValue to compute the future value of the investment

public class FutureValue {
		private String name;			//User name
		private int years;			//investment in years
		private double  monthlyInvest,		//monthly investment amount
			 	yearlyRate,		//annual return rate
			 	futureValue = 0;	//return value

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
		public double getYearlyRate() {
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
		public void futureValueCompute() {  //method to compute
					double monthlyReturnRate = yearlyRate/12/100;
					int months = years * 12;	//convert to months
					int i = 1;					//loop control variable
					while(i <= months) {
						futureValue = (futureValue + monthlyInvest) *
									  (1 + monthlyReturnRate);
						i++;   				//month increased by 1
			 	}					//while end
		}		   				//method futureValueCompute end
	}	//FutureValue class end
