package ch12;

//Demo:  Performance test with or without autoboxing in arrays

public class AutoboxingPerformanceTest{
	public static void main(String args[]){
	long time1 = 0;
	long time2 = 0;

	Integer[] integerValues = new Integer[2147483];		//create an Integer array

	time1 = System.currentTimeMillis();					//Staring timer

	// Inserting values intothe array with autoboxing
	for(int i =0;i<2147483;i++){
		integerValues[i]=i;
	}

	// do the multiplication and put it back
	for(int i=0;i<2147483;i++){
		integerValues[i] *= 1;
	}

	time2 = System.currentTimeMillis();		//ending timer
	System.out.println("AutoBoxing with Integer array: "+(time2-time1)+"ms");


	int[] intValues = new int[2147483];

	time1 = System.currentTimeMillis();		//Starting timer
	for(int i=0;i<2147483;i++)				//without autoboxing
		intValues[i] = i;

	// do the multiplication and put it back
	for(int i=0;i<2147483;i++){
		intValues[i] *= 1;
	}

	time2 = System.currentTimeMillis();		//ending timer without autoboxing
	System.out.println("Without autoboxing with an int array: "+(time2-time1)+"ms");


	time1 = System.currentTimeMillis();

	for(int i = 0;i < 2147483; i++)
		intValues[i] = intValues[i]*1;

	time2 = System.currentTimeMillis();
	System.out.println("Directly using an int array : "+(time2-time1)+"ms");

	}
}