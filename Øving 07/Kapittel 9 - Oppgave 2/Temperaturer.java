class Temperaturer{
	private int[][] temperaturer = new int[31][24];

	public Temperaturer(int[][] temperaturene){
		for(int i = 0; i < temperaturene.length; i++){
			for(int k = 0; k < temperaturene[0].length; k++){
				this.temperaturer[i][k] = temperaturene[i][k];
			}
		}
	}
	//OBS: Middeltemperaturmetodene er gjort FEIL!! Dette er gjennomsnittsmetoder.
	public double[] middelTempDag(){
		double[] tempen = new double[31];
		for(int i = 0; i < 31; i++){
			double tempDag = 0;
			for(int k = 0; k < 24; k++){
				tempDag += temperaturer[i][k];
			}
			tempen[i] = tempDag / 24;
		}
		return tempen;
	}

	public double[] middelTempTime(){
		double[] tempen = new double[24];
		for(int i = 0; i<24; i++){
			double tempTime = 0;
			for(int k = 0; k < 31; k++){
				tempTime += temperaturer[k][i];
			}
			//tempTime /= 31;
			tempen[i] += (tempTime / 31);
		}
		return tempen;
	}

	public double middelTempMnd(){
		double tempen = 0;
		for(int i = 0; i < 31; i++){
			for(int k = 0; k < 24; k++){
				tempen += temperaturer[i][k];
			}
		}
		return tempen / 744;
	}

	public void antDognMiddel(){
		int[] kategori = new int[5];
		int tempDag = 0;
		int gjennomsnitt = 0;

		for(int i = 0; i<31; i++){

			for(int k = 0; k < 24; k++){
				tempDag += temperaturer[i][k];
				gjennomsnitt = tempDag/24;
			}

			if(gjennomsnitt < -5){
				kategori[0]++;
			} else if (gjennomsnitt >= -5 && gjennomsnitt < 0){
				kategori[1]++;
			} else if (gjennomsnitt >= 0 && gjennomsnitt < 5){
				kategori[2]++;
			} else if (gjennomsnitt >= 5 && gjennomsnitt < 10){
				kategori[3]++;
			} else if (gjennomsnitt >= 10){
				kategori[4]++;
			}
			tempDag = 0;
			gjennomsnitt = 0;
		}
		/*
		System.out.println("Innenfor kategorien (<--, -5): " + kategori[0]);
		System.out.println("Innenfor kategorien (-5, 0): " + kategori[1]);
		System.out.println("Innenfor kategorien (0, 5): " + kategori[2]);
		System.out.println("Innenfor kategorien (5, 10): " + kategori[3]);
		System.out.println("Innenfor kategorien (10, -->): " + kategori[4]);
		*/
		String[] defMengde = {"(<--, -5)", "(-5, 0)", "(0, 5)", "(5, 10)", "(10, -->)"};
		for(int i = 0; i < kategori.length; i++){
			System.out.println("Innenfor kategorien " + defMengde[i] + ": " + kategori[i]);
		}
	}


}