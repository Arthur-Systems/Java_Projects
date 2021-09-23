package ch10;
//Array as arguments test

public class ArrayArgsTest {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++)
			System.out.print("args[" + i + "] = " + args[i] + "\t");
		System.out.println();
	}
}
