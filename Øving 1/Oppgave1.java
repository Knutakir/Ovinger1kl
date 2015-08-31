/*Øving 1*/
/*Oppgave 2.13.1 side 83/

<<<<<<< HEAD:Øving 1/Oppgave1.java
/*importere bibloteket s� man slipper � skrive s� mye lengre nedi*/
=======

/*importere bibloteket så man slipper å skrive så mye lengre nedi*/
>>>>>>> origin/Øvinger:Øving 1/Oppgave_2-13-1.java
import static javax.swing.JOptionPane.*;
class Oppgave1{
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
<<<<<<< HEAD:Øving 1/Oppgave1.java
1			0		Du m� skrive ett tall st�rre enn null.
2			100		100.0 tommer = 254.0 centimeter.
3			2		2.0 tommer = 5.08 centimeter.
4			-2		Du m� skrive ett tall st�rre enn null.*/
=======
1		0		Du må skrive ett tall større enn null.
2		100		100.0 tommer = 254.0 centimeter.
3		2		2.0 tommer = 5.08 centimeter.
4		-2		Du må skrive ett tall større enn null.*/
>>>>>>> origin/Øvinger:Øving 1/Oppgave_2-13-1.java
