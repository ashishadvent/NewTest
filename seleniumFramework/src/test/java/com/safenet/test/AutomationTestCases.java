package com.safenet.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


   public class AutomationTestCases {
	@BeforeTest
	public void webDriverInit()
	{
		System.out.println("Welcome to automation world");
	}
     @Test
     public void test1(){
    	 System.out.println("Welcome to automation world");
    	 
     }
}
