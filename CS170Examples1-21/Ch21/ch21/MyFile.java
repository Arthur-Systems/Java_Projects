package ch21;

//Class used to create GZIP file

import java.io.*;
import java.util.zip.*;
import javax.swing.*;

public class MyFile {
	public static void createGzip() {
		GZIPOutputStream out;
		FileInputStream in;
		String gzipFileName;
		String sourceFileName;
		File gzipFile = null;
		File sourceFile = null;
		JOptionPane.showMessageDialog(null,
							"Select file you want to GZIP... \n"
							+ "It will use .gz as file extension.");
		//Call programmer-defined method to get file from the file chooser
           gzipFileName = getFileName();
		//Call programmer-defined method to verify the file name
		gzipFile = verify(gzipFileName);
		JOptionPane.showMessageDialog(null, "Compressed file name " + gzipFile.
		toString() + " is established.\n"
           + "Press OK and then select the original file that will be compressed");
		sourceFileName = getFileName();	//Get file from the file chooser
		sourceFile = verify(sourceFileName);	//Verify the file name
		try {
			out = new GZIPOutputStream(new FileOutputStream(gzipFileName));
			in = new FileInputStream(sourceFileName);
			byte[] buf = new byte[1024];	//Create the array as buffer
			int len;
			while ((len = in.read(buf)) > 0) {  //Continue until end
				out.write(buf, 0, len);	   //Write out to the file
			}
			in.close();				//Close the original file
			long sourceLength = sourceFile.length();	//Get the length
			out.finish();					//Complete the compression
			out.close();					//Close the compressed file
			long gzipLength = gzipFile.length();	//Get the compressed length

 			//Call programmer-defined method to get the length of the file
                String message = "Completed compression. \nFile length:"
						+ getKB(sourceLength) + " KB\n"
						+ "Compresed file length:"
						+ getKB(gzipLength) + " KB\n";
			JOptionPane.showMessageDialog(null, message);	//Display info
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
	private static String getFileName() {
			String fileName;
			JFileChooser fc = new JFileChooser();
			fc.setDialogTitle("Creating or selecting a File");
			fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
			fc.setApproveButtonToolTipText("Select or enter a file name");
			fc.setApproveButtonText("OK");
			int option = fc.showOpenDialog(null);
			if (option == JFileChooser.APPROVE_OPTION) {
				 File file = fc.getSelectedFile();
				 fileName = file.toString();
				 return fileName;
			 }
			else
				 return null;
		}
		private static File verify(String fileName) {
			try {
				File gzipFile = new File(fileName);
				return gzipFile;
			}
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Error in creating the file...");
				System.exit(2);
				return null;
			}
		}

	private static int getKB(long length) {
			return (int) (length/1024);
	}
	public static void unZip() {
			GZIPInputStream gzipIn;
			OutputStream out;
			String gzipFileName;
			String outFileName;
			File gzipFile = null;
			File outFile = null;

			JOptionPane.showMessageDialog(null, "Select a compressed file that to be decompressed");
			gzipFileName = getFileName();
			gzipFile = verify(gzipFileName);
			JOptionPane.showMessageDialog(null, "Compressed file name: " + gzipFile.toString() + "\n"
											+ "Press OK and then create a file name that holds the decompressed file.\n"
											+ "Use the correct file extension.");
			outFileName = getFileName();
			outFile = verify(outFileName);
			try {
				gzipIn = new GZIPInputStream(new FileInputStream(gzipFileName));
				out = new FileOutputStream(outFileName);
				// Transfer bytes from the compressed file to the output file
				byte[] buf = new byte[1024];
				int len;
				while ((len = gzipIn.read(buf)) > 0) {
				out.write(buf, 0, len);
				}
				// Close the file and stream
				gzipIn.close();
				out.close();
				JOptionPane.showMessageDialog(null, "Decompression is successful.");
			}
			catch (IOException ioe) {
				System.out.println(ioe);
			}
	}
}