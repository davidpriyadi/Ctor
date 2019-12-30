package id.ac.unpas.kakas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import id.ac.unpas.kakas.ctor.math.B;



public class TestB {

	B b = new B();

	@Test
	public void testMul() {
		double hasil = b.mul(5, 3); 
		assertEquals(15, hasil, 0.0);
	}

	@Test
	public void testDiv() {
		double hasil = b.div(9, 3); 
		assertEquals(3, hasil, 0.0);
	}
}
