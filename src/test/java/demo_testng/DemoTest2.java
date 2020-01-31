package demo_testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTest2 {
	
@BeforeSuite
public void bsuite()
{
	System.out.println("inside before suite");
}

@Test
public void test3()
{
	System.out.println("inside test3");
}
@AfterSuite
public void asuite()
{
	System.out.println("inside after suite");
}
}
