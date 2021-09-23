//Driver to test interface as return type and argument

public class InterfaceAsReturnTypeTest {
	public static void main(String args[]) {

	  SomeOne3 goose = new SomeOne3();
	  System.out.println("Goose info: ");
	  System.out.println(goose.canDo(25, 129, 16));

	  CanDo brownAfricanGoose = goose.canDo(10, 200, 9);
	  System.out.println("Brown African Goose info: ");
	  SomeOne3.canDoList(brownAfricanGoose);


	  System.out.println(brownAfricanGoose);
	}
}