package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void gdl ()
	{
		System.out.println("gdl");
	}
	
	@BeforeTest
	public void perrequist ()
	{
		System.out.println("It will execute first");
	}

}
