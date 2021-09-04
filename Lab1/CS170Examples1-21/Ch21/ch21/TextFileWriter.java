package ch21;

//Text file output class

import java.io.*;

class TextFileWriter  {
	PrintWriter out;

	public TextFileWriter(String fileName, boolean append) throws IOException {
		out = new PrintWriter(
	              new BufferedWriter(
               		 new FileWriter(fileName, append)));
   	}
   	public final void output(String...text) {
		for(String s: text)
     		out.print(s+ "|");
     	out.println();
 	}
   	public final void closeFile() {
     	out.close();
    }
}