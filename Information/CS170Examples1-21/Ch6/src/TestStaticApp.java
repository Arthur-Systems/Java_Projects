//demo:  Driver code to test TestStatic

public class TestStaticApp {
    public static void main(String[] args) {
		System.out.println("Number of objects before: " + TestStatic.getObjCount() );  //Call static method
        TestStatic obj1 = new TestStatic(); //Create an object
        TestStatic obj2 = new TestStatic(); //Create another object
        System.out.println("Number of object created: " + TestStatic.getObjCount());

        System.out.println("Square of 10 is: " + TestStatic.sqr(10));  //Call static method

    }
}