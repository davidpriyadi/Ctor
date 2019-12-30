package id.ac.unpas.kakas.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import id.ac.unpas.kakas.ctor.math.DataList;
import id.ac.unpas.kakas.ctor.math.E;


public class TestE {

	E e = new E();

	@Test
	public void testContainsTrue() {
		e.setDataList(DataList.dataListE());
		boolean hasil = e.contains("david");
		assertTrue(hasil);
	}

	@Test
	public void testContainsFalse() {
		e.setDataList(DataList.dataListE());
		boolean hasil = e.contains("agus");
		assertFalse(hasil);
	}
}
