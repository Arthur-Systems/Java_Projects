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
					// pass data into the array
					app.RainData[i] = rainfall;

				}

			}

		}
		System.out.println("Ok Quitting!");

}
}
