package ch21;

//Random file I/O class

import java.io.*;

class RandomFile {
	private RandomAccessFile randomFile;
	private long fileLength;
	private long recordPos;

	public RandomFile(String fileName) throws FileNotFoundException {
		randomFile = new RandomAccessFile(fileName, "rw");
		recordPos = 0;
   	}
   	public final void setWriteRecordPos(int n, int recordSize)throws IOException {

		fileLength = randomFile.length();
		recordPos = recordSize*(n - 1);
		if(recordPos < 0 || recordPos > fileLength) {
			recordPos = fileLength;
			System.out.println("Exceeds the exsiting record and will be saved to the end... " );
		}
		randomFile.seek(recordPos);
	}
	public final void setReadRecordPos(int n, int recordSize) throws IOException {
		fileLength = randomFile.length();
		recordPos = recordSize*(n - 1);
		if(recordPos < 0 || recordPos >= fileLength) {
			recordPos = fileLength - recordSize;
			System.out.println("The record number exceeds the file length and the last record is read in... " );
		}
		randomFile.seek(recordPos);
	}
	public long getRecordPos() {
		return recordPos;
	}
	public long getLength() throws IOException {
		return randomFile.length();
	}

   	public final void outString(String text) throws IOException {
     	randomFile.writeChars(text);
 	}
	public final String inString(int length) throws IOException {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < length; i++) {
			char ch = randomFile.readChar();
			if (ch != 0)
				sb.append(ch);
		}
	    return sb.toString();
 	}
 	public final void outDouble(double value) throws IOException {
	     	randomFile.writeDouble(value);
 	}
 	public final double inDouble() throws IOException {
	     	return randomFile.readDouble();
 	}

   	public final void closeFile() throws IOException {
     	randomFile.close();
    }
    public static String FixedStringLength(String str, int length) {
			int extra;
			String validStr = "";
			if (str.length() < length) {
				extra = length - str.length();
				for(int i = 0; i < extra; i++)
					str += " ";
				return str;
			}
			else if (str.length() > length) {
				for(int i = 0; i < length; i++)
					validStr += str.charAt(i);
				return validStr;
			}
			else
				return str;
	}
}