/*Øving 2*/
/*Oppgave 3.12.4 side 113*/

/*importere bibloteket så man slipper å skrive så mye lengre nedi*/
import static javax.swing.JOptionPane.*;
class Oppgave4{
	public static void main(String[] args){
		/*Pris til kjøttdeig A*/
		double prisA = 35.90;
		int gramA = 450;
		/*Pris til kjøttdeig B*/
		double prisB = 39.50;
		int gramB = 500;

		/*Pris til A og B per gram(g)*/
		double gPrisA = prisA/gramA;
		double gPrisB = prisB/gramB;

		/*Se hva for en av kjøttdeigene som er billigst og vise dette i en meldingsboks.*/
		if(gPrisA > gPrisB){
			showMessageDialog(null, "Kjøttdeig av merke B er billigst");
		} else {
			showMessageDialog(null, "Kjøttdeig av merke A er billigst");
		}
	}
}