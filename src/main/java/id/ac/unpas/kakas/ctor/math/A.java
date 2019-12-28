package id.ac.unpas.kakas.ctor.math;

import id.ac.unpas.kakas.ctor.impl.AddAndSubInterface;

public class A implements AddAndSubInterface {

	public A() {

	}

	@Override
	public int add(int n1, int n2) {

		return Math.addExact(n1, n2);
	}

	@Override
	public int sub(int n1, int n2) {

		return Math.subtractExact(n1, n2);
	}

	@Override
	public String toString() {
		return "A toString";
	}

}
