/*
Øving 10
Oppgave 1 - Kapittel 12.10
Side 417
*/
import static javax.swing.JOptionPane.*;

class Oppgave1{
	public static void main(String[] args){
		Student[] studenter = {new Student("Bill Gates", 1337),  new Student("Hans Jakob Rivertz", 2*2),  new Student("Bob Shjieet", 3), new Student("Jesus Kristus", 7)};
		Oppgaveoversikt oppgov = new Oppgaveoversikt(studenter, 4);

		String[] muligheter = {"Hent ut data", "Rediger data", "Registrer en ny student", "Avslutte"};
		String studNavn = "";

		while(true){
			int valg = showOptionDialog(null, "Hva vil du gjøre?", "Velkommen!", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);

			switch(valg){
				case 0://hente ut informasjon
					String utskrift = "";

					String[] henteValg = new String[oppgov.studenterRegistrert()];
					for(int i = 0; i < oppgov.studenterRegistrert(); i++){
						henteValg[i] = oppgov.studentNavnVedId(i);
					}
					studNavn = (String)showInputDialog(null, "Hvem vil du hente data fra", "Hent data", QUESTION_MESSAGE, null, henteValg, henteValg[0]);

					utskrift = "Studenter registrert: " + oppgov.studenterRegistrert();
					utskrift += "\n" + studNavn + " har " + oppgov.antOppgStudent(oppgov.studentVedNavn(studNavn)) + " øvinger godkjent.";
					utskrift += "";

					showMessageDialog(null, utskrift, "Informasjonutprinting", QUESTION_MESSAGE);
					break;

				case 1://endre informasjon
					String[] endreValg = new String[oppgov.studenterRegistrert()];
					for(int i = 0; i < oppgov.studenterRegistrert(); i++){
						endreValg[i] = oppgov.studentNavnVedId(i);
					}
					studNavn = (String)showInputDialog(null, "Hvem vil du hente data fra", "Hent data", QUESTION_MESSAGE, null, endreValg, endreValg[0]);

					int godEllerF = showOptionDialog(null, "Vil du fjerne eller legge til godkjente?", "Endre godkjente", 0, QUESTION_MESSAGE, null, new String[]{"Fjerne", "Legge til"}, "Fjerne");
					if(godEllerF == 0){
						String lesAntallOppg = showInputDialog("Hvor mange vil du fjerne?");
						int nyeGodkjenteOppgaver = Integer.parseInt(lesAntallOppg);
						oppgov.godkjennOppg(studNavn, -nyeGodkjenteOppgaver);
					} else {
						String lesAntallOppg = showInputDialog("Hvor mange vil du godkjenne?");
						int nyeGodkjenteOppgaver = Integer.parseInt(lesAntallOppg);
						oppgov.godkjennOppg(studNavn, nyeGodkjenteOppgaver);
					}

					break;

				case 2:
					String lesStudNavn = showInputDialog("Hva skal studenten hete?");
					String lesStudOppg = showInputDialog("Hvor mange øvinger skal studenten ha godkjent?");
					int studOppgG = Integer.parseInt(lesStudOppg);
					oppgov.regNyStudent(new Student(lesStudNavn, studOppgG));
					break;

				default:
					return;
			}

		}

	}
}