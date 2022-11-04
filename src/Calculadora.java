import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {
	double num1 = 0 , num2 = 0;
	String operacao = " ";
	
	
	private JPanel contentPane;
	private JTextField Resultado;
	private JTextField txtCalculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	
	
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton Botao_01 = new JButton("1");
		Botao_01.setBounds(29, 302, 82, 79);
		Botao_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "1");
			}
		});
		contentPane.setLayout(null);
		Botao_01.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_01);
		
		JButton Botao_02 = new JButton("2");
		Botao_02.setBounds(123, 302, 80, 79);
		Botao_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "2");
			}
		});
		Botao_02.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_02);
		
		JButton Botao_03 = new JButton("3");
		Botao_03.setBounds(215, 302, 81, 79);
		Botao_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "3");
			}
		});
		Botao_03.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_03);
		
		JButton Botao_04 = new JButton("4");
		Botao_04.setBounds(29, 211, 82, 79);
		Botao_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "4");
			}
		});
		Botao_04.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_04);
		
		Resultado = new JTextField();
		Resultado.setBounds(29, 27, 454, 81);
		Resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		Resultado.setFont(new Font("Lucida Grande", Font.BOLD, 60));
		contentPane.add(Resultado);
		
		JButton Botao_05 = new JButton("5");
		Botao_05.setBounds(123, 211, 80, 79);
		Botao_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "5");
			}
		});
		Botao_05.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_05);
		
		JButton Botao_06 = new JButton("6");
		Botao_06.setBounds(215, 211, 81, 79);
		Botao_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "6");
			}
		});
		Botao_06.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_06);
		
		JButton Botao_07 = new JButton("7");
		Botao_07.setBounds(29, 120, 82, 79);
		Botao_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "7");
			}
		});
		Botao_07.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_07);
		
		JButton Botao_08 = new JButton("8");
		Botao_08.setBounds(121, 120, 82, 79);
		Botao_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "8");
			}
		});
		Botao_08.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_08);
		
		JButton Botao_09 = new JButton("9");
		Botao_09.setBounds(216, 120, 80, 79);
		Botao_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "9");
			}
		});
		Botao_09.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_09);
		
		JButton Botao_00 = new JButton("0");
		Botao_00.setBounds(29, 393, 173, 79);
		Botao_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ "0");
			}
		});
		Botao_00.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Botao_00);
		
		JButton soma = new JButton("+");
		soma.setBounds(311, 393, 70, 79);
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(Resultado.getText());
				Resultado.setText((" "));
				operacao = "soma";
			}
		});
		soma.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(soma);
		
		JButton Divisao = new JButton("/");
		Divisao.setBounds(311, 120, 81, 79);
		Divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(Resultado.getText());
				Resultado.setText((" "));
			    operacao = "divisao";
			}
		});
		Divisao.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Divisao);
		
		JButton multiplicacao = new JButton("X");
		multiplicacao.setBounds(308, 211, 79, 79);
		multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(Resultado.getText());
				Resultado.setText((" "));
				operacao = "multiplicacao";
			}
		});
		multiplicacao.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(multiplicacao);
		
		JButton subtracao = new JButton("-");
		subtracao.setBounds(308, 302, 79, 79);
		subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(Resultado.getText());
				Resultado.setText((" "));
				operacao = "subtracao";
			}
		});
		subtracao.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(subtracao);
		
		JButton btnNewButton_3_1_3_1 = new JButton("c");
		btnNewButton_3_1_3_1.setBounds(404, 120, 79, 170);
		btnNewButton_3_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText("");
			}
		});
		btnNewButton_3_1_3_1.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(btnNewButton_3_1_3_1);
		
		JButton Igual = new JButton("=");
		Igual.setBounds(404, 302, 79, 170);
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(operacao ==  "soma") {
					Resultado.setText(String.valueOf(num1 + num2));
					
				}else if(operacao == "subtracao") {
					Resultado.setText(String.valueOf(num1 - num2));

				}else if(operacao == "multiplicacao") {
					Resultado.setText(String.valueOf(num1 * num2));

					
				}else if(operacao == "divisao") {
					Resultado.setText(String.valueOf(num1 / num2));

				}
			}
		});
		Igual.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(Igual);
		
		JButton virgula = new JButton(",");
		virgula.setBounds(215, 393, 80, 79);
		virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+ ",");
			}
		});
		virgula.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		contentPane.add(virgula);
		
		txtCalculadora = new JTextField();
		txtCalculadora.setBounds(184, 2, 114, 26);
		txtCalculadora.setText("  CALCULADORA\n");
		contentPane.add(txtCalculadora);
		txtCalculadora.setColumns(10);
	
	
	}
}
