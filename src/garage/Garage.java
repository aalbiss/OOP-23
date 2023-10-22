package garage;

import java.util.Scanner;

public class Garage {

	int dim;
	int veicoliInseriti;
	VeicoloAMotore garage[];

	public Garage() {
		dim = 3;
		veicoliInseriti = 0;
		garage = new VeicoloAMotore[dim];
	}

	public Garage(int dim, int veicoliInseriti, VeicoloAMotore[] garage) {
		this.dim = dim;
		this.veicoliInseriti = veicoliInseriti;
		this.garage = garage;
	}

	public int getveicoliInseriti() {
		return veicoliInseriti;
	}

	public void setveicoliInseriti(int veicoliInseriti) {
		this.veicoliInseriti = veicoliInseriti;
	}

	public void inserimentoAuto() {
		Scanner KB = new Scanner(System.in);
		int inserimento;
		if(veicoliInseriti<dim) {
			visualizzaVuoti();
			do {
				Utility.doveInserire();
				inserimento= KB.nextInt()-1;
				if(garage[inserimento]!=null) {
					System.out.println("posto gia occupato");
				}
			}while(garage[inserimento]!=null);

			KB.nextLine();

			Automobile a = new Automobile();
			a.inserimento();
			garage[inserimento]=a;
			veicoliInseriti++;
		}
		else {
			System.out.println("Il garage è pieno");
		}
	}

	public void inserimentoMoto() {
		Scanner KB = new Scanner(System.in);
		int inserimento;
		if(veicoliInseriti<dim) {
			visualizzaVuoti();
			do {
				Utility.doveInserire();
				inserimento= KB.nextInt()-1;
				if(garage[inserimento]!=null) {
					System.out.println("posto gia occupato");
				}
			}while(garage[inserimento]!=null);

			KB.nextLine();

			Motocicletta m = new Motocicletta();
			m.inserimento();
			garage[inserimento]=m;
			veicoliInseriti++;
		}
		else {
			System.out.println("Il garage è pieno");
		}
	}

	public void inserimentoFurgone() {
		Scanner KB = new Scanner(System.in);
		int inserimento;
		if(veicoliInseriti<dim) {
			visualizzaVuoti();
			do {
				Utility.doveInserire();
				inserimento= KB.nextInt()-1;
				if(garage[inserimento]!=null) {
					System.out.println("posto gia occupato");
				}
			}while(garage[inserimento]!=null);

			KB.nextLine();

			Furgone f = new Furgone();
			f.inserimento();
			garage[inserimento]=f;
			veicoliInseriti++;
		}
		else {
			System.out.println("Il garage è pieno");
		}
	}

	public void visualizzaVuoti() {
		if(veicoliInseriti<dim) {
			System.out.println("I posti vuoti sono: ");
			for(int i=0; i<dim;i++) {
				if(garage[i]==null) {
					System.out.print(i+1 + ", ");
				}
			}
			System.out.println();
		}
		else {
			System.out.println("Tutti i posti sono occupati");
		}
	}

	public void visualizza() {
		for(int i=0; i<dim;i++) {
			if(garage[i]!=null) {
				garage[i].visualizza();
				System.out.println("Questo veicolo si trova al posto numero " + (i+1));
				System.out.println();
			}
		}
	}
	
	public void eliminazione() {
		Scanner KB = new Scanner(System.in);

		int inserimento;

		do {
			Utility.doveEliminare();
			inserimento= KB.nextInt()-1;
			if(garage[inserimento]==null) {
				System.out.println("posto già vuoto");
			}
		}while(garage[inserimento]==null);
		garage[inserimento]=null;
		System.out.println("Macchina uscita");
		veicoliInseriti--;
	}



}
