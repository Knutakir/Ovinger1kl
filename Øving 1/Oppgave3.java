/*Øving 1*/
/*Oppgave 2.13.2 side 83/

/*importere bibloteket så en slipper å skrive så mye lengre nedi*/
import static javax.swing.JOptionPane.*;
class Oppgave3{
	public static void main(String[] args){
		/*Brukeren av programmet skriver inn anntall sekund*/
		String sekundLest = showInputDialog("Sekund: ");

		/*Lese totalt sekund. Gjør om fra String til integer*/
		int sekundTOT = Integer.parseInt(sekundLest);

		/*Sekund som er til overs*/
		int sekundTO;

		/*Kor mange timer*/
		int timer = sekundTOT/3600;
		sekundTO = sekundTOT%3600; /*Timer til overs, gjort om til minutt*/

		/*Kor mange minutt*/
		int minutt = sekundTO/60;
		sekundTO = sekundTOT%60; /*Minutt til overs, gjort om til sekund*/

		/*Kor mange sekund*/
		int sekund = sekundTO;
		/*Sjekke om tid er negativ, og større enn 0*/
		if(sekundTOT > 0){
			showMessageDialog(null, "Timer: " + timer + ", minutt: " + minutt + ", sekund: " + sekund);
		} else {
			showMessageDialog(null, "Du må skrive inn positivt anntall sekund.");
		}
	}
}

/* Testdatasett
nr1:		tall:	        resultat:
1		0				Timer: 0, minutt: 0, sekund: 0
2		100				Timer: 0, minutt: 1, sekund: 40
3		2				Timer: 0, minutt: 0, sekund: 2
4		-2				Du må skrive inn positivt anntall sekund.*/
