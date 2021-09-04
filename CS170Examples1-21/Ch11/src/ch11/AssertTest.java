package ch11;
//Demo:  assert statement

public class AssertTest{
   public static void main(String[] args) {


	double total = 219.98;

	assert (total > 0.0 && total < 200.0) : "total: " + total + " ¨C is out of the range.";

	int age = 17;
	assert age > 18 : "Age must be greater than 18.";

   }
}
