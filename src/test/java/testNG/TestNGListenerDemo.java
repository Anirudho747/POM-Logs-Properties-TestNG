package testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.Class1.class)
public class TestNGListenerDemo {

	@Test
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Inside Test2");
		AssertJUnit.assertEquals("1", "2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Inside Test3");
		throw  new SkipException("Skipped");
	}
	
}
