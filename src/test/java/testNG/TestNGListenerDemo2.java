package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.Class1.class)
public class TestNGListenerDemo2 {

	@Test
	public void test4()
	{
		System.out.println("Inside Test 4");
	}
	
	@Test
	public void test5()
	{
		System.out.println("Inside Test 5");
		Assert.assertEquals("1", "2");
	}
	
	@Test
	public void test6()
	{
		System.out.println("Inside Test 6");
		throw  new SkipException("Skipped");
	}
	
}
