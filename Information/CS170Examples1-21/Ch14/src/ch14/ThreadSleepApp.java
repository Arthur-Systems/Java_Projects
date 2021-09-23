package ch14;
//package ch14;

//demo: basic threads application using sleep()

public class ThreadSleepApp {
	public static void main(String[] args) {
        Thread messageLanguage = new MessageLanguage();
        Thread messageProgramming = new MessageProgramming2();
        messageProgramming.start();
        messageLanguage.start();
	}
}
 