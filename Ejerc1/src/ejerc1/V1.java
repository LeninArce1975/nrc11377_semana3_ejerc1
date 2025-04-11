package ejerc1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmeroopconal;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumaTresEnteros;
	private JButton btnSumaDosReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número");
			lblNewLabel.setBounds(10, 11, 107, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número");
			lblSegundoNmero.setBounds(10, 36, 107, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmeroopconal = new JLabel("Tercer número (opconal)");
			lblTercerNmeroopconal.setBounds(10, 61, 134, 14);
			contentPane.add(lblTercerNmeroopconal);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(145, 8, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(145, 33, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(145, 61, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Suma dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(103, 92, 162, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumaTresEnteros = new JButton("Suma tres enteros");
			btnSumaTresEnteros.addActionListener(this);
			btnSumaTresEnteros.setBounds(103, 124, 162, 23);
			contentPane.add(btnSumaTresEnteros);
		}
		{
			btnSumaDosReales = new JButton("Suma dos reales");
			btnSumaDosReales.addActionListener(this);
			btnSumaDosReales.setBounds(103, 158, 162, 23);
			contentPane.add(btnSumaDosReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 210, 256, 74);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("Verificando");
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumaDosReales) {
			do_btnSumaDosReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaTresEnteros) {
			do_btnSumaTresEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		int n1=Integer.parseInt(txtN1.getText());
		int n2=Integer.parseInt(txtN2.getText());
		Calculadora c=new Calculadora(n1, n2);
		txtS.setText("");
		txtS.append("La suma es: "+c.Sumar(n1, n2));
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(this,"Ingrese números enteros");
	}
	
	}
	protected void do_btnSumaTresEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtN1.getText());
			int n2=Integer.parseInt(txtN2.getText());
			int n3=Integer.parseInt(txtN3.getText());
			Calculadora c=new Calculadora(n1, n2,n3);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(n1, n2,n3));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese números enteros");
		}
	}
	protected void do_btnSumaDosReales_actionPerformed(ActionEvent e) {
		try {
			double num1=Double.parseDouble(txtN1.getText());
			double num2=Double.parseDouble(txtN2.getText());
			Calculadora c=new Calculadora(num1,num2);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(num1,num2));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese números reales");
		}		
	}
}










