//Demo: Deep copy in overriden clone() method


public class DeepCloneableTest2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		SomeClass2 sourceObj = new SomeClass2("Java", 10);
		SomeClass2 targetObj = (SomeClass2) sourceObj.clone();
		System.out.println("content of sourceObj: " + sourceObj);
		System.out.println("content of targetObj: " + targetObj);

		targetObj.setTitle("JSP");
		targetObj.setN(98);
		targetObj.setInteger(99);
		sourceObj.setN(20);
		sourceObj.setInteger(0);
		System.out.println("After modify: ");
		System.out.println("content of sourceObj: " + sourceObj);
		System.out.println("content of targetObj: " + targetObj);
	}
}
