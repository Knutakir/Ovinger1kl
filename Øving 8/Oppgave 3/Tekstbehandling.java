import java.util.StringTokenizer;
class Tekstbehandling{

	private final String teksten;

	public Tekstbehandling(String tekst){
		this.teksten = tekst;
	}

	public int ordITeksten(){
		String[] ord = teksten.split(" ");
		return ord.length;
	}

	public double gjsnittOrdLengde(){
		StringTokenizer st = new StringTokenizer(teksten, ".! ");
		double ordLengde = 0;
		double antOrd = st.countTokens();
		while(st.hasMoreTokens()){
			String setning = st.nextToken();
			ordLengde += setning.length();
		}
		return ordLengde / antOrd;

		/*return String.format("%.2f", ordLengde/ord.length);*/
	}

	public double gjsnittOrdIPeriode(){
		StringTokenizer st = new StringTokenizer(teksten, ".!:?");
		StringTokenizer st2 = new StringTokenizer(teksten, " ");
		return (double)st2.countTokens()/(double)st.countTokens();
	}

	public double[] gjsnittOrdLengdeIPeriode(){ //. ! : ?
		StringTokenizer st = new StringTokenizer(teksten, ".!:?");
		double[] ordLengder = new double[st.countTokens()];
		int teller = 0;
		while(st.hasMoreTokens()){
			String stOrd = st.nextToken();
			String[] ord = stOrd.split(" ");

			int ordLengde = 0;
			for(int i = 0; i < ord.length; i++){
				ordLengde += ord[i].length();
			}
			ordLengder[teller] = ordLengde / (double)ord.length;
			teller++;
		}
		return ordLengder;
	}

	public String skiftUtOrd(String nyttOrd, String bytteOrd){
		/*String[] ord = teksten.split(" ");
		String nyString = "";
		for(int i = 0; i < ord.length; i++){
			String ordet = ord[i];
			if(ordet.contains(".")){
				String ordUtenDot = ordet.replace(".", "");
				if(ordUtenDot.equals(bytteOrd)){
					nyString += nyttOrd + ". ";
				} else {
					nyString += ord[i] + " ";
				}
			} else {

				if(ord[i].equals(bytteOrd)){
					nyString += nyttOrd + " ";
				} else {
					nyString += ord[i] + " ";
				}
			}
		}*/
		return teksten.replaceAll(bytteOrd, nyttOrd);
	}

	public String hentTekst(){
		return teksten;
	}

	public String hentTekstSTOR(){
		return teksten.toUpperCase();
	}
}