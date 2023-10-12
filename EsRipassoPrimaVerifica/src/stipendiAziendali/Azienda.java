package stipendiAziendali;

public class Azienda {

	private int dim;
	private int impiegatiIns;
	private Impiegato imp[];

	public Azienda() {
		dim = 0;
		impiegatiIns=0;
		imp = new Impiegato[dim];
	}

	public Azienda(int dim) {
		this.dim = dim;
		impiegatiIns=0;
		imp = new Impiegato[dim];
	}
	
	public int getImpiegatiInseriti() {
		return impiegatiIns;
	}

	public void inserimento() {
		Impiegato i = new Impiegato();
		i.inserimento();
		imp[impiegatiIns]=i;
		impiegatiIns++;
	}

	public void piuStraordinari() {
		int max=0;
		for(int i=0;i<impiegatiIns;i++) 
			if(imp[i].getStraordinarie()>max) 
				max=imp[i].getStraordinarie();

		for(int i=0;i<impiegatiIns;i++) 
			if(imp[i].getStraordinarie()==max) {
				System.out.println("Impegato/i con più straordinarie");
				System.out.println();
				imp[i].visualizza();
			}
				
	}
	
	public void stipendi() {
		for(int i=0;i<impiegatiIns;i++){
			imp[i].setStipendio(imp[i].getOre()*20.00+imp[i].getStraordinarie()*30.00+imp[i].getFestivi()*50.00);		
		}
	}
	
	public void visualizzaStipendi() {
		stipendi();
		for(int i=0;i<impiegatiIns;i++){
			System.out.println("Impiegato " + (i+1) + ":" + "nome: " + imp[i].getNome() +", cognome: " + imp[i].getCognome() + ", stipendio: " + imp[i].getStipendio());
		}
	}

	public void stipendioMagg() {
		double max=0;
		stipendi();
		for(int i=0;i<impiegatiIns;i++) 
			if(imp[i].getStipendio()>max) 
				max=imp[i].getStipendio();

		for(int i=0;i<impiegatiIns;i++) 
			if(imp[i].getStipendio()==max) {
				System.out.println("Impegato/i con stipendio maggiore");
				System.out.println();
				imp[i].visualizza();
			}
	}
	
	public void visualizza() {
		for(int i=0;i<impiegatiIns;i++) {
			System.out.println();
			System.out.println("---------IMPIEGATO " + (i+1) + "---------");
			imp[i].visualizza();
		}
			
 
	}
	
}
