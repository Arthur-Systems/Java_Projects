package rainfall;

import java.util.*;

public class RainFallApp {

	public static void main(String[] args) {// driver class

		RainFall app = new RainFall();
		app.stop = false;
		while (!app.stop) {

			System.out.println("Enter rainfall for month. (to exit, please enter -99 :3) ");
			for (int i = 0; i < app.RainData.length; i++) {
				Scanner input = new Scanner(System.in);
				int rainfall = input.nextInt();
				if (rainfall == -99) {
					app.stop = true;
					break;
				} else {

					app.RainData[i] = rainfall; // data is passed into the array

				}

			}

			System.out.println("The total rainfall for the year is " + app.sumRainFall());
			System.out.println("The average rainfall was  " + app.averageRainFall());
			System.out.println("The Most Rainfall was  " + app.greatestRainFall());
			System.out.println("The Least Rainfall was  " + app.leastRainFall());

		}
		System.out.println("Ok Quitting!");

}
}
