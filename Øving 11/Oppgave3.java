/*Oppgave 3 - Kapittel 16.3.
Side 549
Øving 11
*/

import static javax.swing.JOptionPane.*;

class Oppgave3{
	public static void main(String[] args) throws Exception{

		Konto kontoen = new Konto(1337);

		String[] muligheter = {"Ta ut penger", "Sette inn penger", "Avslutte"};

		while(true){
			int utEllerInn = showOptionDialog(null, "Hva vil du gjøre?", "Velkommen til Kirkhorn bank!", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);

			switch(utEllerInn){
				case 0://Tar UT penger
					String utAntPengerLest = showInputDialog("Hvor mye vil du ta ut?");
					int utAntPenger = Integer.parseInt(utAntPengerLest);

					kontoen.setSaldo(true, utAntPenger);
					break;

				case 1://Setter inn penger
					String innAntPengerLest = showInputDialog("Hvor mye vil du ta inn?");
					int innAntPenger = Integer.parseInt(innAntPengerLest);

					kontoen.setSaldo(false, innAntPenger);
					break;
				default:
					return;
			}
		}
	}
}