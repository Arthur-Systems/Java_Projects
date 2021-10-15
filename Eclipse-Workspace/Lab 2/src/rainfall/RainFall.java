package rainfall;

public class RainFall {// driver class
    // make a 12 month array
    public int[] RainData = new int[12];
    public boolean stop;

    // set put values into array
    public void setRainData(int[] RainData) {
        this.RainData = RainData;
    }

    public int sumRainFall() { // Code methods to compute the sum,
        int sum = 0;
        for (int i = 0; i < RainData.length; i++) {
            sum += RainData[i];
        }
        return sum;
    }

    public int averageRainFall() { // average,
        int average = sumRainFall() / RainData.length;
        return average;
    }

    public int greatestRainFall() { // the greatest
        int greatest = RainData[0];
        for (int i = 0; i < RainData.length; i++) {
            if (RainData[i] > greatest) {
                greatest = RainData[i];
            }
        }
        return greatest;
    }

    public int leastRainFall() { // and least rainfall, respectively.
        int least = RainData[0];
        for (int i = 0; i < RainData.length; i++) {
            if (RainData[i] < least) {
                least = RainData[i];
            }
        }
        return least;
    }

    public void displayRainFall() { // display the array.
        System.out.println("The rainfall for the month is: ");
        for (int i = 0; i < RainData.length; i++) {
            System.out.println(RainData[i]);
        }

    }
}
