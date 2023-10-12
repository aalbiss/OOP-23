package stipendiAziendali;

import java.util.Scanner;

public class Impiegato {

	private String cognome;
	private String nome;
	private int ore;
	private int straordinarie;
	private int festivi;
	private double stipendio;

	public Impiegato() {
		cognome="";
		nome="";
		ore=-1;
		straordinarie=-1;
		festivi=-1;
	}

	public Impiegato(String cognome, String nome, int ore, int straordinarie, int festivi) {
		this.cognome = cognome;
		this.nome = nome;
		this.ore = ore;
		this.straordinarie = straordinarie;
		this.festivi = festivi;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		if(ore>=0)
			this.ore = ore;
		else
			ore=-1;
	}

	public int getStraordinarie() {
		return straordinarie;
	}

	public void setStraordinarie(int straordinarie) {
		if(ore>=0)
			this.straordinarie = straordinarie;
		else
			straordinarie=-1;
	}

	public int getFestivi() {
		return festivi;
	}

	public void setFestivi(int festivi) {
		if(ore>=0)
			this.festivi = festivi;
		else
			festivi=-1;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(double stipendio) {
		this.stipendio=stipendio;
	}

	public void inserimento(){
		Scanner KB = new Scanner(System.in);
		int ore;
		int straordinarie;
		int festivi;
		
		System.out.println("Inserisci cognome: ");
		setCognome(KB.nextLine());
		
		System.out.println("Inserisci nome: ");
		setNome(KB.nextLine());
			
		do {
			System.out.println("Inserisci ore normali lavorate: ");
			ore=KB.nextInt();
		}while(ore<0);
		setOre(ore);
			
		do {
			System.out.println("Inserisci ore straordinarie lavorate: ");
			straordinarie=KB.nextInt();
		}while(straordinarie<0);
		setStraordinarie(straordinarie);
			
		do {
			System.out.println("Inserisci ore festive lavorate: ");
			festivi=KB.nextInt();
		}while(festivi<0);
		setFestivi(festivi);
		
	}
	
	public void visualizza() {

		System.out.println("  Cognome: " + cognome);
		System.out.println("  Nome: " + nome);
		System.out.println("  Orario: " + ore);
		System.out.println("  Straordinarie: " + straordinarie);
		System.out.println("  Festivi: " + festivi);
		System.out.println("--------------------------");
	}
	
	@Override
	public String toString() {
		return "Impiegato: cognome= " + cognome + ", nome= " + nome + ", ore= " + ore + ", straordinarie= " + straordinarie + ", festivi= " + festivi;
	}
	
	
	
	
	
	
}
