package com.mydevOps2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestClass {
	
	String str1="hello";
	String str2="Name";
@Test
public void test1() {		
	System.out.println("My Test layer 1 ");
	Assert.assertEquals(str1, "hello");	
}

@Test
public void test2() {		
	System.out.println("My Test layer 2 ");
	Assert.assertEquals(str2, "Name");	
}

}
