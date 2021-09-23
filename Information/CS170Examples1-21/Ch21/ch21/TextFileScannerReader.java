package ch21;

//Text file input class using Scanner

import java.io.*;
import java.util.*;

class TextFileScannerReader  {
	File file;
	Scanner in;

	public TextFileScannerReader(String fileName) throws IOException {
		file = new File(fileName);
		in = new Scanner(file);
   	}
   	public final int getInt() {
		return in.nextInt();
	}
	public final long getLong() {
		return in.nextLong();
	}
	public final double getDouble() {
		return in.nextDouble();
	}
	public final String getWord() {
		return in.next();
	}
   	public final String getString() {
		in.nextLine();
		return in.nextLine();
 	}
   	public final void closeFile() throws IOException {
     	in.close();
    }
}