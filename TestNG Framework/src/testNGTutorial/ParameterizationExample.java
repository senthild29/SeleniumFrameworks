package testNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test
	@Parameters("sName")//Using this annotation SuiteXML file will identify the method to pass the value
	public void StudentName(String getData) //By creating a variable inside method, will pass the value from parameters 
	{
		System.out.println("Name of the Student : " +getData);
	}
	
	@Test
	@Parameters("sAge") 
	public void StudentAge(String getData2) 
	{
		System.out.println("Age of Student : "+getData2);
	}
	
	@Test
	@Parameters("sGender")
	public void StudentGender(String getData3) {
		System.out.println("Student Gender : "+getData3);
	}

}
