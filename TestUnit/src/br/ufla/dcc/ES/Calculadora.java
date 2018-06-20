package br.ufla.dcc.ES;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

public class Calculadora {
	
	private JFrame myView;

	public Calculadora() {
		viewCalc();
	}

	public void viewCalc(){

		myView = new JFrame();
		myView.getContentPane().setBackground(new Color(51, 102, 153));
		myView.getContentPane().setForeground(new Color(255, 255, 255));
		myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myView.setResizable(true);
		myView.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		myView.setTitle("Calculadora");
		myView.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		
		
		
		myView.setSize(485, 240);
		myView.setMinimumSize(new Dimension(485, 240));
		myView.setVisible(true);
		myView.setResizable(true);
	}
}	

