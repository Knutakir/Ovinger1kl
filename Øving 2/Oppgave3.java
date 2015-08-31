/*�ving 1*/
/*Oppgave 2.13.1 side 83/

/*Importerer JOptionPane for mindre skriving senere*/
import static javax.swing.JOptionPane.*;
class Oving3123{
	public static void main(String[] args){
		/*Brukeren av programmet skriver inn et �rstall*/
		String �rLest = showInputDialog("Skriv et �r: ");

		/*Tallet gj�res om fra String til int*/
		int �r = Integer.parseInt(�rLest);

		if(�r >= 0){
			/*Sjekke om �rstallet er delelig med 4*/
			if(�r%4 != 0){
				showMessageDialog(null, "�ret er ikkje et skudd�r.");
			} else if (�r%100 != 0){
				showMessageDialog(null, "�ret er et skudd�r.");
			} else if (�r%400 != 0){
				showMessageDialog(null, "�ret er ikkje et skudd�r.");
			}else{
				showMessageDialog(null, "�ret er et skudd�r.");
			}
		} else {
			showMessageDialog(null, "Du m� skrive inn et positivt �r.");
		}
	}
}

/* Testdatasett
nr1:		tall:	        resultat:
1			0				�ret er et skudd�r.
2			100				�ret er ikkje et skudd�r.
3			4				Timer: 0, minutt: 0, sekund: 2
4			400				�ret er et skudd�r.
5			800				�ret er et skudd�r.
6			-2				Du m� skrive inn et positivt �r.*/