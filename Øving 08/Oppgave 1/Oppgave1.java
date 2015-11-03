/*Oppgave 8.16.1
Side 283 i læreboken*/

import static javax.swing.JOptionPane.*;

class Oppgave1{
	public static void main(String[] args){
		String lesTekst = showInputDialog("Skriv inn en tekst");
		String lesFBokstav = showInputDialog("Skriv inn en bokstav som skal fjernes");

		NyString tekst = new NyString(lesTekst);
		showMessageDialog(null, tekst.forkorting());
		showMessageDialog(null, tekst.fjerningAvTegn(lesFBokstav));

	}
}