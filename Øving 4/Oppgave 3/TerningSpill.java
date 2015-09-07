class TerningSpill{
	public static void main(String[] args){
		Spiller spiller1 = new Spiller();
		Spiller spiller2 = new Spiller();
		int kastNr = 0;

		while(spiller1.getSumPoeng() < 100 && spiller2.getSumPoeng() < 100){
			spiller1.kastTerningen();
			spiller2.kastTerningen();
			kastNr += 1;
			System.out.println("Kast nummer: " + kastNr);
			System.out.println("Spiller 1 har: " + spiller1.getSumPoeng() + " poeng. Og spiller 2 har: " + spiller2.getSumPoeng());
		}

	}
}