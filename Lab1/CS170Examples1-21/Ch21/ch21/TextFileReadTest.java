package ch21;

//Demo: Text file input using read() and skip()

import java.io.*;

public class TextFileReadTest {
	public static void main(String[] args) {
		String fileName = "myData.txt";
		String myFilePath = "C:/Java_Art_Examples_1-23/Ch21/myFiles/";
		try {
			File myFile = new File(myFilePath + fileName);

			BufferedReader in = new BufferedReader(
									new FileReader(myFile));

			String line = "";
			int ch =  in.read();
			while (ch != (int) -1) {
				line += (char)ch;
				if (ch == '\n') {
					System.out.print(line);
					line = "";
				}
				else if (ch == '\t')
					in.skip(7);
				ch = in.read();
			}
			in.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}


