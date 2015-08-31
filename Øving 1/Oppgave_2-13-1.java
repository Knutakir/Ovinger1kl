/*Øving 1*/
/*Oppgave 2.13.1 side 83/


/*importere bibloteket så man slipper å skrive så mye lengre nedi*/
import static javax.swing.JOptionPane.*;
class Oppgave_2-13-1{
	public static void main(String[] args){
		/*Brukeren av programmet skrive inn kor mange tommer som skal gjøres om*/
		String tommerLest = showInputDialog("Tommer: ");

		/*Lese kor mange tommer*/
		double tommer = Double.parseDouble(tommerLest);

		/*Sjekke om tommmer er større enn 0*/
		if(tommer > 0){
			/*gjøre dette om til cm*/
			double centimeter = tommer * 2.54;

			/*Vise kor mange tommer og cm i meldingsboks*/
			if(tommer == 1){
				showMessageDialog(null, tommer + " tomme = " + centimeter + " centimeter.");
			} else {
				showMessageDialog(null, tommer + " tommer = " + centimeter + " centimeter.");
			}
		} else {
			showMessageDialog(null, "Du må skrive ett tall større enn null.");
		}
	}
}

/* Testdatasett
nr1:		tall:	resultat:
1		0		Du må skrive ett tall større enn null.
2		100		100.0 tommer = 254.0 centimeter.
3		2		2.0 tommer = 5.08 centimeter.
4		-2		Du må skrive ett tall større enn null.*/
