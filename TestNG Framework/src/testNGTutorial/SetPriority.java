package testNGTutorial;

import org.testng.annotations.Test;

public class SetPriority {

	@Test(priority = 0)
	public void startACar() {
		System.out.println("Start the Car");
	}

	@Test(priority = 1)
	public void PutFirstGear() {
		System.out.println("Put 1st Gear");
	}
	@Test(priority = 2)
	public void Clutch() {
		System.out.println("Release the Clutch slowly");

	}
	@Test(priority = 3)
	public void Accelarate() {
		System.out.println("Give Accelaration to move the Car");

	}
	
	@Test(priority = 4)
	public void Stop() {
		System.out.println("Stop the Car, change to Neutral and put hand brake.");

	}
}
