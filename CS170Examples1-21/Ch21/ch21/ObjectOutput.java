package ch21;

//Binary file for serialized object output class

import java.io.*;

class ObjectOutput  {
	ObjectOutputStream out;
	public ObjectOutput(String fileName){
		try {
			out = new ObjectOutputStream(
             	  	new FileOutputStream(fileName));
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
   	}
 	public final void outObject(Object obj) {
		try {
			out.writeObject(obj);
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
   	public final void closeFile() {
		try {
     		out.close();
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
    }
}