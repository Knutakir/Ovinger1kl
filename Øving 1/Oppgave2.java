/*Øving 1*/
/*Oppgave 2.13.2 side 83/

/*importere bibloteket så en slipper å skrive så mye lengre nedi*/
import static javax.swing.JOptionPane.*;
class Oppgave2{
	public static void main(String[] args){
		/*Brukeren av programmet skrive inn anntall timer, minutt og sekund*/
		String timerLest = showInputDialog("Timer: ");
		String minuttLest = showInputDialog("Minutt: ");
		String sekundLest = showInputDialog("Sekund: ");

		/*Lese timer, minutt og sekund. Gjør det om fra tekst til integer*/
		int timerIS = Integer.parseInt(timerLest) * 3600;
		int minuttIS = Integer.parseInt(minuttLest) * 60;
		int sekund = Integer.parseInt(sekundLest);

		/*Regne ut kor mange sekund dette blir*/
		int totaltSekund = timerIS + minuttIS + sekund;

		/*Sjekke om tiden er negativ. Og så vise en meldingsboks.*/
		if(totaltSekund > 0){
			showMessageDialog(null, "Totalt anntall sekund: " + totaltSekund);
		} else {
			showMessageDialog(null, "Du kan ikkje skrive inn ett negativt tall.");
		}

	}
}
/* Testdatasett
nr1:		tall:	        resultat:
1			0,0,0			Totalt anntall sekund: 0x
2			100,100,100		Totalt anntall sekund: 366100
3			2,2,2			Totalt anntall sekund: 7322
4			-2,-2,-2		Du kan ikkje skrive inn ett negativt tall.*/