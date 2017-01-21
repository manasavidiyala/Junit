package com.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizingTest {
	public String name;
	public String password;
	public int zip;
	
		
	public ParameterizingTest(String name, String password, int zip) {
		super();
		this.name = name;
		this.password = password;
		this.zip = zip;
	}

    @Parameters
    public static Collection<Object[]> getdata(){
    	
    	//rows --> number times to repeat the test
    	//columns --> number of parameters
    	Object[][] data = new Object[2][3];
    	data[0][0] = "user1";
    	data[0][1] = "pass1";
    	data[0][2] = 94087;
    	
    	data[1][0] = "user2";
    	data[1][1] = "pass2";
    	data[1][2] = 94087;
    			
		return Arrays.asList(data);   //asList converts object array in to array list
    	
    }
	@Test
	public void registerTest(){
		System.out.println("Testing registratiion test" + name + password +zip);
		
	}

}
