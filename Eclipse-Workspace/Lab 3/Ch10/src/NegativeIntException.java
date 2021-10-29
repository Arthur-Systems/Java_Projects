//Demo: programmer-defined exception class

public class NegativeIntException extends Exception {
	  
		public NegativeIntException()  {}
		public NegativeIntException(String message) {
			super(message);
		} 
	   }

