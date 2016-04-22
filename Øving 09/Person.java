class Person{
	private final String fornavn;
	private final String etternavn;
	private final int fodselsaar;

	public Person(String fNavn, String eNavn, int fAar){
		this.fornavn = fNavn;
		this.etternavn = eNavn;
		this.fodselsaar = fAar;
	}

	public String getFornavn(){
		return fornavn;
	}

	public String getEtternavn(){
		return etternavn;
	}

	public int getFodselsaar(){
		return fodselsaar;
	}
}