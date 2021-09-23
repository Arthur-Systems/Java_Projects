package ch21;

//Demo: Text file input

import java.io.*;

public class TextFileReadLineTest {
	public static void main(String[] args) {
		String fileName = "myData.txt";
		String myFilePath = "C:/Java_Art_Examples_1-23/Ch21/myFiles/";
		try {
			File myFile = new File(myFilePath + fileName);

			BufferedReader in = new BufferedReader(
									new FileReader(myFile));

			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
