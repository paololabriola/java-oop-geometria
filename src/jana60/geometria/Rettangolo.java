package jana60.geometria;

public class Rettangolo {
	//ATTRIBUTI DELLA CLASSE (di tipo float anche se erano richiesti int, ma per me avevano più senso come float in quanto valori geometrici-matematici).
	float baseRettangolo, altezzaRettangolo;
	//INSERIMENTO METODI:
	//Metodo che ritorna il perimetro del rettangolo.
	float calcolaPerimetro(){
		
		return (baseRettangolo + altezzaRettangolo) * 2;
		
	}
	//Metodo che ritorna l'area del rettangolo.
	float calcolaArea() {
		
		return baseRettangolo * altezzaRettangolo;
		
	}
	//Metodo che stampa i valori di perimetro e area. È un metodo void con un print che richiama gli altri due metodi della classe e stampa a schermo i valori di perimetro ed area.
	void stampaPerimetroEdAltezza() {
		
		System.out.println("Il perimetro del rettangolo inserito è pari a " + calcolaPerimetro() + ", l'area del rettangolo invece è pari a " + calcolaArea());
		
	}
	
}
