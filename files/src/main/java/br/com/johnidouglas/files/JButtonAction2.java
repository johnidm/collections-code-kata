package br.com.johnidouglas.files;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JButtonAction2 implements ActionListener {

	JButton myButton = null;
	JLabel myLebal = null;
	String text = null;

	JLabel l1;

	JTextField field;

	public static void main(String[] a) {
		JButtonAction2 myTest = new JButtonAction2();
		myTest.createFrame();
	}

	public void createFrame() {

		// create the JFrame object
		JFrame gui = new JFrame();

		// myButton.

		gui.setLayout(new GridLayout(3, 1));

		// add a bunch of labels and buttons
		l1 = new JLabel("the label", SwingConstants.CENTER);
		gui.add(l1);
		Font font = new Font("SansSerif", Font.BOLD, 30);
		l1.setFont(font);

		JButton b1 = new JButton("push one");
		gui.add(b1);
		b1.addActionListener(this);

		field = new JTextField(5);
		gui.add(field);

		myButton = new JButton("push one");

		gui.add(myButton);

		// make the program terminate when the window is closed
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// give the window a title
		gui.setTitle("GUI Demo 6");

		// set the size of the window
		gui.setSize(500, 250); // 500 pixels wide and 250 pixels high

		// make the window visible
		gui.setVisible(true);

		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				field.setText("ola");
			}
		});

	}

	public void actionPerformed(ActionEvent e) {

		field.setText("ola");
		l1.setText("eee");
	}

}
