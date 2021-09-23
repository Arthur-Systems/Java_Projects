package ch21;

//Binary file output class

import java.io.*;

class BinayFileOutput  {
	DataOutputStream out;

	public BinayFileOutput(String fileName, boolean append) throws IOException {
		out = new DataOutputStream(
	              new BufferedOutputStream(
               		 new FileOutputStream(fileName, append)));
   	}
   	public final void outUTF(String text) throws IOException {
     	out.writeUTF(text);
 	}
 	public final void outString(String text) throws IOException {
		out.writeChars(text);
	}
 	public final void outDouble(double value) throws IOException {
		out.writeDouble(value);
	}
	public final void outInt(int value) throws IOException {
		out.writeInt(value);
	}
	public final void outChar(char ch) throws IOException {
		out.writeChar(ch);
	}
   	public final void closeFile() throws IOException {
     	out.close();
    }
}