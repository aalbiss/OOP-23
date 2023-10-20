package garage;

import java.util.Scanner;

public class Motocicletta extends VeicoloAMotore {

	private int cilindrata;
	
	public Motocicletta() {
		cilindrata=0;
	}

	public Motocicletta(String targa, String marca, String modello, int cilindrata) {
		super(targa, marca, modello);
		this.cilindrata=cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void inserimento() {
		super.inserimento();
		Scanner KB = new Scanner(System.in);
		int cilindrata;
		do {
			System.out.print("Inserisci cilindrata ");
			cilindrata=KB.nextInt();
			setCilindrata(cilindrata);
		}while(cilindrata<=50);
	}

	public void visualizza() {
		System.out.println("---Motocicletta---");
		super.visualizza();
		System.out.println("---Cilindrata : " + cilindrata);
	}
	
}
