import static javax.swing.JOptionPane.*;
class Oppgave2 {
	public static void main(String[] args){
		Valuta USD = new Valuta("Amerikanske Dollar", 6.7512, 1);
		Valuta EUR = new Valuta("Euro", 8.0555, 1);
		Valuta SEK = new Valuta("Svenske Kroner", 86.03/100, 100);
		Valuta DKK = new Valuta("Danske Kroner", 107.94/100, 100);

		boolean ferdig = false;

		while(!ferdig){

			int fraTil = 0;

			String fraEllerTil = showInputDialog("Vil du beregne fra eller til NOK (fra/til) (a = avslutt): ");
			char fraEllerT = fraEllerTil.charAt(0);
			boolean tilNorske = false;
			switch(fraEllerT){
				case 'f':
					String tilHva = showInputDialog("Hva vil du regne om til (USD=1, EUR=2, SEK=3, DKK=4)?");
					fraTil = Integer.parseInt(tilHva);
					break;
				case 't':
					String fraHva = showInputDialog("Hva vil du regne om fra (USD=1, EUR=2, SEK=3, DKK=4)?");
					fraTil = Integer.parseInt(fraHva);
					tilNorske = true;
					break;
				case 'a':
					return;
			}

			String anntall = showInputDialog("Hvor mye vil du regne om: ");
			double anntallLest = Double.parseDouble(anntall);

			if(tilNorske){
				switch(fraTil){
				case 1:
					showMessageDialog(null, USD.beregnTilNok(anntallLest));
					break;
				case 2:
					showMessageDialog(null, EUR.beregnTilNok(anntallLest));
					break;
				case 3:
					showMessageDialog(null, SEK.beregnTilNok(anntallLest));
					break;
				case 4:
					showMessageDialog(null, DKK.beregnTilNok(anntallLest));
					break;
				}

			} else {
				switch(fraTil){
					case 1:
						showMessageDialog(null, USD.beregnFraNok(anntallLest));
						break;
					case 2:
						showMessageDialog(null, EUR.beregnFraNok(anntallLest));
						break;
					case 3:
						showMessageDialog(null, SEK.beregnFraNok(anntallLest));
						break;
					case 4:
						showMessageDialog(null, DKK.beregnFraNok(anntallLest));
						break;
				}
			}

		}
	}
}