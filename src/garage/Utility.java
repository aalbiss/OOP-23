package garage;

public class Utility {

	public static void Inserimento() {
		System.out.println();
		System.out.println("--------------MENU--------------");
		System.out.println("-----1:inserimento--------------");
		System.out.println("-----2:visualizza---------------");
		System.out.println("-----3:visualizza posti vuoti---");
		System.out.println("-----4:macchina uscita----------");
		System.out.print("Inserisci operazione da eseguire: ");
	}
	
	public static void InserimentoVeicolo() {
		System.out.println();
		System.out.println("---------INSERIMENTO----------");
		System.out.println("-----1:inserimento auto-------");
		System.out.println("-----2:inserimento moto-------");
		System.out.println("-----3:inserimento furgone----");
		System.out.print("Inserisci operazione da eseguire: ");
	}
	
	public static void doveInserire() {
		System.out.println("Dove vuoi inserire la macchina?");
	}
	
	public static void doveEliminare() {
		System.out.println("Dov'era la macchina uscita? ");
	}

	
}
