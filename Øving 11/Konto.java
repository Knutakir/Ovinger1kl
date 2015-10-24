import java.io.*;

class Konto{

	private int saldo;
	private String saldoPlassering = "saldo.txt";
	private String transPlassering = "transaksjoner.txt";

	public Konto(int startSaldo) throws Exception{
		FileReader saldoFR = new FileReader(saldoPlassering);
		BufferedReader saldoLeser = new BufferedReader(saldoFR);
		String saldoLest = saldoLeser.readLine();

		if(saldoLest == null){
			this.saldo = startSaldo;
			FileWriter saldoFW = new FileWriter(saldoPlassering, false);
			PrintWriter skriver = new PrintWriter(new BufferedWriter(saldoFW));
			skriver.print(startSaldo);
			skriver.close();
		} else {
			saldo = Integer.parseInt(saldoLest);
		}
	}

	public int getOgOppdSaldo() throws Exception{
		FileReader fR = new FileReader(saldoPlassering);
		BufferedReader leser = new BufferedReader(fR);
		String saldoLest = leser.readLine();
		saldo = Integer.parseInt(saldoLest);
		return saldo;
	}

	public void setSaldo(boolean taUt, int antPenger) throws Exception{
		FileWriter fW = new FileWriter(saldoPlassering, false);
		PrintWriter skriver = new PrintWriter(new BufferedWriter(fW));
		if(taUt){
			saldo -= antPenger;
			skriver.print(saldo);

			endreTransaksjon(true, antPenger);
		} else {
			saldo += antPenger;
			skriver.print(saldo);

			endreTransaksjon(false, antPenger);
		}
		skriver.close();
	}

	private void endreTransaksjon(boolean taUt, int antPenger) throws Exception{
		FileWriter fW = new FileWriter(transPlassering, true);
		PrintWriter skriver = new PrintWriter(new BufferedWriter(fW));
		if(taUt){
			skriver.println("U - " + antPenger);
		} else {
			skriver.println("I - " + antPenger);
		}
		skriver.close();
	}
}