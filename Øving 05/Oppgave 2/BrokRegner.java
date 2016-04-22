class BrokRegner{

	private int teller;
	private int nevner;

	public BrokRegner(int teller, int nevner){
		if(nevner == 0){
			throw new IllegalArgumentException("Nevner kan ikkje være lik 0.");
			} else {
				this.teller = teller;
				this.nevner = nevner;
				}
	}

	public BrokRegner(int teller){
		this.teller = teller;
		nevner = 1;
	}

	public int getTeller(){
		return teller;
	}

	public int getNevner(){
		return nevner;
	}

	public void addisjon(int nyTeller, int nyNevner){
		teller *= (nyNevner/nevner);
		teller += nyTeller;
		nevner = nyNevner;
	}

	public void divisjon(int nyTeller, int nyNevner){
		teller *= nyNevner;
		nevner *= nyTeller;
	}

	public void multiplikasjon(int nyTeller, int nyNevner){
		teller *= nyTeller;
		nevner *= nyNevner;
	}

	public void subraksjon(int nyTeller, int nyNevner){
		teller *=(nyNevner/nevner);
		teller -= nyTeller;
		nevner = nyNevner;
	}

	public void forkortBrok(){
		int deleligTall = 0;
		if(teller>nevner){
			for(int i = 2; i<=teller; i++){
				if(teller%i == 0 && nevner%i == 0){
					deleligTall = i;
				}
			}
		} else {
			for(int i = 2; i<=teller; i++){
				if(teller%i == 0 && nevner%i == 0){
					deleligTall = i;
				}
			}
		}
		if(deleligTall != 0){
			teller /= deleligTall;
			nevner /= deleligTall;
		}
	}
}