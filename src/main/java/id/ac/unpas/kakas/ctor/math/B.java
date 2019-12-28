package id.ac.unpas.kakas.ctor.math;

import id.ac.unpas.kakas.ctor.impl.MulAndDivInterface;

public class B implements MulAndDivInterface {

	public B() {
		super();
	}

	@Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 / n2;
	}

	@Override
	public String toString() {
		return "B []";
	}

}
