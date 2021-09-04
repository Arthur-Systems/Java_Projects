package ch13;
//package ch13;

//demo: use of Stack

import java.util.*;

public class StackTest {
	public static void main(String[] args) {

	Stack<String> stack = new Stack<String>();			//Create a stack of String
	stack.push("abc");									//Push
	stack.push("xyz");
	int pos = stack.search("abc");						//Return 2
	System.out.println("The position of abc: " + pos);

	boolean empty = stack.empty();						//Retuen false
	System.out.println("empty of stack: " + empty);

	String obj = stack.peek();							//Return xyz; but not to pop

	System.out.println("peek of stack: " + obj);

	String top = stack.pop();							//Pop and return xyz

	System.out.println("The top of the stack: " + top);
  }
}
