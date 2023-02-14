package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class janelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField texto;
	private JTextField texto2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaCadastro frame = new janelaCadastro();
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
	public janelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("Nome do Usuario");
		lblTexto.setBounds(73, 13, 110, 14);
		lblTexto.setForeground(new Color(255, 0, 0));
		contentPane.add(lblTexto);
		
	
		texto = new JTextField();
		texto.setBounds(188, 10, 126, 20);
		contentPane.add(texto);
		texto.setColumns(15);
		
		JButton ButtonConfirm = new JButton("Confirmar");
		ButtonConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = texto.getText();
				String CPF = texto2.getText();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido");
				}
				if(CPF.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF preenchido");
				
			}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(CPF));
					FuncionarioDAO banquinhoDeDados = FuncionarioDAO.get;
				
		}});
		ButtonConfirm.setBounds(165, 88, 89, 23);
		contentPane.add(ButtonConfirm);
		
		JLabel lblSenhaText = new JLabel("CPF");
		lblSenhaText.setForeground(Color.RED);
		lblSenhaText.setBounds(73, 49, 110, 14);
		contentPane.add(lblSenhaText);
		
		texto2 = new JTextField();
		texto2.setBounds(188, 46, 126, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		
		
	}
}
