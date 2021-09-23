package ch13;
//package ch13;

import java.util.*;

class GenericQueue<E> {
	private LinkedList<E> que = new LinkedList<E>();	//Create a collection
		public void inQue(E item) {
			que.addLast(item);					//Enqueue
		}
		public E deQue() {						//Dequeue
			return que.removeFirst();
		}
		public int size() {						//Call method
			return que.size();
		}
		public boolean empty() {				//Call isEmpty()
			return que.isEmpty();
		}
		public String toString() {				//Call toString()
			return que.toString();

	}
}
