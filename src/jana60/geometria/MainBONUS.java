package jana60.geometria;

import java.util.Scanner;

public class MainBONUS {

	public static void main(String[] args) {
		
		Rettangolo figura = new Rettangolo();
		Rettangolo figuraMaggiore = new Rettangolo();
		Scanner scan = new Scanner(System.in);
		float areaMaggiore=0;
		int rettangoloNumero = 0;
		
		System.out.println("Questo codice stamperà in output l'area del rettangolo più grande, a partire da 5 rettangoli inseririti in input.");
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Inserisci il valore della base del " + (i+1) + "° rettangolo: ");
			figura.baseRettangolo = scan.nextFloat();
			
			System.out.println("Inserisci il valore dell'altezza del " + (i+1) + "° rettangolo: ");
			figura.altezzaRettangolo = scan.nextFloat();
			
			if(figura.calcolaArea() >= areaMaggiore) {
				
				rettangoloNumero = i + 1;
				areaMaggiore = figura.calcolaArea();
				
				figuraMaggiore.altezzaRettangolo = figura.altezzaRettangolo;
				figuraMaggiore.baseRettangolo = figura.baseRettangolo;
				
			}
			
		}
		
		System.out.println("Il rettangolo più grande è il " + rettangoloNumero + "° rettangolo e l'area è pari a " + figuraMaggiore.calcolaArea());

		scan.close();	

	}

}