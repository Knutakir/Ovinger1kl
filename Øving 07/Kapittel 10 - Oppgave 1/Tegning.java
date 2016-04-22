import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

class Tegning extends JPanel{

	public void paintComponent(Graphics g2){
		super.paintComponent(g2);
		Graphics2D g = (Graphics2D)g2;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Color testFarge = new Color(36, 166, 33);

		setBackground(Color.WHITE);

		//Ytterste svarte og runde linjen
		g.setColor(Color.BLACK);
		g.fillOval(0, 0, 400, 400);

		//Definere noen farger
		Random rnd = new Random();

		Color gulFargen = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));//(254, 222, 87);
		Color lillaFargen = new Color(134, 25, 67);
		Color lLillaFargen = new Color(249, 190, 222);

		//Den oransje fargen inni
		g.setColor(gulFargen);
		g.fillOval(20, 20, 360, 360);

		//MUNNEN
		g.setColor(Color.BLACK);
		g.fillOval(50, 80, 275, 275);
		//fyll lilla inni munnen
		g.setColor(lillaFargen);
		g.fillOval(60, 90, 255, 255);

		//fyll over
		g.setColor(gulFargen);
		g.fillRect(80, 80, 250, 140);
		g.setColor(Color.BLACK);
		g.fillRect(60, 220, 260, 10);
		g.fillRect(40, 220, 260, 10);

		//lilla tunge
		g.setColor(lLillaFargen);
		g.fillArc(140, 278, 130, 130, 23, 150);

		g.fillArc(141, 326, 80, 15, 170, 180);
		g.fillArc(146, 328, 80, 15, 170, 180);
		g.fillArc(155, 328, 60, 15, 170, 180);
		g.fillOval(145, 324, 80, 20);

		//g.setColor(Color.WHITE); //FIKS DETTE LITT NÆRMERE
		g.fillArc(195, 295, 60, 40, 250, 90);
		g.fillArc(210, 288, 60, 40, 240, 90);
		g.fillArc(207, 290, 60, 40, 240, 90);
		g.fillArc(190, 297, 60, 40, 250, 90);
		g.fillArc(188, 298, 60, 40, 250, 90);


		//venstre øyne
		g.setColor(Color.BLACK);
		//g.fillArc(70, 110, 100, 100, 0, 180);
		g.fillOval(40, 80, 120, 140);


		g.setColor(Color.WHITE);
		g.fillOval(52, 92, 96, 116);
		g.setColor(Color.BLACK);


		g.setColor(gulFargen);
		g.fillRect(40, 180, 120, 40);

		g.setColor(Color.BLACK);
		g.fillRect(50, 170, 100, 10);

		//SMOOTHESTE ØYE EVERY g.fillOval(90, 90, 20, 20);

		g.fillOval(105, 95, 40, 40);


		//høyre øyne
		g.fillOval(200, 80, 120, 140);
		//g.fillArc(220, 110, 100, 100, 0, 180);
		g.setColor(Color.WHITE);

		g.fillOval(212, 92, 96, 116);

		g.setColor(gulFargen);
		g.fillRect(200, 180, 120, 40);

		g.setColor(Color.BLACK);
		g.fillRect(210, 170, 100, 10);

		g.fillOval(265, 95, 40, 40);
	}

}