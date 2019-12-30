package id.ac.unpas.kakas.ctor.math;

public class C extends Maths {

	private double n1;
	private double n2;
	private A a;
	private B b;

	public C() {
		super();
		// TODO Auto-generated constructor stub
	}

	public C(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public int add() {
		a = new A();
		int n1a = (int) Math.round(n1);
		int n2b = (int) Math.round(n2);
		return a.add(n1a, n2b);
	}

	public int sub() {
		a = new A();
		int n1a = (int) Math.round(n1);
		int n2b = (int) Math.round(n2);
		return a.sub(n1a, n2b);
	}

	public double mul() {
		b = new B();
		return b.mul(n1, n2);
	}

	public double div() {
		b = new B();
		return b.div(n1, n2);
	}

	@Override
	public String toString() {
		return "C";
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

}
