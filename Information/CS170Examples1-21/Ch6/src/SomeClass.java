public class SomeClass  //demo of object creation referencing
{
	private int x;
	public SomeClass() {
		x = 0;
	}

	public SomeClass(int x) {	//constructor overloading
			this.x = x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}

	public static SomeClass getSomeClassInstance() {	//create an object and return it as a reference
		SomeClass object = new SomeClass();
		return object;
	}
}