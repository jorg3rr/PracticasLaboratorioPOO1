package mx.parc1.soft.series;
public class Serie{
	public int num;
	public int lim;
	//public int x = 0;
	//public int y = 0;
	
	public Serie(int num, int lim){
		this.num = num;
		this.lim = lim;
	}
	public String fibo(int lim){
		int r = 0;
		int x = 0;
		int y = 0;
		  while(r < lim){
		  	 r = x + y;
		  }
		  return (x) + " " + y;
	}
	public int genNumero(int lim){
		while (num > 10){
			num = ((int)(Math.random()*lim*10));
		}
		return lim;
	}	
}