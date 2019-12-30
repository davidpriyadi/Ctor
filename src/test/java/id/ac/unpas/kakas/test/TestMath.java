package id.ac.unpas.kakas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import id.ac.unpas.kakas.ctor.math.Maths;



public class TestMath {

	Maths m = new Maths();

	@Test
	public void testMod() {
		int hasil = m.mod(10, 3);
		assertEquals(1, hasil);
	}

	@Test
	public void testSqrt() {
		double hasil = m.sqrt(9);
		assertEquals(3, hasil, 0.0);

	}

}
