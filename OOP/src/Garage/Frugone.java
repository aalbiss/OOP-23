package Garage;

public class Frugone extends VeicoloAMotore{

	private int carico;

	public Frugone() {
		super();
		carico = 0;
	}

	public Frugone(String targa, String marca, String modello) {
		super(targa, marca, modello);
		this.carico=carico;
	}

	public int getCarico() {
		return carico;
	}

	public void setCarico(int carico) {
		this.carico = carico;
	}
	
	
	
	
	
}
