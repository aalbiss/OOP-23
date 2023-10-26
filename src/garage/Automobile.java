package garage;

import java.util.Scanner;

public class Automobile extends VeicoloAMotore {

	private int nPorte;
	
	public Automobile() {
		super();
		nPorte = 0;
	}

	public Automobile(String targa, String marca, String modello, int nPorte) {
		super(targa, marca, modello);
		this.nPorte=nPorte;
	}

	public int getnPorte() {
		return nPorte;
	}

	public void setnPorte(int nPorte) {
		this.nPorte = nPorte;
	}

	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		int nPorte;
		super.inserimento();
		do {
			System.out.print("Inserisci numero delle porte ");
			nPorte=KB.nextInt();
			setnPorte(nPorte);
		}while(nPorte<=0);
		
	}
	
	public void visualizza() {
		System.out.println("---Automobile---");
		super.visualizza();
		System.out.println("---Numero porte: " + nPorte);
	}
	
}
