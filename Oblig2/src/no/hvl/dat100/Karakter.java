package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {
		
		for (int i=1; i <= 10; i++ ) {
		int poeng = Integer.parseInt(showInputDialog("Tast inn din poengsum"));

			if (poeng >=90 && poeng <=100) {
			showMessageDialog(null, "Du har fått karakteren A");
		
			} else {
			if (poeng >=80 && poeng <=89) {
			showMessageDialog(null, "Du har fått karakteren B");
		
			} else {
			if (poeng >=60 && poeng <=79) {
			showMessageDialog(null, "Du har fått karakteren C");
		
			} else {
			if (poeng >=50 && poeng <=59) {
			showMessageDialog(null, "Du har fått karakteren D");
		
			} else {
			if (poeng >=40 && poeng <=49) {
			showMessageDialog(null, "Du har fått karakteren E");
		
			} else {
			if (poeng >=0 && poeng <=39) {
			showMessageDialog(null, "Du strøk");
			} else {
			showMessageDialog(null, "Tast inn en gyldig poengsum");
								}
							}
						}
					}
				}
			}
		}	
	}

}
