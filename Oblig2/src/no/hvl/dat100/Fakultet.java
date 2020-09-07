package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class Fakultet {

	public static void main(String[] args) {
		long heltall = parseInt(showInputDialog("Tast inn heltall"));
		long resultat = heltall;
		
		if (heltall > 0) {
			
		for (int i =1; i <= heltall - 1; i++) {
			resultat *= i;
		}
			
		} else {
			showMessageDialog(null, "Tast inn ett tall større enn 0");
			return;
		}
	
		showMessageDialog(null, "Fakultet av tallet " + heltall + " er " + resultat);
	
	}

}
