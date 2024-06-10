package practice;

	import org.testng.annotations.Test;

	

		public class ExpectedExceptionMessageTest {
	    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "/ by zero")
	    public void testDivisionByZero() {
	        double result = 5 / 0;
	        System.out.println(result);
	    }
	    
	}


