//polymorephism test

public class PolymorphismTest {
   public static void main( String[] args )
   {
      SubClass b = new SubClass();

      SuperClass supper = b;  //

      System.out.println(supper.method());

      supper.otherMethod();
   }
}

