package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	
	String test = "Monday"; //Storing values using String return type
	String test2 = "Tuesday";
	boolean test3 = false; //Storing false value using boolean return type
	
	@Test
	public void CompareValues() {
		Assert.assertEquals(test, "Monday"); //Using assertEquals comparing two strings
		System.out.println("1st working day is Monday");
		
	}
	
	@Test
	public void CompareValues2() {
		Assert.assertNotEquals(test2, "Wednesday");//Using assertNotEquals comparing two strings
		System.out.println("2nd working day is not Wednesday");
		
	}
	
	@Test
	public void CompareValues3() {
		Assert.assertTrue(test3, "true");//Using assertTrue comparing boolean values
				
	}
	
	@Test
	public void CompareValues4() {
		Assert.assertFalse(test3, "true");//Using assertFalse comparing boolean values
				
	}

	@Test
	public void CompareValues5() {
		Assert.assertTrue(test3);
				
	}
}
