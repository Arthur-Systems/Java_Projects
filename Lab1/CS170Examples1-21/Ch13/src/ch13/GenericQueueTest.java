package ch13;
//package ch13;

//demo: use of self-defined GenericQueue

public class GenericQueueTest {
	public static void main(String[] args) {

	GenericQueue<String> myQue = new GenericQueue<String>();
	myQue.inQue("One");
	myQue.inQue("Two");
	myQue.inQue("Three");

	int myQueSize = myQue.size();
	System.out.println(myQueSize);
	System.out.println(myQue);

	while(myQue.size() > 0)
		System.out.println(myQue.deQue());
  }

}