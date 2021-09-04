package ch21;

import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		String fileName = "myData.txt";
		String myFilePath = "C:/Java_Art_Examples_1-23/Ch21/myFiles/";
		String yourfilePath = "C:/Java_Art_Examples_1-23/Ch21/yourfiles/";
		try {
			File myFile = new File(myFilePath + fileName);
			File yourFile = new File(yourfilePath);

			System.out.println("my file exists: " + myFile.exists());

			if (!myFile.exists())
				myFile.createNewFile();
			
			if (!yourFile.exists())
				yourFile.mkdirs();
			System.out.println("yourFile path: " + yourFile.getPath());
			
			System.out.println("File name: " + myFile.getName());
			System.out.println("Can read myFile: " + myFile.canRead());
			System.out.println("Can write myFile: " + myFile.canWrite());

			System.out.println("File name: " + yourFile.getName());
			System.out.println("Can read yourFile: " + yourFile.canRead());
			System.out.println("Can write yourFile: " + yourFile.canWrite());

			System.out.println("Absolute path: " + myFile.getAbsolutePath());
			System.out.println("Canonical path: " + myFile.getCanonicalPath());

			String absolutePath = new File(".\\..").getAbsolutePath();
			System.out.println("Absolute path: " + absolutePath);

			String canonicalPath =  new File(".\\..").getCanonicalPath();
			System.out.println("Canonical path: " + canonicalPath);



			System.out.println("Parent path: " + myFile.getParent());
			System.out.println("File path: " + myFile.getPath());

			System.out.println("Path and myFile exist: " + myFile.isFile());
			System.out.println("Length of myFile: " + myFile.length());

		//	PrintWriter out = new PrintWriter (new FileWriter(myFile));
		//	out.println("This is data in my file.");
		//	out.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}