package ch14;

class MessageOne extends Thread {		//thread MessageOne
	public void run() {  			//Override run()
	   System.out.print("Java ");
	   System.out.print("SE ");
	}
}
class MessageTwo extends Thread {		//thread MessageTwo
	public void run() {				//Override run()
	   System.out.print("Programming ");
	   System.out.print("Art ");
	}
}

