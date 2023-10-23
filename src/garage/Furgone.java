package garage;

import java.util.Scanner;

public class Furgone extends VeicoloAMotore{

	private int carico;

	public Furgone() {
		super();
		carico = 0;
	}

	public Furgone(String targa, String marca, String modello, int carico) {
		super(targa, marca, modello);
		this.carico=carico;
	}

	public int getCarico() {
		return carico;
	}

	public void setCarico(int carico) {
		this.carico = carico;
	}
	
	public void inserimento() {
		super.inserimento();
		Scanner KB = new Scanner(System.in);
		int carico;
		do {
			System.out.print("Inserisci carico ");
			carico=KB.nextInt();
			setCarico(carico);
		}while(carico<=0);
	}

	public void visualizza() {
		System.out.println("---Furgone---");
		super.visualizza();
		System.out.println("---Carico : " + carico);
	}
	
	
	
	
}
