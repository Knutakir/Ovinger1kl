import java.util.Random;
class MainRandom{
	Random rnd = new Random();

	public int nesteHeltall(int nedre, int ovre){
		int nySlutt = ovre - nedre;
		return rnd.nextInt(nySlutt) + 1 + nedre;
	}

	public double nesteDesimaltall(double nedre, double ovre){
		double nySlutt = ovre - nedre;
		return nedre + nySlutt * rnd.nextDouble();
	}
}