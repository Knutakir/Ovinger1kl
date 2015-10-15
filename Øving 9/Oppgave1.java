/*
Oppgave 1
Side 386 i læreboken
*/

import static javax.swing.JOptionPane.*;
import java.util.GregorianCalendar;

class Oppgave1{
	public static void main(String[] args){
		Person p1;
		ArbTaker arbTaker1;
		int lesPremade = showConfirmDialog(null, "Vil du velge en premade person?", "Egen person?", YES_NO_OPTION);
		if(lesPremade == 0){
			p1= new Person("Ola", "Nordmann", 1973);
		 	arbTaker1= new ArbTaker(p1, 1, 1994, 72400, 40);
		} else {
			String navnLest = showInputDialog("Skriv inn navnet");
			String fodselsAarLest = showInputDialog("Skriv inn fødselsår");
			String arbNrLest = showInputDialog("Skriv inn ansettelsesnr.");
			String startAarLest = showInputDialog("Hvortid begynnte personen å jobbe der?");
			String mndSkattLest = showInputDialog("Skiv inn mnd.lønn.").replace(",", ".");
			String skattPrLest = showInputDialog("Skriv inn skatteprosent").replace(",", ".");

			p1= new Person(navnLest.split(" ")[0], navnLest.split(" ")[1], Integer.parseInt(fodselsAarLest));
		 	arbTaker1= new ArbTaker(p1, Integer.parseInt(arbNrLest), Integer.parseInt(startAarLest), Integer.parseInt(mndSkattLest), Double.parseDouble(skattPrLest));
		}

		String[] muligheter = {"Hente verdier", "Endre eksisterende verdier", "Annet", "Avslutte?"};

		while(true){
			int valg = showOptionDialog(null, "Hva vil du gjøre?", "God dag!", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);
			String printUtTekst = "";
			switch(valg){
				case 0:
					printUtTekst = "Arbeidstakernummer: " + arbTaker1.getArbtakernr();
					printUtTekst += "\nAnsettelsesår: " + arbTaker1.getAnsettelsesaar();
					printUtTekst += "\nEtternavn, Fornavn: " + arbTaker1.etterNforN();
					printUtTekst += "\nAlder: " + arbTaker1.hentAlder();
					printUtTekst += "\nFornavn: " + arbTaker1.personalia.getFornavn();
					printUtTekst += "\nEtternavn: " + arbTaker1.personalia.getEtternavn();
					printUtTekst += "\nFødselsår: " + arbTaker1.personalia.getFodselsaar() + "\n";
					printUtTekst += "\nMånedslønn: " + arbTaker1.getMaanedslonn() + " NOK";
					printUtTekst += "\nSkatteprosent: " + Double.toString(arbTaker1.getSkatteprosent()).replace(".", ",") + "%";
					printUtTekst += "\nSkatt pr. måned: " + arbTaker1.skattPerMnd() + " NOK";
					printUtTekst += "\nBruttolønn pr. år: " + arbTaker1.bruttoLonnPrAar() + " NOK";
					printUtTekst += "\nSkattetrekk pr. år: " + Double.toString(arbTaker1.skatteTrekkPrAar()).replace(".", ",") + " NOK";

					showMessageDialog(null, printUtTekst);
					break;
				case 1:
					String[] muligheter2 = {"Månedslønn", "Skatteprosent"};
					int valgSet = showOptionDialog(null, "Hva vil du endre på?", "Endring", 0, PLAIN_MESSAGE, null, muligheter2, muligheter[0]);
					switch(valgSet){
						case 0:
							String nyMndLonn = showInputDialog("Hva vil du endre til?");
							arbTaker1.setMaanedslonn(Integer.parseInt(nyMndLonn));
							break;
						case 1:
							String nySkatteProsent = showInputDialog("Hva vil du endre til?");
							arbTaker1.setSkatteprosent(Double.parseDouble(nySkatteProsent.replace(",",".")));
							break;
					}
					break;
				case 2:
					String lesAar = showInputDialog("Sjekk om personen har vært ansatt lengre enn..");
					if(arbTaker1.ansattLengreEnn(Integer.parseInt(lesAar))){
						showMessageDialog(null, arbTaker1.hentFulltNavn() + " har vært ansatt lengre enn " + lesAar + " år.");
					} else {
						showMessageDialog(null, arbTaker1.hentFulltNavn() + " har ikke vært ansatt lengre enn " + lesAar + " år.");
					}
					break;
				default:
					return;
			}
		}
	}
}