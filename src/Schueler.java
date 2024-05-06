public class Schueler extends Person {
 
	//Attribute
	private
	String strKlasse;
	 
	//Konstruktor
	public Schueler() {
		strKlasse = "1a";
	}
	
	//Methoden
	public void druckeAusweis() {
		//Methode der Elternklasse ü b e r s c h r e i b e n 
		super.druckeAusweis(); 			//Methode d. Elternklasse aufrufen
		System.out.println("Klasse:\t\t" + strKlasse);
	}
	 
	public void erfasseDaten() {
		//Methode der Elternklasse ü b e r s c h r e i b e n 
		super.erfasseDaten();			//Methode d. Elternklasse aufrufen  
		System.out.print("Klasse:\t\t");
		strKlasse = ea.Kon.strEingabe();
	}
	
//	//////////////Getter und Setter  //////////////////////
	public String getKlasse() {
		return strKlasse;
	}

	public void setKlasse(String strKlasse) {
		this.strKlasse = strKlasse;
	}
	////////////////Getter und Setter  //////////////////////
}
 
