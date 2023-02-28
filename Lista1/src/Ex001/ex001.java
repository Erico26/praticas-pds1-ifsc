package Ex001;
import javax.swing.JOptionPane;
public class ex001 {

	public static void main(String[] args) {
		double  precoLitro = 0.0;
		Integer  quantidadeLitros = 0;
		
		precoLitro = JOptionPane.showInputDialog("Insira o valor: ");
		quantidadeLitros = JOptionPane.showInputDialog("Insira o valor: ");
		
		JOptionPane.showMessageDialog(null, quantidadeLitros);
		
	}

}
