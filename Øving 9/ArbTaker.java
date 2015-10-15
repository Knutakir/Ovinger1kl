import java.util.GregorianCalendar;

class ArbTaker{
	public final Person personalia;
	private final int arbtakernr;
	private final int ansettelsesaar;
	private int maanedslonn;
	private double skatteprosent;
	private GregorianCalendar kalender = new GregorianCalendar();

	public ArbTaker(Person personen, int arbNr, int aAar, int mndLonn, double skProsent){
		this.personalia = personen;
		this.arbtakernr = arbNr;
		this.ansettelsesaar = aAar;
		this.maanedslonn = mndLonn;
		this.skatteprosent = skProsent;
	}

	public ArbTaker(Person personen, int arbNr, int mndLonn, int skProsent){
		this.personalia = personen;
		this.arbtakernr = arbNr;
		this.ansettelsesaar = kalender.get(java.util.Calendar.YEAR); //Sette til året som er no
		this.maanedslonn = mndLonn;
		this.skatteprosent = skProsent;
	}

	public Person getPersonalia(){
		return personalia;
	}

	public int getArbtakernr(){
		return arbtakernr;
	}

	public int getAnsettelsesaar(){
		return ansettelsesaar;
	}

	public int getMaanedslonn(){
		return maanedslonn;
	}

	public double getSkatteprosent(){
		return skatteprosent;
	}

	public void setMaanedslonn(int nyMndslonn){
		this.maanedslonn = nyMndslonn;
	}

	public void setSkatteprosent(double nySktprosent){
		this.skatteprosent = nySktprosent;
	}

	public double skattPerMnd(){
		double skattPrMnd = maanedslonn * (skatteprosent/100);
		return skattPrMnd;
	}

	public int bruttoLonnPrAar(){
		int bruttoLonn = maanedslonn * 12;
		return bruttoLonn;
	}

	public double skatteTrekkPrAar(){
		double skatteTrekk = maanedslonn * 10.5 * (skatteprosent/100);
		return skatteTrekk;
	}

	public String etterNforN(){
		return personalia.getEtternavn() + ", " + personalia.getFornavn();
	}

	public int hentAlder(){
		return kalender.get(java.util.Calendar.YEAR) - personalia.getFodselsaar();
	}

	public boolean ansattLengreEnn(int aar){
		if((kalender.get(java.util.Calendar.YEAR) - ansettelsesaar) > aar){
			return true;
		} else {
			return false;
		}
	}

	public String hentFulltNavn(){
		return personalia.getFornavn() + " " + personalia.getEtternavn();
	}
}