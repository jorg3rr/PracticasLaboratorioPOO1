package mx.parc1.soft.pruebas;
import mx.parc1.soft.series.*;
public class TestSeries {
	public static void main(String[] args) {
		Serie s = new Serie();
		int  
		//int m = s.genNumero(100);
		//s.primos(m);
		//int o = s.primoN(m/10);
		//System.out.println(o);
		int n = s.genNumero(100);
		s.fibo(n);
		int p = s.fibo();
		System.out.println(p);
	}
}