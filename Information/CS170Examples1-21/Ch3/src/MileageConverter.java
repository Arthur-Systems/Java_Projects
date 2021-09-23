//Define MileageConverter class

public class MileageConverter {

	double	kilometers,				//declare the class variables
			miles,
			result;

	public void setKilometers(double km) //setKilometers() method
	 	{ kilometers = km; }

	public double getKilometers()		//getKilometers() method
		{ return kilometers; }

	public void setMiles(double mile)  	//setMiles() method
	 	{ miles = mile; }

	public double getMiles()			//getMiles() method
		{ return miles; }

	public double getResult()			//getResult() method
		{ return result; }

	public void convertKilometers()		//convert kilometers to miles
		{ result = kilometers * 0.62137; }


	public void convertMiles()			//convert miles to kilometers
		{ result = miles * 1.609347; }

 } // end of MileageConverter class