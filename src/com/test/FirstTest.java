package com.test;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTest {
	
	@Test
	public void loginTest(){
		System.out.println("This is Login Method");
	}
	
	@Ignore
	@Test
	public void registerTest(){
		System.out.println("This is Register Test");
	}
	
	@Test
	public void logoutTest(){
		System.out.println("This is Log out Test");
	}

}
