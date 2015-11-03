/*Øving 1*/
/*Oppgave 2.13.1 side 83/

/*Importerer JOptionPane for mindre skriving senere*/
import static javax.swing.JOptionPane.*;
class Oving3123{
	public static void main(String[] args){
		/*Brukeren av programmet skriver inn et årstall*/
		String årLest = showInputDialog("Skriv et år: ");

		/*Tallet gjøres om fra String til int*/
		int år = Integer.parseInt(årLest);

		if(år >= 0){
			/*Sjekke om årstallet er delelig med 4*/
			if(år%4 != 0){
				showMessageDialog(null, "Året er ikkje et skuddår.");
			} else if (år%100 != 0){
				showMessageDialog(null, "Året er et skuddår.");
			} else if (år%400 != 0){
				showMessageDialog(null, "Året er ikkje et skuddår.");
			}else{
				showMessageDialog(null, "Året er et skuddår.");
			}
		} else {
			showMessageDialog(null, "Du må skrive inn et positivt år.");
		}
	}
}

/* Testdatasett
nr1:		tall:	        resultat:
1		0				Året er et skuddår.
2		100				Året er ikkje et skuddår.
3		4				Timer: 0, minutt: 0, sekund: 2
4		400				Året er et skuddår.
5		800				Året er et skuddår.
6		-2				Du må skrive inn et positivt år.*/
