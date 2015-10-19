/*
Oppgave 1
Side 417
*/
import static javax.swing.JOptionPane.*;

class Oppgave1{
	public static void main(String[] args){
		Student[] studenter = {new Student("Bill Gates", 1337),  new Student("Hans Jakob Rivertz", 2*2),  new Student("Bob Shjieet", 3), new Student("Jesus Kristus", 7)};

		Oppgaveoversikt oppgov = new Oppgaveoversikt(studenter, 4);

		String[] muligheter = {"Hent ut data", "Rediger data"};

		while(true){
			int valg = showOptionDialog(null, "Hva vil du gjøre?", "Velkommen!", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);

			switch(valg){
				case 0://hente ut informasjon
					String utskrift = "";
					//Student sivertPer = new Student("Sivert Per", 1);
					oppgov.regNyStudent(new Student("Odd Simen", 0));

					utskrift = "Studenter registrert: " + oppgov.studenterRegistrert();
					utskrift += "\n" + billG.getNavn() + " har " + oppgov.antOppgStudent(billG) + " øvinger godkjent.";
					utskrift += "";

					showMessageDialog(null, utskrift);
					break;

				case 1://endre informasjon
					String lesNavn = showInputDialog("Hvem vil du endre data til?");
					String lesAntallOppg = showInputDialog("Hvor mange vil du godkjenne?");
					int nyeGodkjenteOppgaver = Integer.parseInt(lesAntallOppg);
					String[] setMuligheter = {"Endre oppgave godkjent"};
					oppgov.godkjennOppg(lesNavn, nyeGodkjenteOppgaver);

					break;
			}




		}

	}
}