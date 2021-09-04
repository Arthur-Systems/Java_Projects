package ch10;
//subclass Sphere inherites Circle3

 class Sphere3 extends Circle3 {

	private double volume;

	public Sphere3() {
		super();			//call super class non-argument constructor
	}
	public Sphere3(double radius) {
		super(radius);		//call super class one-argument constructor
	}
	public Sphere3(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);//call super class four-argument constructor
	}

	public void computeArea() {		//compute sphere's area
		super.computeArea();		//call super class' method
		area = 4* area;
	}

	public void computeVolume() {	//compute sphere's valume
		super.computeArea();
		volume = 4.0/3 * radius * area;
	}

	public double getArea() {
		return area;
	}

	public double getVolume() {
		return volume;
	}
}