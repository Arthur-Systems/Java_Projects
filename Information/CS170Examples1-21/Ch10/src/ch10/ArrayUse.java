package ch10;

//ArrayUse as utility class to append arrays

public class ArrayUse {
   public static double[] append(double[] array1, double[] array2) {
   	double[] join = new double[array1.length + array2.length];
   	for(int i = 0; i < array1.length; i++)
   		join[i] = array1[i];
   	for (int i = 0; i < array2.length; i++)
   		join[array1.length+i] = array2[i];
   	return join;
   }
}