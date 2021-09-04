//Demo:  use of package jar file

package ch12;

import classes.PackageTest1;
import classes.PackageTest2;

public class PackageTestApp {
  public static void main(String[] args) {

	  PackageTest1 myPackage = new PackageTest1();

	  myPackage.print();

	  PackageTest2 yourPackage = new PackageTest2();

	  yourPackage.print();

  }
}

