import static javax.swing.JOptionPane.*;

class Oppgave1{
	public static void main(String[] args){
		Student billG = new Student("Bill Gates", 1337);
		Student rivertz = new Student("Hans Jakob Rivertz", 2*2);
		Student bob = new Student("Bob Shjieet", 3);
		Student jesus = new Student("Jesus Kristus", 7);

		Student[] studenter = new Student[4];

		Oppgaveoversikt oppgov = new Oppgaveoversikt(studenter, 4);

		String[] muligheter = {"Hent ut data", "Rediger data"};

		while(true){
			int valg = showOptionDialog(null, "Hva vil du gjøre?", "Asdasd", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);

			switch(valg){
				case 0:
					String utskrift = "";
					Student oddSimen = new Student("Odd Simen", 0);
					Student sivertPer = new Student("Sivert Per", 1);
					oppgov.regNyStudent(oddSimen);

					utskrift = "Studenter registrert: " + oppgov.studenterRegistrert();
					utskrift += "\n" + billG.getNavn() + " har " + oppgov.antOppgStudent(billG) + " øvinger godkjent.";
					utskrift += "";

					showMessageDialog(null, utskrift);//antOppgStudent(billG));
					break;
				case 1:
					String lesNavn = showInputDialog("Hvem vil du endre data til?");
					String lesAntallO = showInputDialog("Hvor mange vil du godkjenne?");
					int nyeGodkjenteOppgaver = Integer.parseInt(lesAntallO);
					//String[] setMuligheter = {"Endre oppgave godkjent"};
					oppgov.godkjennOppg(lesNavn, nyeGodkjenteOppgaver);
					break;
			}




		}

	}
}