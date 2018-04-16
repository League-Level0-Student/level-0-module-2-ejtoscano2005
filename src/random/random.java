package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class random {
	public static void main(String[] args) {
		Random ran =new Random();
		int randomChoice = ran.nextInt((1000-1)+1)+1;
JOptionPane.showMessageDialog(null, randomChoice);
Random ra =new Random();
int randomChoic = ran.nextInt((900-1)+1)+1;
JOptionPane.showMessageDialog(null, randomChoic);
JOptionPane.showMessageDialog(null, randomChoice + "+"+ randomChoic + "=" + (randomChoice+randomChoic));		
JOptionPane.showMessageDialog(null, randomChoice + "-"+ randomChoic + "=" + (randomChoice-randomChoic));	
	
	
	}	
	}
