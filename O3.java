package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class O3 {

	public static void main(String[] args) {
		
		String nTall = showInputDialog("Skriv inn et tall ");
		
		int n = Integer.parseInt(nTall);
       
		
		String outTxt = "";
		for (int i = n; i >= 1; i--) {
			if (i == 1) {
				outTxt += i;
			} else {
				outTxt += i + "*";
			}
		}

		showMessageDialog(null, outTxt);
	}
}
