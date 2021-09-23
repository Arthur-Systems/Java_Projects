package ch14;
//package ch14;

//Demo for class that inherits Thread

class MessageLanguage extends Thread {

	public void run() {  			//Override run()
	 System.out.print("Java ");
	 System.out.print("SE ");
	}
}

class MessageProgramming2 extends Thread {
	public void run() {				//Override run()
		try {
		Thread.sleep(500);
		System.out.print("Programming ");
	 	System.out.println("Art ");
		}
		catch (InterruptedException e){
			System.out.println(e);
		}
	}
}