package com.test;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class AssertionExample {
	
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();

	@Test
	public void FBFriendListTest(){
		int total_friends = 100;
		int expected_total = 200;
		
		Assert.assertTrue("error message", 4>3);
		
		System.out.println("A");
		try {
		  Assert.assertEquals(expected_total, total_friends);
		}
		catch(Throwable T){
			System.out.println("Error encountered");
			errCollector.addError(T);
		}
		System.out.println("B");
		
		try {
			Assert.assertEquals("A", "B");
		}catch(Throwable T){
			System.out.println("Error encountered");
			errCollector.addError(T);
		}
		
		try {
			Assert.assertEquals("A", "A");
		}catch(Throwable T){
			System.out.println("No Errorr********");
			errCollector.addError(T);
		}
		
		
//		if(total_friends == expected_total){
//			System.out.println("Pass");		
//		} else
//			System.out.println("Pass");  //This is based on how we write the condition but we have assertions in juint
//		
	}

	// Assertions for error reporting
	/*
	 * Adv: Able to report the error in eclipse Dis: It will not execute next
	 * steps if assertion fails  --> We can overcome this by using try and catch wuth throwable but it makes test case as pass
	 * For this, we have add ErrCollector Rule
	 * 
	 * if we are running batch running 4 test cases, if any assertion fails in
	 * 1st test case.. it ignores complete first test case and moves to second
	 * test case..
	 * 
	 * 
	 */

}
