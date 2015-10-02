import static javax.swing.JOptionPane.*;
import java.util.Random;
class Oppgave1{
	public static void main(String[] args){

		Random rnd = new Random();
		boolean erRaveMode = false;

		String raveMode = showInputDialog("Ravemode (ja, nei)?");

		if(raveMode.charAt(0) == 'j'){
			erRaveMode = true;
		} else if(raveMode.charAt(0) == 'n'){
			erRaveMode = false;
		} else {
			return;
		}

		Vindu vinduet = new Vindu("Awesome face - Smiley");
		vinduet.setVisible(true);


		while(erRaveMode){
			vinduet.repaint();
			try{
				Thread.sleep(rnd.nextInt(50));
			} catch(Exception ex){

			}
		}
	}
}