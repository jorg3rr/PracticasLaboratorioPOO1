package mx.parc1.soft.series;
public class Serie{
	public int hasta;
	public int lim;
	
	public Serie(){
	}
	
	public String fibo(int hasta){
		int x = 1;
		int y = 1;
		int r = 0;
		sp = " ";
			while(r < hasta){
				r = x + y;
				x = y;
				y = r;
				sp += " " + r;
			}
		return sp;
	}
	public int genNumero(int lim){
		do{
			int n = ((int)(Math.random()*x*10));

		}while(n > lim);
			
			return n;
}	
