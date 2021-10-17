/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Two
Submission Date: 10/14/2021
Brief Description:  This program takes in data passed by the user in the driver class and calculates the 
average, total , highest, and lowest amount based on the provided data.

*/
package rainfall;

public class RainFall {// start of operation rainfall class

    public int[] RainData = new int[12]; // make a 12 value array
    public boolean stop;


    public int sumRainFall() { // Code methods to compute the sum,
        int sum = 0;
        for (int i = 0; i < RainData.length; i++) { // loop through the array and add the values
            sum += RainData[i];
        }
        return sum;
    }

    public int averageRainFall() { // average,
        int average = sumRainFall() / RainData.length; // divide the returned value of the sum by the length of the
                                                       // array
        return average;
    }

    public int greatestRainFall() { // the greatest
        int greatest = RainData[0];
        for (int i = 0; i < RainData.length; i++) { // loop through the array and find the greatest value
            if (RainData[i] > greatest) {
                greatest = RainData[i];
            }
        }
        return greatest;
    }

    public int leastRainFall() { // and least rainfall, respectively.
        int least = RainData[0];
        for (int i = 0; i < RainData.length; i++) { // loop through the array and find the least value
            if (RainData[i] < least) {
                least = RainData[i];
            }
        }
        return least;

    }

    public void displayRainFall() { // display the rainfall data
        System.out.println("The total rainfall for the year is " + sumRainFall() + " inches");
        System.out.println("The average rainfall was  " + averageRainFall() + " inches");
        System.out.println("The Most Rainfall was  " + greatestRainFall() + " inches");
        System.out.println("The Least Rainfall was  " + leastRainFall() + " inches");

    }
} // end of operation rainfall class
