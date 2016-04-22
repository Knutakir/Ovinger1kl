/*Oppgave 3
Side 283 i læreboken*/
import static javax.swing.JOptionPane.*;

class Oppgave3{
	public static void main(String[] args){
		String lesTekst = showInputDialog("Skriv inn en tekst");
		String lesBytteOrd = showInputDialog("Skriv inn et ord du vil bytte ut");
		String lesNyttOrd = showInputDialog("Skiv inn et ord å bytte med");

		Tekstbehandling behandler = new Tekstbehandling(lesTekst);
		showMessageDialog(null, "Det er " + behandler.ordITeksten() + " ord i teksten.");
		showMessageDialog(null, "Gj.snittlig ordlengde er " + behandler.gjsnittOrdLengde());

		showMessageDialog(null, "Gjsnittlig ord i periode er "  + behandler.gjsnittOrdIPeriode());
		/*
		//Gj.snittLengde periode:
		double[] tabellen = behandler.gjsnittOrdIPeriode();
		for(int i = 0; i < tabellen.length; i++){
			showMessageDialog(null, "I periode " + (i + 1) + ", er det gj.snittlig ordlrngde: " + tabellen[i]);
		}*/

		showMessageDialog(null, "Skift ut ord: " + behandler.skiftUtOrd(lesNyttOrd, lesBytteOrd));
		showMessageDialog(null, "Hent ut tekst: " + behandler.hentTekst());
		showMessageDialog(null, "HENT UT TEKST: " + behandler.hentTekstSTOR());
	}
}