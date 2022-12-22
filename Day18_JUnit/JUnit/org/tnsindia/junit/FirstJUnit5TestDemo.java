package org.tnsindia.junit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJUnit5TestDemo {
	/*It signifies that this is a test method in to which 
	 * we write our code to test*/
	@Test
	void print() {
		System.out.println("First JUnit5 Demo");
	}
	
	@Test
	//Disabled annotation makes the method as a disabled
	@Disabled
	void display()
	{
		fail("Fail to print");
	}

}