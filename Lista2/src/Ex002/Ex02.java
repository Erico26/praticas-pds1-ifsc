package Ex002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ex02 extends JFrame {

	private JPanel contentPane;
	private JTextField textC;
	private JTextField textMe;
	private JTextField textM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex02 frame = new Ex02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex02() {
		ArrayList<Double> numero = new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textC = new JTextField();
		textC.setBounds(181, 10, 86, 20);
		contentPane.add(textC);
		textC.setColumns(10);
		
		textM = new JTextField();
		textM.setEditable(false);
		textM.setBounds(181, 136, 86, 20);
		contentPane.add(textM);
		textM.setColumns(10);
		
		textMe = new JTextField();
		textMe.setEditable(false);
		textMe.setBounds(181, 167, 86, 20);
		contentPane.add(textMe);
		textMe.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Maior");
		lblNewLabel.setBounds(61, 138, 59, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menor");
		lblNewLabel_1.setBounds(51, 169, 79, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastre-se");
		lblNewLabel_2.setBounds(53, 12, 89, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.setBackground(new Color(0, 128, 64));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double btn = Double.valueOf(textC.getText());
				numero.add(btn);
			}
		});
		btnNewButton.setBounds(169, 58, 117, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIBIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double menor = Double.MAX_VALUE;
				Double maior = Double.MIN_VALUE;
				
				for (int i = 0; i < numero.size(); i++) {
					if(numero.get(i)>maior) {
						maior = numero.get(i);
					}
					if(numero.get(i)<menor) {
						menor = numero.get(i);
					}
				}
				textM.setText(String.valueOf(maior));
				textMe.setText(String.valueOf(menor));
			}
		});
		btnNewButton_1.setBounds(169, 102, 117, 23);
		contentPane.add(btnNewButton_1);
	}
}
