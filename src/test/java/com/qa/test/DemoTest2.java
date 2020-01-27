package com.qa.test;

import org.testng.annotations.Test;

public class DemoTest2 {
	@Test(priority=3)
public void sub() {
		int a,b,c;
		a=10;
		b=20;
		c=b-a;
		System.out.println("Subtration: "+c);
	}
}
