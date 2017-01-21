package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
FirstTest.class,
SecondTest.class,
AssertionExample.class,
ParameterizingTest.class
})
public class BatchTestRunner {
	
	

}
