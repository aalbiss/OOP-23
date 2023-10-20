package garage;

import java.util.Scanner;

public class VeicoloAMotore {

	private String targa,marca,modello;

	public VeicoloAMotore() {
		targa="";
		marca="";
		modello="";
	}

	public VeicoloAMotore(String targa, String marca, String modello) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		String targa,marca,modello;
		
		System.out.print("Inserisci marca ");
		marca=KB.nextLine();
		setMarca(marca);

		System.out.print("Inserisci modello ");
		modello=KB.nextLine();
		setModello(modello);
		
		System.out.print("Inserisci targa ");
		targa=KB.nextLine();
		setTarga(targa);
	}
	
	public void visualizza() {
		System.out.println("---Marca: " + marca);
		System.out.println("---Modello: " + modello);
		System.out.println("---Targa: " + targa);
		
	}
	
	
	
}
