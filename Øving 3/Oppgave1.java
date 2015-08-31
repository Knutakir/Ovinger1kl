/*Øving 3*/
/*Oppgave 4.14.1 side 143/

/*Importerer JOptionPane for mindre skriving senere*/
import static javax.swing.JOptionPane.*;
class Oppgave1{
	public static void main(String[] args){
		/*Brukeren av programmet skriver inn to tall som bestemmer hvor gangetabellen skal starte og slutte.*/
		String start = showInputDialog("Skriv inn start: ");
		String slutt = showInputDialog("Skriv inn slutt: ");

		/*String blir gjort om til integer*/
		int startLest = Integer.parseInt(start);
		int sluttLest = Integer.parseInt(slutt);

		/*loop til å lese fra start til slutt i gangetabellene*/
		for(int i = startLest; i<= sluttLest; i++){
			/*Skrive ut hva for en gange som programmet skal starte på*/
			System.out.println(i + "-gangen:");

			/*loop for å utføre utskrift av hver enkelt gangetabell*/
			for(int i2 = 1; i2<= 10; i2++){
				System.out.println(i + " x " + i2 + " = " + i * i2);
				if(i2==10){
					System.out.println(" "); /*Skriv ut ekstra mellomrom mellom gangetabellene. Bare for at det skal vere ryddigere.*/
				}
			}

		}
	}
}