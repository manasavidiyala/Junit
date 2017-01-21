package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTest {
	
	public static boolean checkLoginTest(){
		return false;
	}
	
	//BeforeClass and AfterClass suite will excute only ones for suite
	
	@BeforeClass
	public static void beginTest(){
		System.out.println("Before!!!!!!!!!");
		Assume.assumeTrue(checkLoginTest());
	}
	//Before and after methods will execute for all the methods
	@Before
	public void openBrowserTest(){
		System.out.println("opening Browser");
	}
	
	@Test
	public void sendEmailTest(){
		System.out.println("Testing Sending email test ");
	}
	
	@Test
	public void sendMessageTest(){
		System.out.println("Testing sending message");
	}
	
	@After
	public void closeBrowserTest(){
		System.out.println("closing the browser");
	}
	
	@AfterClass
	public static void afterTest(){
		System.out.println("After!!!!!!!!!!");
	}

}
