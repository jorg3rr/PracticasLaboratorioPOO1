package mx.parc1.soft.series;
public class Serie{
	public int num;
	public int x = 0;
	public int lim;
	public int y = 0;
	public Serie(){
	}
	public String fibo(int num, int x, int y){
		int r = 0;
		  while(r < lim){
		  	System.out.println();
		  }
	}
	public int genNumero(int num, int lim){
		while (num > 10){
			num = ((int)(Math.random()*lim*10));
		}
		return lim;
	}	
}