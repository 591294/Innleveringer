package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		int brutto = Integer.parseInt(showInputDialog("Bruttoinntekt:"));
		int skatt = 0;
		
			if (brutto > 180800) {
				skatt = (int) ((brutto - 180800) * ((1.9)/100));	
			} 
			if (brutto > 254500) {
				skatt = (int) ((254500 - 180800) * ((1.9)/100));
				skatt += (int) ((brutto - 254500) * ((4.2)/100));
			} 
			if (brutto > 639750) {
				skatt = (int) ((254500 - 180800) * ((1.9)/100));
				skatt += (int) ((639750 - 254500) * ((4.2)/100));
				skatt += (int) ((brutto - 639750) * ((13.2)/100));	
			} 
			if (brutto > 999550) {
				skatt = (int) ((254500 - 180800) * ((1.9)/100));
				skatt += (int) ((639750 - 254500) * ((4.2)/100));
				skatt += (int) ((999550 - 639750) * ((13.2)/100));
				skatt += (int) ((brutto - 999550) * ((16.2)/100));
			}			
			
			//Ikke så pen kode, og med ørlite avrundingsfeil pga cast
			
		showMessageDialog(null, "Trinnskatten er på " + skatt);
	}

}
