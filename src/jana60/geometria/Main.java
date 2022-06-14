package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Dichiarazione di una variabile di nome figura di tipo Rettangolo che eredita i metodi e attributi della classe Rettangolo.
		Rettangolo figura = new Rettangolo();
		//Dichiarazione variabile di tipo Scanner per prendere i valori in input.
		Scanner scan = new Scanner(System.in);
		//Descrizione funzione del codice.
		System.out.println("Questo codice stamperà in output l'area e il perimetro di un rettangolo a partire da una base e un altezza date in input.");
		//Iniziazione dell'attributo base della variabile figura.
		System.out.print("Inserisci il valore della base del rettangolo: ");
		figura.baseRettangolo = scan.nextFloat();
		//Iniziazione dell'attributo altezza della variabile figura.
		System.out.print("Inserisci il valore dell'altezza del rettangolo: ");
		figura.altezzaRettangolo = scan.nextFloat();
		//Metodo stampa della variabile figura ereditato dalla classe rettangolo.
		figura.stampaPerimetroEdAltezza();
		//Chiusura dello scanner.
		scan.close();	
		
	}

}
