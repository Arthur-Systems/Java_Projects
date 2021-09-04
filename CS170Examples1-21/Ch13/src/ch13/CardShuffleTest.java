package ch13;
//package ch13;

import java.util.*;
public class CardShuffleTest {
		public static void main(String[] args) {

			String[] cardArray = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
			List<String> cardList = Arrays.asList(cardArray);		//Copy array to a list

			Collections.shuffle(cardList);							//Call shuflling

			System.out.println("cardlist = " + cardList);			//Display
			Collections.shuffle(cardList, new Random(10));			//Call with random
			System.out.println("cardlist = " + cardList);			//Display
  		}
}
