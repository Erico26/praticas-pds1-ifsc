package ex004;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex04 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JButton btn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex04 frame = new ex04();
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
	public ex04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text1 = new JTextField();
		text1.setBounds(10, 11, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(125, 11, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		btn = new JButton("Subtração");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());
				
				Long sub = inp1 - inp2;
				
				JOptionPane.showMessageDialog(btn, "A subtração de tudo foi: " + sub);
			}
		});
		btn.setBounds(122, 42, 89, 23);
		contentPane.add(btn);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double inp1 = Double.valueOf(text1.getText());
				Double inp2 = Double.valueOf(text2.getText());
				
				Double soma = inp1 + inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A soma de tudo foi: " + soma);
			}
		});
		btnSoma.setBounds(10, 42, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnMulti = new JButton("Multiplicação");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());
				
				Long mult = inp1 * inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A multiplicação de tudo foi: " + mult);
			}
		});
		btnMulti.setBounds(10, 76, 89, 23);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("Divisão");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long inp1 = Long.valueOf(text1.getText());
				Long inp2 = Long.valueOf(text2.getText());
				
				Long div = inp1 / inp2;
				
				JOptionPane.showMessageDialog(btnSoma, "A divisão de tudo foi: " + div);
			}
		});
		btnDiv.setBounds(122, 76, 89, 23);
		contentPane.add(btnDiv);
	}
}