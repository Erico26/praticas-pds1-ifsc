package ex003;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ex03 {

	public static void main(String[] args) {
		int i;
		Double[] calc;
		Double num =  0.0;
		calc = new Double[3];
		
		for (i = 1; i < 4; i++) {
			num = Double.parseDouble((JOptionPane.showInputDialog("Digite a nota "+i+" do aluno(a) :")));
			 calc[i] = num/3;
		}
		
	 
	 JOptionPane.showMessageDialog(null, calc[i]);

	}

}
