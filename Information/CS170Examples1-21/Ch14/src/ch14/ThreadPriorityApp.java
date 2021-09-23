package ch14;
//package ch14;

//demo: basic threads application using priority()

public class ThreadPriorityApp {
	public static void main(String[] args) {

        Thread messageOne = new MessageOne();
        Thread messageTwo = new MessageTwo();
        messageOne.setPriority(10);
		messageTwo.setPriority(1);
        messageOne.start();
        messageTwo.start();
	}
}
