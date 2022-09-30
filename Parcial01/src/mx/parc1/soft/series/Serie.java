package mx.parc1.soft.series;
public class Serie{
	public int x;
	public int n;
	
	public Serie(){
		//this.num = num;
		//this.lim = lim;
	}
	
	public String fibo(int n){
		int r = 0;
		int a = 1;
		int b = 1;
		  while(r < n){
		  	 r = a + b;
		  }
		  return (a) + " " + b;
	}
	public int genNumero(int x){
		while (x > n){
			n = ((int)(Math.random()*x*10));
		}
		return n;
	}	
}