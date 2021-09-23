//Demo of testing relational expressions with the exceeded ranges

public class TestRelationalApp {
	public static void main(String[] args) {

		System.out.println("123.456789f == 123.4567892f: " + (123.456789f == 123.4567892f));
		System.out.println("123.456789f >= 123.4567892f: " + (123.456789f >= 123.4567892f));
		System.out.println("123.456789f <= 123.4567892f: " + (123.456789f <= 123.4567892f));
		System.out.println("123.456789f != 123.4567892f: " + (123.456789f != 123.4567892f));
		System.out.println("123.456789f < 123.4567892f: " + (123.456789f < 123.4567892f));
		System.out.println("123.456789f > 123.4567892f: " + (123.456789f > 123.4567892f));

		System.out.println();

		//the following are incorrect
		System.out.println("123.45678f == 123.456784f: " + (123.45678f == 123.456784f));
		System.out.println("123.45678f >= 123.456784f: " + (123.45678f >= 123.456784f));
		System.out.println("123.45678f <= 123.456784f: " + (123.45678f <= 123.456784f));
		System.out.println("123.45678f != 123.456784f: " + (123.45678f != 123.456784f));
		System.out.println("123.45678f < 123.456784f: " + (123.45678f < 123.456784f));
		System.out.println("123.45678f > 123.456784f: " + (123.45678f > 123.456784f));
 		System.out.println("123.4567890123456 == 123.45678901234561: "
							+ (123.4567890123456 == 123.45678901234561));
	}
}