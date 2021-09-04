package ch21;

//Text file input class

import java.io.*;

class TextFileReader  {
	BufferedReader in;

	public TextFileReader(String fileName) throws IOException {
		in = new BufferedReader(
               	 new FileReader(fileName));
   	}
   	public final String getData() throws IOException {
   		String line = in.readLine();
   		System.out.println("inside geteData(): " + line);
		return line; //in.readLine();
 	}
   	public final void closeFile() throws IOException {
     	in.close();
    }
}