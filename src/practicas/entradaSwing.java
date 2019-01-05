package practicas;
import javax.swing.JOptionPane;

public class entradaSwing {

	public static void main(String[] args) {
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Digite una Palábra: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número entero: "));
		letra  = JOptionPane.showInputDialog("Digite una letra o carácter; ").charAt(0);
		decimal= Double.parseDouble(JOptionPane.showInputDialog("Digite un Decimal: "));
		
		JOptionPane.showMessageDialog(null,"Tu palabra es: "+cadena+" \nTu Número Entero es : "+entero+"\nTu letra o caracter es: "+letra+"\nTu Número Decimal es: "+ decimal);

	}

}
