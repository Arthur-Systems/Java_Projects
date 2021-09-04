package ch14;
//package ch14;

//demo: basic threads application

public class ThreadBasicApp {
	public static void main(String[] args) {
      // for(int i = 0; i < 5; i++) {
		 new MessageOne().start();  //create unnamed thread and call start()
	     new MessageTwo().start();
	     System.out.println();
	   //	   }
	}
}