public class Adresse {
 
	//Attribute
	private String strPLZ;	 
	private String strOrt;
	private String strStrasse;
	 
	//private Person person;   //Referenz auf die Klasse Person
	
	//Konstruktor
	public Adresse() {
		strPLZ		= "01234";
		strOrt		= "Musterhausen";
		strStrasse	= "Mustergasse 1";
	}

	////////////////////  Getter und Setter  //////////////////
	public String getPLZ() {
		return strPLZ;
	}

	public void setPLZ(String strPLZ) {
		//Prüfung, ob die PLZ existiert
		this.strPLZ = strPLZ;
	}

	public String getOrt() {
		return strOrt;
	}

	public void setOrt(String strOrt) {
		this.strOrt = strOrt;
	}

	public String getStrasse() {
		return strStrasse;
	}

	public void setStrasse(String strStrasse) {
		this.strStrasse = strStrasse;
	}
	////////////////Getter und Setter  //////////////////////
	
	
	 
}
 
