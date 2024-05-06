public class Lehrer extends Person {
 
	//Attribute
	private String strFach;
	 
	//Konstruktor
	public Lehrer() {
		strFach = "E-Technik";
	}
	 
	public Lehrer(String strNachname) {
		// Konstruktor Lehrer() wird ü b e r l a d e n 
		this.setName(strNachname);	//gleicher Methodenname aber
		strFach = "E-Technik";		//unterschiedl. Anzahl od. Typ
	}								//an Parametern
	
	public Lehrer(String strNachname, String strVName) {
		// Konstruktor Lehrer() wird ü b e r l a d e n 
		this.setName(strNachname);
		this.setVorname(strVName);
		strFach = "E-Technik";
	}

	//Methoden
	public void druckeAusweis() {
		super.druckeAusweis();
		System.out.println("Fach:\t\t" + strFach);
	}
	 
	public void erfasseDaten() {
		super.erfasseDaten();
		System.out.print("Fach:\t\t");
		strFach = ea.Kon.strEingabe();
	}

	////// Getter und Setter   ///////////////////
	public String getFach() {
		return strFach;
	}

	public void setFach(String strFach) {
		this.strFach = strFach;
	}
	//////    Ende Getter und Setter   ///////////////////
}
 
