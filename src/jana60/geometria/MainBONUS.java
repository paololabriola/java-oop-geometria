package jana60.geometria;

import java.util.Scanner;

public class MainBONUS {

	public static void main(String[] args) {
		//Dichiarazione due variabili di tipo Rettangolo, una per prendere i singoli valori, una per salvare il rettangolo più grande da stampare alla fine del codice.
		Rettangolo figura = new Rettangolo();
		Rettangolo figuraMaggiore = new Rettangolo();
		//Dichiarazione variabile di tipo Scanner per prendere i valori in input.
		Scanner scan = new Scanner(System.in);
		//Dichiarazione e iniziazione variabile areaMaggiore per confrontare i rettangoli e salvare i valori del rettangolo più grande nella serie.
		float areaMaggiore=0;
		//Dichiarazione e iniziazione variabile rettangoloNumero per salvarmi la posizione del rettangolo maggiore.
		int rettangoloNumero = 0;
		//Descrizione funzione del codice.
		System.out.println("Questo codice stamperà in output l'area del rettangolo più grande, a partire da 5 rettangoli inseririti in input.");
		//Ciclo per prendere in input 5 rettangoli, confrontarne i valori e salvarne i valori del maggiore.
		for(int i=0;i<5;i++) {
			//Controllo sulla base affinché non assuma valori negativi.
			do {
			
			System.out.println("Inserisci il valore della base del " + (i+1) + "° rettangolo: ");
			figura.baseRettangolo = scan.nextFloat();
			//Messaggio di errore in caso di valore negativo.
			if(figura.baseRettangolo < 0)
				System.out.println("La dimensione della base non può essere un valore negativo, riprova.");
				
			}while(figura.baseRettangolo < 0);
			//Controllo sull'altezzaaffinché non assuma valori negativi.
			do {
				
			System.out.println("Inserisci il valore dell'altezza del " + (i+1) + "° rettangolo: ");
			figura.altezzaRettangolo = scan.nextFloat();
			//Messaggio di errore in caso di valore negativo.
			if(figura.altezzaRettangolo < 0)
				System.out.println("La dimensione dell'altezza non può essere un valore negativo, riprova.");
				
			}while(figura.altezzaRettangolo < 0);
			//Caso in cui l'area del rettangolo corrente sia maggiore dell'area maggiore salvata in memoria.
			if(figura.calcolaArea() >= areaMaggiore) {
				//Salvataggio della posizione del rettangolo più grande.
				rettangoloNumero = i + 1;
				//Aggiornamento del valore dell'area maggiore con il valore del rettangolo corrente.
				areaMaggiore = figura.calcolaArea();
				//ANCHE SE NON RICHIESTO! - In un ipotetico caso in cui venissero riutilizzati e fossero necessari gli attributi singoli del rettangolo maggiore.
				//Salvataggio i dati del rettangolo corrente(attualmente il più grande) in un nuovo rettangolo che sarà il rettangolo maggiore per poi eventualmente riutilizzare i suoi attributi o metodi.
				figuraMaggiore.altezzaRettangolo = figura.altezzaRettangolo;
				figuraMaggiore.baseRettangolo = figura.baseRettangolo;
				
			}
			
		}
		//Stampa in output il valore dell'area del rettangolo più grande con annessa posizione.
		System.out.println("Il rettangolo più grande è il " + rettangoloNumero + "° rettangolo e l'area è pari a " + figuraMaggiore.calcolaArea() + ".");
		//Chiusura dello scanner.
		scan.close();	

	}

}