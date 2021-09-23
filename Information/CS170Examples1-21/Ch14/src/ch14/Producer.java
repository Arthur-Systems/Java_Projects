package ch14;
//package ch14;

//Demo: Simple Producer-Consumer Threads

class Producer extends Thread {
	public void run() {  			//Override
		  System.out.print(this.getName());
		  System.out.println( " is producing...");
		  Shop.producing();
	}
}

class Consumer extends Thread {
	public void run() {				//Override
		  System.out.println(this.getName() + " is consuming...");
		  Shop.consuming();
	}
}
