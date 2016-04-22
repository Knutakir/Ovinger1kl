class Spiller{
	private int sumPoeng;
	java.util.Random terning = new java.util.Random();
	//private String navn;

	//public Spiller(){
	//}

	public int getSumPoeng(){
		return sumPoeng;
	}

	public void kastTerningen(){
		int terningkast = terning.nextInt(6) + 1; //Kaster terningen. Og får et tall mellom 1 og 6. Man må legge til 1 fordi dette gir tall i intervallet: [0, 5]
		if(terningkast == 1){ //Sjekker om terningen som blir "kastet" blir 1.
			sumPoeng = 0; //Setter poengen tilbake til 0 dersom den er det.
		} else {
			sumPoeng += terningkast;
		}

		if(sumPoeng > 100){ //Endring som stod på slutten av oppgaven ("En raffinering av oppgaven").
			sumPoeng -= terningkast;
		}
	}

	//public void erFerdig(){ //WASTE
	//}
}
