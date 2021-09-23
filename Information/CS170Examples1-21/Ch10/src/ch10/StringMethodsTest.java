package ch10;

//Test methods in String class

public class StringMethodsTest {
   public static void main( String args[] ) {
	   String title = "Java Programming in Practice";
	   int titleLength = title.length();
	   System.out.println("titleLength = " + titleLength);

	   int index = title.indexOf('a');
	   System.out.println("index of a = " + index);

		int index1 = title.indexOf("in");
		System.out.println("index1 of in = " + index1);

		int index2 = title.indexOf("in", 14);
		System.out.println("index2 of in = " + index2);

		int index3 = title.lastIndexOf('a');
		System.out.println("last index3 of a = " + index3);

		int index4 = title.lastIndexOf('a', 5);
		System.out.println("last index4 of a = " + index4);

		int index5 = title.lastIndexOf("Pr", 19);
		System.out.println("last index5 of Pr = " + index5);

		String str = "Java Programming";

		char ch = str.charAt(0);
		System.out.println("ch = " + ch);

		String[] result = str.split("a");
		System.out.println(result[0] + "  " + result[1] + " " + result[2] + " " + result[3] );

		String greeting = new String ("Welcome to Java Programming Community!");
		String substring = greeting.substring(0);
		System.out.println("substring = " + substring);

		String substring1 = greeting.substring(11, 15);
		System.out.println("substring1 = " + substring1);

		String replaceString = greeting.replace("Java", "JSP");
		System.out.println("replaceString = " + replaceString);

		String[] splits = greeting.split(" ");
		for(String split : splits)
		  System.out.println(split);

		String greeting2 = new String("Java");
		//char ch = greeting.charAt(5);		//ch = 'm'
		char[] charArray = greeting2.toCharArray();
		for(char ch1 : charArray)
		  System.out.print(ch1 + " ");
		System.out.println();

		String fullName = "Wang Chang Ling";
		String name = "Wang chang ling";
		boolean[] results = new boolean[6];
		 results[0] = fullName.equals(name);				//result[0] = false
		 results[1] = fullName.equalsIgnoreCase(name); 		//result[1]= true
		 results[2] = fullName.startsWith("W");				//result[2] = true
		 results[3] = fullName.startsWith("W", 1);			//result[3] = false
		 results[4] = fullName.endsWith("G");				//result[4] = false
		 results[5] = fullName.isEmpty();					//result[5] = false

		 for(boolean answer : results)
		  System.out.print(answer + " ");
		 System.out.println();

		int flag0 = fullName.compareTo(name);				//flag0 = -32
		int flag1 = fullName.compareToIgnoreCase(name);  	//flag1 = 0
		System.out.println("flag0 = " + flag0 + "\t" + "flag1 = " + flag1);
	}
}