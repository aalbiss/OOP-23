package garage;

import java.util.Scanner;

public class MainGarage {

	public static void main(String[] args) {
		
		Scanner KB = new Scanner(System.in);
		int selezione;
		int selezioneVeicolo;
		Garage garage = new Garage();
		
		do {
			Utility.Inserimento();
			selezione = KB.nextInt();
			KB.nextLine();
			
			switch (selezione) {
			case 1:
				Utility.InserimentoVeicolo();
				selezioneVeicolo=KB.nextInt();
				KB.nextLine();
				
				switch (selezioneVeicolo) {
					case 1:
						garage.inserimentoAuto();
						break;
					case 2:
						garage.inserimentoMoto();
						break;
					case 3:
						garage.inserimentoFurgone();
						break;
					default:
						System.out.println("Selezione errata");
						break;
				}
				break;
			case 2:
				garage.visualizza();
				break;
				
			case 3:
				garage.visualizzaVuoti();
				break;
			case 4:
				garage.eliminazione();
				break;
			default:
				break;
			}
			
			
		}while(selezione!=9);

	}

}
