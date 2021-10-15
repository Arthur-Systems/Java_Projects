package rainfall;

import java.util.*;

public class RainFallApp {
	public static void main(String[] args) {// driver class

		RainFall app = new RainFall();
		app.stop = false;

		// while (!app.stop) {
		// // ask to user to input rainfall for each month
		// System.out.println("Enter rainfall for month. (to exit, please enter -99 :3)
		// ");
		// Scanner input = new Scanner(System.in);
		// int rainfall = input.nextInt();
		// if (rainfall == -99) {
		// app.stop = true;
		// } else {
		// // pass data into the array
		// app.setRainData(rainfall);

		// }
		// }

		// keep asking the user to input rainfall for each month and then display the
		// array
		while (!app.stop) {
			System.out.println("Enter rainfall for month. (to exit, please enter -99 :3) ");
			Scanner input = new Scanner(System.in);
			int rainfall = input.nextInt();
			if (rainfall == -99) {
				app.stop = true;
			} else {
				// pass data into the array
				app.setRainData(rainfall);
				app.displayRainData();
			}
		}
		System.out.println("Ok Quitting!");
		return 0;

}
}
