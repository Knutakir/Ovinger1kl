import static javax.swing.JOptionPane.*;
class Oppgave1{

	public static void main(String[] args){
		java.util.Random random = new java.util.Random();

		while(true){
			int[] antall = new int[10];

			String antGanger = showInputDialog("Hvor mange ganger: ");
			int antGangerLest = Integer.parseInt(antGanger);

			for(int i = 0; i < antGangerLest; i++){ //trekke ulike tall
				int tallet = random.nextInt(10);
				antall[tallet] += 1;
			}

			for(int i = 0; i < 10; i++){

				int antStjerner = Math.round((float)antall[i]/10f);
				String stjernene = "";

				for(int ant = 0; ant < antStjerner; ant++){
					stjernene += "*";
				}
				System.out.println("Antall " + i + ": " + antall[i] + " " + stjernene);
			}
		}
	}
}