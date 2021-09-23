package ch14;
//package ch14;

//demo: basic threads application implementing Runnable

public class RunnableBasicApp {
	public static void main(String[] args) {

        Thread messageJava = new Thread(new MessageJava());
        Thread messageProgramming = new Thread(new MessageProgramming());

        messageJava.start();
        messageProgramming.start();
	}
}
