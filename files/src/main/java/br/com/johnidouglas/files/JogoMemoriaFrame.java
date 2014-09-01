package br.com.johnidouglas.files;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JogoMemoriaFrame  {
		
	public static void main(String[] a) throws InterruptedException {		
		JogoMemoriaFrame tela = new JogoMemoriaFrame();
		tela.iniciarJogo();				
	}

	public void iniciarJogo() throws InterruptedException {

		Font font = new Font("SansSerif", Font.BOLD, 25);
		
		JFrame gui = new JFrame();
		gui.setLayout(new GridLayout(6, 1));
	
		JLabel lblCaracters = new JLabel("", SwingConstants.CENTER);
		gui.add(lblCaracters);
		lblCaracters.setFont(font);
		lblCaracters.setText("12 52 60 99 44");		
		
		JButton bntIniciarJogo = new JButton("Inicar Jogo");
		gui.add(bntIniciarJogo);
		bntIniciarJogo.setFont(font);
		bntIniciarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				
			}
		});
		
		JTextField edtDigitaCaractere = new JTextField();
		gui.add(edtDigitaCaractere);
		edtDigitaCaractere.setFont(font);
		edtDigitaCaractere.setHorizontalAlignment(JTextField.CENTER);
				
		JButton bntGravarJogada = new JButton("Gravar Jogada");
		gui.add(bntGravarJogada);
		bntGravarJogada.setFont(font);
		bntGravarJogada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		JLabel lblLetrasDigitadas = new JLabel("", SwingConstants.CENTER);
		gui.add(lblLetrasDigitadas);		
		lblLetrasDigitadas.setFont(font);
		

		JButton btnVerificarAcerto = new JButton("Verificar acerto");
		gui.add(btnVerificarAcerto);
		btnVerificarAcerto.setFont(font);
		btnVerificarAcerto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		
		gui.pack();
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		gui.setTitle("Jogo de Memoria");		
		gui.setSize(500, 250); 		
		gui.setVisible(true);	
		
		Thread.sleep(2000);
		lblCaracters.setText("");
		edtDigitaCaractere.requestFocus();

	}

}
