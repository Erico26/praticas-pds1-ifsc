package Ex001;
import javax.swing.JOptionPane;
public class ex001 {

	public static void main(String[] args) {
		double  precoLitro = 0.0;
		Integer  quantidadeLitros = 0;
		
		precoLitro = Double.valueOf(JOptionPane.showInputDialog("Insira o valor: "));
		quantidadeLitros = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor: ")); 
		
		JOptionPane.showMessageDialog(null, "preço total"+total(quantidadeLitros,precoLitro);
					 	
	}
	public static Double total(Integer quantidadeLitros, Double precoLitro){
		Double Valor_Total = quantidadeLitros*precoLitro;
		return Valor_Total;
	}
}
