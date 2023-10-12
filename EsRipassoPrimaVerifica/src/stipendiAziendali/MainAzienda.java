package stipendiAziendali;

import java.util.Scanner;

public class MainAzienda {

	public static void main(String[] args) {
		Scanner KB = new Scanner(System.in);
		int dim = 0;
		Azienda a;
		System.out.println("Inserisci numero impiegati in azienda");
		dim=KB.nextInt();
		KB.nextLine();;
		a = new Azienda(dim);
		
		int selezione;
		
		do {
			UtilityAzienda.selezioneGenerale();
			selezione = KB.nextInt();
			switch (selezione) {
			case 1:
				if(a.getImpiegatiInseriti()<dim) {
					a.inserimento();
				}
				else {
					System.out.println("Sono stati inseriti tutti gli impiegati");
				}
				break;
			case 2:
				a.visualizza();
				break;
			case 3:
				a.piuStraordinari();
				break;
			case 4:
				a.visualizzaStipendi();
				break;
			case 5:
				a.stipendioMagg();
				break;
			case 9:
				System.out.println("Fine programma");
				break;
			default:
				System.out.println("Selezione errata");
				break;
			}
		} while (!(selezione==9));
		
	}

}
