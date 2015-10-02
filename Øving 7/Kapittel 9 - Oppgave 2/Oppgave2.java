import static javax.swing.JOptionPane.*;
import java.util.Random;
class Oppgave2{

	public static void main(String[] args){
		//lage en 2-d int-tabell med random temperaturer
		Random rnd = new Random();
		int[][] temperaturTabell = new int[31][24];
		for(int i = 0; i < 31; i++){
			for(int k = 0; k < 24; k++){
				temperaturTabell[i][k] = rnd.nextInt(50) - 25; //temperaturer fra -25 grader til +25 grader
			}
		}



		Temperaturer temp1 = new Temperaturer(temperaturTabell);

		while(true){
			String hvilkenOppg = showInputDialog("Hva for en oppgave(a, b, c, d)?");

			switch(hvilkenOppg.charAt(0)){
				case('a'):
					System.out.println("MIDDELTEMPERATUR FOR HVER DAG");
					double[] middelTDag = temp1.middelTempDag();

					for(int i = 0; i < middelTDag.length; i++){
						System.out.println("Temperatur dag " + (int)(i+1) + " er " + middelTDag[i]);
					}
					break;
				case('b'):
					System.out.println("------------------------------------------------------");
					System.out.println("MIDDELTEMPERATUR FOR HVER TIME:");

					double[] middelTTime = temp1.middelTempTime();
					for(int i = 0; i < middelTTime.length; i++){
						System.out.println("Temperatur time " + i + " er " + middelTTime[i]);
					}
					break;
				case('c'):
					System.out.println("------------------------------------------------------");
					System.out.println("MIDDELTEMPERATUR FOR HELE MÅNEDEN:");
					System.out.println(temp1.middelTempMnd());
					break;
				case('d'):
					System.out.println("------------------------------------------------------");
					System.out.println("MIDDELTEMPERATUR FOR GITTE OMRÅDER:");
					temp1.antDognMiddel();
					break;
				default:
					return;
				}
		}

	}
}