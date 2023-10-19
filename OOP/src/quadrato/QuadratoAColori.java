package quadrato;

import java.util.Scanner;

public class QuadratoAColori extends Quadrato {

	String colore;

	public QuadratoAColori() {
		super();
		colore = "";
	}
	
	public QuadratoAColori(int lato, String colore) {
		super(lato);
		this.colore = colore;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		super.inserimento();
		String colore;
		System.out.print("Insersci colore ");
		colore=KB.nextLine();
		setColore(colore);
	}
	
	public void visualizza() {
		super.visualizza();
		System.out.println("--Colore: " + colore + "--");
	}
	
	@Override
	public String toString() {
		return "QuadratoAColori [colore=" + colore  + super.toString() + "]";
	}

}
