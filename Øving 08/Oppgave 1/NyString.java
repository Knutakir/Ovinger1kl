class NyString{
	String teksten;

	public NyString(String tekst){
		this.teksten = tekst;
	}

	public String forkorting(){
		String[] ord = teksten.split(" ");
		String forkortetOrd = "";
		for(int i = 0; i < ord.length; i++){
			forkortetOrd += ord[i].charAt(0);
		}
		return forkortetOrd;
	}

	public String fjerningAvTegn(String bokstav){
		return teksten.replace(bokstav, "");
	}
}