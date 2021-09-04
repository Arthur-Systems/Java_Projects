//Demo: use of abstract class

 public abstract class Employee2 extends Person {
	protected String employeeID;
	protected String jobTitle;
	protected byte seniority;
	protected double salary;

	public Employee2(String lastName, String firstName, char sex, byte age,
					String address, String employeeID, String jobTitle, byte seniority) {
		super(lastName, firstName, sex, age, address);
		this.jobTitle = jobTitle;
		this.seniority = seniority;
	}
	public abstract void computeSalary();		//�������󷽷�
	public String toString() {					//����Person�� toString()����
		String message = super.toString() + "EmployeeID: " + employeeID + "\n"
						+ "jobTitle: " + jobTitle + "\n"
						+ "Seniority: " + seniority + "\n";
		return message;
	}
}