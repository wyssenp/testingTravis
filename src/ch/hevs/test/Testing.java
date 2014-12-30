package ch.hevs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.hevs.model.Maths;

public class Testing {

	/**
	 * Test the add() method
	 */
	@Test
	public void testAdding() {
		Maths n1 = new Maths(3,5);
		assertEquals(8, n1.add());
	}
	
	/**
	 * Test the multiply() method
	 */
	@Test
	public void testMultiplying() {
		Maths n2 = new Maths(5,5);
		assertEquals(25, n2.multiply());
	}

}
