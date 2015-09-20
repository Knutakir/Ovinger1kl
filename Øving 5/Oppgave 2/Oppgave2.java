import static javax.swing.JOptionPane.*;

class Oppgave2{
	public static void main(String[] args){

		String teller = showInputDialog("Skriv inn teller: ");
		int tellerLest = Integer.parseInt(teller);
		String nevner = showInputDialog("Skriv inn nevner: ");
		int nevnerLest = Integer.parseInt(nevner);

		BrokRegner brok1 = new BrokRegner(tellerLest, nevnerLest);

		while(true){
			String operasjon = showInputDialog("Hvilken operasjon vi du utføre? (SUB=1, DIV=2, MUL=3, ADD=4)");
			int opLest = Integer.parseInt(operasjon);

			String nyTeller = showInputDialog("Skriv inn en ny teller: ");
			int nyTellerLest = Integer.parseInt(nyTeller);
			String nyNevner = showInputDialog("Skriv inn en ny nevner: ");
			int nyNevnerLest = Integer.parseInt(nyNevner);

			switch(opLest){
				case 1:
					brok1.subraksjon(nyTellerLest, nyNevnerLest);
					break;
				case 2:
					brok1.divisjon(nyTellerLest, nyNevnerLest);
					break;
				case 3:
					brok1.multiplikasjon(nyTellerLest, nyNevnerLest);
					break;
				case 4:
					brok1.addisjon(nyTellerLest, nyNevnerLest);
					break;
				}
				brok1.forkortBrok();
				showMessageDialog(null, "Den nye brøken er: " + brok1.getTeller() + "/" + brok1.getNevner());
		}
	}
}