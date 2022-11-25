package mx.com.hilos.corredores.hilos;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class RunHilos{
	public void iniciar(JTextField txt1, JTextField txt2,
	JLabel elem1, JLabel elem2){
		char ch1, ch2;
		ch1 = txt1.getText().charAt(0);
		ch2 = txt1.getText().charAt(0);
		if (ch1 =='\0' || ch1 == ' ') {
			ch1 = 'E';
		}
		if (ch2 =='\0' || ch2 == ' ') {
			ch2 = 'M';
		}
		String salida1 = String.valueOf(ch1);
		String salida2 = String.valueOf(ch2);
		
		elem1.setText(salida1);
		elem2.setText(salida2);

		Letra hilo1 = new Letra(elem1, ch1);
		Letra hilo2 = new Letra(elem2, ch2);
	}
}