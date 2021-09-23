package ch21;

//Binary file input class

import java.io.*;

class BinayFileInput  {
	DataInputStream in;

	public BinayFileInput(String fileName) throws IOException {
		in = new DataInputStream(
	              new BufferedInputStream(
               		 new FileInputStream(fileName)));
   	}
   	public final boolean hasMore() throws IOException {
		if (in.available() != 0)
		 	return true;
		else
			return false;
	}
   	public final String getUTF() throws IOException {
     	return in.readUTF();
 	}
 	public final double getDouble() throws IOException {
		return in.readDouble();
	}
	public final int getInt() throws IOException {
		return in.readInt();
	}
	public final char getChar() throws IOException {
		return in.readChar();
	}
   	public final void closeFile() throws IOException {
     	in.close();
    }
}