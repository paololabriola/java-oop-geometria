package jana60.geometria;

public class Rettangolo {

	float baseRettangolo, altezzaRettangolo;
	
	float calcolaPerimetro(){
		
		return (baseRettangolo + altezzaRettangolo) * 2;
		
	}
	
	float calcolaArea() {
		
		return baseRettangolo * altezzaRettangolo;
		
	}
	
	void stampaRisultato() {
		
		System.out.println("Il perimetro del rettantolo inserito � pari a " + calcolaPerimetro() + ", l'area del rettangolo invece � pari a " + calcolaArea());
		
	}
	
}
