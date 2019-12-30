package id.ac.unpas.kakas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import id.ac.unpas.kakas.ctor.math.A;



public class TestA {

	A a = new A();

	@Test
	public void testAdd() {
		int hasil = a.add(3, 5);
		assertEquals(8, hasil);
	}

	@Test
	public void testSub() {
		int hasil = a.sub(10, 5);
		assertEquals(5, hasil);
	}
}
