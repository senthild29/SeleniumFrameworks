package testNGTutorial;

import org.testng.annotations.Test;

public class GroupingTestCase {
	
	@Test(groups = "Apple Case") //Creating a group name "Apple Case" to group the test cases related to Apple testing
	public void Apple() {
		System.out.println("This is a Apple Product");
	}
	
	@Test(groups = "Apple Case")
	public void Apple2() {
		System.out.println("This is a Apple2 Product");
	}
	
	@Test(groups = "Google Case")
	public void Google() {
		System.out.println("This is a Google Product");
	}
	
	@Test(groups = "Google Case")
	public void Google2() {
		System.out.println("This is a Google2 Product");
	}
	
	@Test(groups = "Samsung Case")
	public void Samsung() {
		System.out.println("This is a Samsung Product");
	}
	
	@Test(groups = "Samsung Case")
	public void Samsung2() {
		System.out.println("This is a Samsung2 Product");
	}

	@Test(groups = "Lenovo Case")
	public void Lenovo() {
		System.out.println("This is a Lenovo Product");
	}
	
	@Test(groups = "Lenovo Case")
	public void Lenovo2() {
		System.out.println("This is a Lenovo2 Product");
	}
}
