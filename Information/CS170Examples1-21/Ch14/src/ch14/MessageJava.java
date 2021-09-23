package ch14;

public class MessageJava extends Message implements Runnable {

	public void run() {  			//Implements run()
		display("Java ");
		display("SE ");
	}
}

