package id.ac.unpas.kakas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import id.ac.unpas.kakas.ctor.math.D;


public class TestD {
	
	D d = new D();
	@Test
	public void testMul() {
		double hasil = d.mul(5, 3); 
		assertEquals(15, hasil, 0.0);
	}

	@Test
	public void testDiv() {
		double hasil = d.div(9, 3); 
		assertEquals(3, hasil, 0.0);
	}
	
	@Test
	public void testPow() {
		double hasil = d.pow(3, 3); 
		assertEquals(27, hasil, 0.0);
	}	
}
