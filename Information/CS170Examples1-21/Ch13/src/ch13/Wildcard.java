package ch13;
//package ch13;

import java.util.*;

public class Wildcard <T>{
	static void printList(Collection<?> c) {
				for(Object obj : c)
					System.out.println(obj);
		}

	public static <T> List<? extends T>  printList(List<? extends T> c) {
				for(T obj1 : c) {
				 	System.out.println(obj1);
				}
				return c;
	}
	public static <T> void copy(List<? super T> dest, List<? extends T> src) {
		  for (int i = 0; i < src.size(); i++) {
			  dest.set(i, src.get(i));
		  }
	  }

}