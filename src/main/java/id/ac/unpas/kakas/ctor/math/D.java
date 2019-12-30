package id.ac.unpas.kakas.ctor.math;

import id.ac.unpas.kakas.ctor.impl.PowInterface;

public class D implements PowInterface {

	@Override
	public double pow(double n1, double n2) {
		// TODO Auto-generated method stub
		return Math.pow(n1, n2);
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
		return "D []";
	}
	
	

}
