package ch12;

import classes.*;

public class PackageTestApp2 {
  		public static void main(String[] args) {
	    PackageTest1 myPackage = new PackageTest1();
	    myPackage.print();
	    PackageTest2 yourPackage = new PackageTest2();
	    yourPackage.print();
  		}
}
