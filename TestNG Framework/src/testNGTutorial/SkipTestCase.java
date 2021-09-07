package testNGTutorial;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(priority = 0)
	public void T1	 () {
		System.out.println("Start the Car");
	}
	
	@Test(priority = 1, enabled = false)
	public void T2	 () {
		System.out.println("Adjust Seatbelt");
	}
	
	@Test(priority = 2)
	public void T3	 () {
		System.out.println("Press the Clutch");
	}
	
	@Test(priority = 3)
	public void T4	 () {
		System.out.println("Shift to 1st Gear");
	}
	
	@Test(priority = 4)
	public void T5	 () {
		System.out.println("Slowly release the Clutch to move the car forward");
	}

}
