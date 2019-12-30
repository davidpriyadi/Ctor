package id.ac.unpas.kakas.main;

import id.ac.unpas.kakas.ctor.math.A;
import id.ac.unpas.kakas.ctor.math.B;
import id.ac.unpas.kakas.ctor.math.C;
import id.ac.unpas.kakas.ctor.math.D;
import id.ac.unpas.kakas.ctor.math.DataList;
import id.ac.unpas.kakas.ctor.math.E;

public class MainApp {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		E e = new E();
		c = new C(10, 5);
		System.out.println("============== Tampilan Konsole " + c.toString() + " ==============");
		System.out.println("Bilangan 1 = " + c.getN1() + " Bilangan 2 = " + c.getN2());
		System.out.println("Tambah " + c.add());
		System.out.println("Kurang " + c.sub());
		System.out.println("Kali " + c.mul());
		System.out.println("Bagi " + c.div());
		System.out.println("=== Mod And Sqrt ==");
		System.out.println("Modulus " + c.mod(10, 3));
		System.out.println("Sqrt " + c.sqrt(100));
		
		System.out.println("============== Tampilan Konsole " + d.toString() + " ==============");
		System.out.println("Bagi " + d.div(10, 5));
		System.out.println("Kali " + d.mul(10, 5));
		System.out.println("Pow "+d.pow(10, 5));

		System.out.println("============== Tampilan Konsole " + e.toString() + " ==============");
		e.setDataList(DataList.dataListE());
		System.out.println(e.getDataList());
		System.out.print("Cari : ");
		String cari = "david";
		System.out.println(cari);
		boolean hasil = e.contains(cari);
		if (hasil) {
			System.out.println("Data Ada");
		}else {
			System.out.println("Data Tidak ada");
		}
	}
}
