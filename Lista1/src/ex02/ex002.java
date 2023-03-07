package ex02;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ex002 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		String pal;
		
		for (int i = 0; i < 10; i++) {
			pal = JOptionPane.showInputDialog("Escreva uma palavra: ");
			lista.add(pal);
		}
		
		JOptionPane.showMessageDialog(null, lista);
	}
	
}
