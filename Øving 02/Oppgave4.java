/*�ving 2*/
/*Oppgave 3.12.4 side 113*/

/*importere bibloteket s� man slipper � skrive s� mye lengre nedi*/
import static javax.swing.JOptionPane.*;
class Oppgave4{
	public static void main(String[] args){
		/*Pris til kj�ttdeig A*/
		double prisA = 35.90;
		int gramA = 450;
		/*Pris til kj�ttdeig B*/
		double prisB = 39.50;
		int gramB = 500;

		/*Pris til A og B per gram(g)*/
		double gPrisA = prisA/gramA;
		double gPrisB = prisB/gramB;

		/*Se hva for en av kj�ttdeigene som er billigst og vise dette i en meldingsboks.*/
		if(gPrisA > gPrisB){
			showMessageDialog(null, "Kj�ttdeig av merke B er billigst");
		} else {
			showMessageDialog(null, "Kj�ttdeig av merke A er billigst");
		}
	}
}