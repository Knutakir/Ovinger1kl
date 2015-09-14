class Oppgave2{
	public static void main(String[] args){
		BrokRegner brok1 = new BrokRegner(9, 3);

		brok1.subraksjon(1, 4);
		System.out.println(brok1.getTeller() + "/" + brok1.getNevner());
		brok1.divisjon(4, 2);
		System.out.println(brok1.getTeller() + "/" + brok1.getNevner());
		brok1.multiplikasjon(7, 2);
		System.out.println(brok1.getTeller() + "/" + brok1.getNevner());
		brok1.addisjon(4, 8);
		System.out.println(brok1.getTeller() + "/" + brok1.getNevner());

		brok1.forkortBrok();
		System.out.println(brok1.getTeller() + "/" + brok1.getNevner());
	}
}