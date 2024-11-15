package br.edu.fatecpg.lista.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecpg.lista.model.Aluno;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class JFrame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;
	private JTextField txt_telefone;
	private static ArrayList<Aluno> ListaAlunos = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame1 frame = new JFrame1();
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
	public JFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(245, 245, 245));

		JLabel lblTitulo = new JLabel("Formulário Aluno");
		lblTitulo.setBounds(130, 10, 200, 30);
		lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblTitulo);

		JButton btn_cadastrar = new JButton("Cadastrar");
		btn_cadastrar.setBackground(new Color(34, 139, 34));
		btn_cadastrar.setForeground(Color.WHITE);
		btn_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txt_nome.getText();
				String telefone = txt_telefone.getText();

				if (!nome.isEmpty() && !telefone.isEmpty()) {

					ListaAlunos.add(new Aluno(nome, telefone));
					JOptionPane.showMessageDialog(btn_cadastrar, "Cadastrando com sucesso!");
					txt_nome.setText("");
					txt_telefone.setText("");
				}

				else {
					JOptionPane.showMessageDialog(btn_cadastrar, "Campos Vazios!");
				}

			}
		});
		btn_cadastrar.setBounds(41, 134, 117, 25);
		contentPane.add(btn_cadastrar);

		JButton btn_listar = new JButton("Listar");
		btn_listar.setBackground(new Color(34, 139, 34));
		btn_listar.setForeground(Color.WHITE);

		btn_listar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JFrame2 jframe2 = new JFrame2(ListaAlunos);
				jframe2.setVisible(true);
			}
		});

		btn_listar.setBounds(41, 175, 117, 25);
		contentPane.add(btn_listar);

		txt_nome = new JTextField();
		txt_nome.setToolTipText("Nome Aluno");
		txt_nome.setBounds(41, 31, 114, 19);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);

		txt_telefone = new JTextField();
		txt_telefone.setToolTipText("Telefone Aluno");
		txt_telefone.setBounds(41, 78, 114, 19);
		contentPane.add(txt_telefone);
		txt_telefone.setColumns(10);

	}
}
