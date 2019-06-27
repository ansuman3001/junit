package com.lti.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import org.junit.Test;

public class AnnotationsExample 
{
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("using @BeforeClass, executed before all test" +"cases");
	}

	@Test
	public void test() {
		System.out.println("hello");
	}
	@Before
	public void m2() {
		list=new ArrayList<String>();
		System.out.println("using @before Ammotation , Executed for each"+"test cases");
	}
	@AfterClass
	public static void m3() {
		System.out.println("using @AfterClass, Executed After All test Cases");
	}
	
	@After
	public void m4(){
		list.clear();
		System.out.println("Using @After, executed after each test cases.");
		
	}
	@Test
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
		System.out.println("we are in test method");
	}
	
	@Ignore
	public void m6() {
		System.out.println("Using @Ignore, this execution is ignored");
	}
	
	@Test(timeout =10)
	public void m7() {
		System.out.println("Using @Test(timeout), it can be used to enforce timeout"+"in JUnit test case");
	}
	@Test(expected=NoSuchMethodException.class)
	public void m8() {
		System.out.println("Using @Test(expected), it will check for"+"specified exception during its execution");
	}
	
	
	
	
	
	
	
	

}
