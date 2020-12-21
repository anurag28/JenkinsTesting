package com.pipelinetests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pipelineactions.PrintHello;

public class PrintHelloTest {
	
	PrintHello printHello;
	
	@BeforeClass
	public void init() {
		printHello = new PrintHello();
	}
	
	@Test
	public void printHelloTest() {
		Assert.assertTrue(printHello.printHello().equals("Hello there!!"), "[ASSERT FAILED]");
	}

}
