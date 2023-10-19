package quadrato;

import java.util.Scanner;

public class Quadrato {

	private int lato;

	public Quadrato() {
		lato = 0;
	}
	
	public Quadrato(int lato) {
		this.lato = lato;
	}

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}
	
	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		int lato;
		System.out.print("Inserisci il lato del quadrato ");
		lato=KB.nextInt();
		KB.nextLine();
		setLato(lato);
	}
	
	public void visualizza() {
		System.out.println("--Lato: " + lato + "--");
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + "]";
	}
	
	
	
}
