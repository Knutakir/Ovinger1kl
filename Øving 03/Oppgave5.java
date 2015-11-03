/*Øving 3*/
/*Oppgave 4.14.5 side 143/

/*Importerer JOptionPane for mindre skriving senere*/
import static javax.swing.JOptionPane.*;
class Oppgave5{
	public static void main(String[] args){
		while(true){/*while(true) sånn at man kan sjekke flere tall*/

			/*Brukeren skriver inn ett tall*/
			String tall = showInputDialog("Skriv inn ett tall: ");
			if(tall != null){ /*Sjekker om verdien brukeren skriver inn er ugyldig.*/

				int tallLest = Integer.parseInt(tall); /*Gjør om String til interger*/

				/*Deklarerer noen variabler.*/
				Boolean erPrimtall = true;
				int deleligTall = 0;

				/*Sjekker om tallet som brukeren skrev inn er større enn 1. (1 er ikkje et primtall).*/
				if(tallLest >1){
					/*Gjør en for loop for å sjekke om tallet er et primtall.*/
					for(int i = 2; i <= tallLest/2; i++){
						if(tallLest%i == 0){
							/*Tallet er ikkje et primtall*/
							erPrimtall = false;
							deleligTall = i;
							break;
						} else {
							erPrimtall = true;
							/*Tallet er et primtall.*/
						}
					}
					if(erPrimtall){
						showMessageDialog(null, "Tallet " + tallLest + " er et primtall.");
					} else {
						showMessageDialog(null, "Tallet " + tallLest + " er delelig med " + deleligTall + ", og er derfor ikkje et primtall.");
					}
				} else {
					showMessageDialog(null, "Tallet 1 er ikkje et primtall. Primtall er større enn 1.");
				}
			}
	}
	}
}