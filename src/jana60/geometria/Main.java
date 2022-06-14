package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo figura1 = new Rettangolo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice stamperà in output l'area e il perimetro di un rettangolo a partire da una base e un altezza date in input.");
		
		System.out.print("Inserisci il valore della base del rettangolo: ");
		figura1.baseRettangolo = scan.nextFloat();
		
		System.out.print("Inserisci il valore dell'altezza del rettangolo: ");
		figura1.altezzaRettangolo = scan.nextFloat();
		
		figura1.stampaRisultato();

		scan.close();	
		
	}

}
