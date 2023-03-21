package Ex001;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;

import org.w3c.dom.Text;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ex01 extends JFrame {

	private JPanel contentPane;
	private JTextField textN1;
	private JTextField textNeE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
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
	public Ex01() {
		ArrayList<Double> num = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textN1 = new JTextField();
		textN1.setBounds(96, 11, 86, 20);
		contentPane.add(textN1);
		textN1.setColumns(10);
		
		textNeE = new JTextField();
		textNeE.setEditable(false);
		textNeE.setColumns(10);

		
		JLabel lblNewLabel = new JLabel("Número");
		lblNewLabel.setBounds(28, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(28, 63, 58, 14);
		contentPane.add(lblResultado);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.valueOf(textN1.getText());
				
				num.add(n1);
			}
		});
		btnCadastrar.setBounds(91, 110, 101, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer cont = 0;
				for(int i=0; i<num.size();i++) {
					if(num.get(i)%2==0) {
						cont++;
					}
				}
				textNeE.setText(String.valueOf(cont));
				
			}
		});
		btnExibir.setBounds(91, 144, 101, 23);
		contentPane.add(btnExibir);
	}
}