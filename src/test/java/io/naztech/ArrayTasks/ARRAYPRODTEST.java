package io.naztech.ArrayTasks;

import org.junit.Test;

import junit.framework.TestCase;

public class ARRAYPRODTEST extends TestCase {
	
	/*@Test
	public void testCompareTo() {
		App a=new App();
		int g=a.product_max();
		int f=30;
		//assertEquals(f,g);
	}*/
	
	@Test
	public void testmax() {
		App a=new App();
		int g=a.max();
		int f=3;
		assertEquals(f,g);
	}
	@Test
	public void testmin() {
		App a=new App();
		int g=a.min();
		int f=1;
		assertEquals(f,g);
	}
}
