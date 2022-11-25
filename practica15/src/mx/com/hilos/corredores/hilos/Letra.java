package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
public class Letra implements Runnable{
	char letra;
	JLabel etq;
	public Letra(JLabel etq, char letra){
		this.etq = etq;
		this.letra = letra;
	}
	public void run(){
		String cadena = "";
		for (int i = 0; i <= 50; i++) {
			etq.setText(etq.getText() + letra);
			int rand = (int)(Math.random()*1000);
			try{
				Thread.sleep(rand);
			}catch(InterruptedException e){

			}
		}
		etq.setText(etq.getText() + "Finalizado");
	}
}