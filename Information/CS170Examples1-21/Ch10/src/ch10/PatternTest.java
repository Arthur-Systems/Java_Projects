package ch10;
//examples of using regular expressions, Pattern and Matcher classes in Java

import java.util.regex.*;

public class PatternTest {  //Demo using Pattern class to validate SSN or any other patterns

public static void main(String[] args)
 {
 	Pattern ssnPattern = Pattern.compile("[0-9]{3}-[0-9]{2}-[0-9]{4}");
 	Matcher ssnMatcher = ssnPattern.matcher("111 -   11  -  1111");
 	if (ssnMatcher.matches())
		System.out.println("SSN Match!");
	else
		System.out.println("SSN not Match!");
	System.out.println("pattern: " + ssnPattern.pattern());
	System.out.println("toString(): " + ssnPattern);

	if (Pattern.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}", "111-11-1111"))
		System.out.println("SSN Match!");
	else
		System.out.println("SSN not Match!");

 	Pattern addressPattern = Pattern.compile("^(\\d)+(\\s)*([a-zA-Z]+(\\s)*[a-zA-Z]+)+,(\\s)*[a-zA-Z]+,\\s+[A-Z]{2}(\\s)*(\\d){5}$");
	Matcher addressMatcher = addressPattern.matcher("1234 First Street, Oakland, CA 92344");
	//System.out.println("ssnPattern:" + ssnPattern.toString());
	//System.out.println("ssnMatcher:" + ssnMatcher.pattern());

	if (addressMatcher.matches())
		 System.out.println("Address Match!");
		else
		 System.out.println("Address not Match!");

	Pattern catPattern = Pattern.compile("cat");
			Matcher matcher = catPattern.matcher("catalogue");

			if (matcher.matches()) {
				 System.out.println("cat Match!");

			 	}
				else
				 System.out.println("cat not Match!");

	Pattern javaPattern = Pattern.compile("(\\S|\\s|^(Java))+|(Java)(\\S|\\s)+|(Java)$");
	matcher = javaPattern.matcher("OOP in Java Programming");

	if (matcher.matches()) {
		 System.out.println("OOP Match!");

	 	}
		else
		 System.out.println("OOP not Match!");


	System.out.println("The index of the last match: :" + matcher);
	System.out.println("matcher:" + matcher.pattern());
  }

 }