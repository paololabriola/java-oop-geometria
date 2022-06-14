package jana60.geometria;

import java.util.Scanner;

public class MainBONUS {

	public static void main(String[] args) {
		
		Rettangolo figura1 = new Rettangolo();
		Scanner scan = new Scanner(System.in);
		float base, baseFinale=0, altezza, altezzaFinale=0;
		
		System.out.println("Questo codice stamperà in output l'area e il perimetro di un rettangolo a partire da 5 basi e altezze date in input scegliendone i valori più grandi.");
		
		System.out.println("Inserisci 5 valori per la base tra cui scegliere: ");
		for(int i=0;i<5;i++) {
			
			do {
				
			base = scan.nextFloat();
			if(base<0)
				System.out.println("Il valore deve essere maggiore di 0. Riprova:");
			
			}while(base < 0);
			
			if(base > baseFinale)
				baseFinale = base;
			
		}
		
		figura1.baseRettangolo = baseFinale;
		
		System.out.println("Inserisci 5 valori per l'altezza tra cui scegliere: ");
		for(int i=0;i<5;i++) {
			
			do {
				
			altezza = scan.nextFloat();
			if(altezza<0)
				System.out.println("Il valore deve essere maggiore di 0. Riprova:");
			
			}while(altezza < 0);
			
			if(altezza > altezzaFinale)
				altezzaFinale = altezza;
			
		}
		
		figura1.altezzaRettangolo = altezzaFinale;
		
		figura1.stampaRisultato();

		scan.close();	

	}

}
