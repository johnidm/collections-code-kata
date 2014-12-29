package br.com.johnidouglas;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Capitulo3 {

	
	
	public static void main(String[] args) {
		
		/*
		Runnable r = () -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(i);
			}
		};

		new Thread(r).start();
		*/

		/*
		JFrame frame = new JFrame("JFrame Source Demo");
		
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
				
		
		Button button = new Button("Click me");
		button.addActionListener(
				(event) -> {
					String text = event.toString();				
					
					System.out.println(text);
				});		
		
		frame.getContentPane().add(button, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(220, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		*/
		
		/*
		new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(i);
			}
		}).start();
		*/
		
		/*
		Validador<String> validadorCEP = new Validador<String>() {
						
			@Override
			public boolean valida(String t) {
				return t.matches("[0-9]{5}-[0-9]{3}");
			}
			
		};*/
		
				
		Validador<String> validadorCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validadorCEP.valida("05144-1999"));		
		
		
	}
	
	
	
	
	
	
}
