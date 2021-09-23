//Demo: Deep copy in overriden clone() method

class SomeClass2 implements Cloneable{
	private OtherClass other;
	Integer myInt;
	int n;
	SomeClass2(SomeClass2 someClass) {
		other = new OtherClass(someClass.other.toString());
		myInt = someClass.getInteger();
		n = someClass.getN();
	}
	SomeClass2(String title, int n) {
		other = new OtherClass(title);
		myInt = new Integer(100);
		this.n = n;
	}
	void setTitle(String title) {
		other.setName(title);
	}
	void setN(int n) {
		this.n = n;
	}
	void setInteger(int n) {
		myInt = n;
	}
	int getN() {
		return n;
	}
	Integer getInteger() {
		return myInt;
	}

	public String toString() {
		return "other: " + other + ", n: " + n + ", myInt: " + myInt;
	}
	protected Object clone() throws CloneNotSupportedException {
		SomeClass2 someClass = new SomeClass2(this);
		//SomeClass2 someClass = (SomeClass2)super.clone();
		return someClass;
		//return super.clone();
	}
}

public class DeepCloneableTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		SomeClass2 sourceObj = new SomeClass2("Java", 10);
		SomeClass2 targetObj = (SomeClass2) sourceObj.clone();
		System.out.println("content of sourceObj: " + sourceObj);
		System.out.println("content of targetObj: " + targetObj);

		targetObj.setTitle("JSP");
		sourceObj.setN(20);
		sourceObj.setInteger(0);
		System.out.println("After modify: ");
		System.out.println("content of sourceObj: " + sourceObj);
		System.out.println("content of targetObj: " + targetObj);
	}
}
