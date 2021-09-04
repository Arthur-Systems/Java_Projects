//Demo:  shallow copy in clone() method



class SomeClass implements Cloneable{
	OtherClass other;		//member object:  will be “shallow copy”
		Integer myInt;		//Wrapper class object data: will be “deep copy”
		int n;				//primitive data:  will be “deep copy”

	SomeClass(String title, int n) {
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

	public String toString() {
		return "other: " + other + ", n: " + n + ", myInt: " + myInt;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneableTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		SomeClass sourceObj = new SomeClass("Java", 10);
		SomeClass targetObj = (SomeClass) sourceObj.clone();
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

