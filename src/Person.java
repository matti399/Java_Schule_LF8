import ea.Kon;		//ea - Ein- bzw. Ausgabe -> Klasse Kon

public class Person {
 
	//Attribute
	private int iPNr;					//Personal-Nummer
	private String strName;
	private String strVorname;
	private String strGeboren;			//ohne Sichtbarkeit -> package
	
	private Adresse adresse;			//Ref. auf die Adresse (Komposition)
	//Klassen-Attribut
	private static int iPersonenAnzahl=0;
	
	//Konstruktor
	public Person() {
		iPersonenAnzahl++;				//Personenanzahl inkrementieren
		iPNr = iPersonenAnzahl;
		//Standardwerte
		strVorname	="Marie";
		strName		="Muster";
		strGeboren	="01.01.1970";
		
		adresse		= new Adresse();	//Komosition -> Einzelteil
										//wird im Konstruktor des Ganzen erzeugt
	}
	
	//Methoden
	public void druckeAusweis() {
		System.out.println("\nPersonal-Nr:\t" + iPNr);
		System.out.println("Name:\t\t" + strName);
		System.out.println("Vorname:\t"+ strVorname);
		System.out.println("geboren:\t"+ strGeboren);
		System.out.println("Adresse:\t");
		System.out.println("PLZ:\t\t"   + adresse.getPLZ());
		System.out.println("Ort:\t\t"   + adresse.getOrt());
		System.out.println("Straße:\t\t"+ adresse.getStrasse());
	}
	 
	public void erfasseDaten() {
		System.out.print("Name:\t\t");
		strName = ea.Kon.strEingabe();
		System.out.print("Vorname:\t");
		strVorname = ea.Kon.strEingabe();
		System.out.print("geboren:\t");
		strGeboren = ea.Kon.strEingabe();
		//adresse erfassen
		System.out.println("Adresse:");
		System.out.print("PLZ:\t\t");
		String strText = ea.Kon.strEingabe();
		adresse.setPLZ(strText);
		System.out.print("Ort:\t\t");
		adresse.setOrt(ea.Kon.strEingabe());
		System.out.print("Straße:\t");
		adresse.setStrasse(ea.Kon.strEingabe());
		
	}

	////////////////Getter und Setter  //////////////////////
	public String getGeboren() {
		return strGeboren;
	}

	public void setGeboren(String strGeboren) {
		//Prüfung auf Plausibilität
		this.strGeboren = strGeboren;
	}

	public String getName() {
		return strName;
	}

	public void setName(String strName) {
		this.strName = strName;
	}

	public String getVorname() {
		return strVorname;
	}

	public void setVorname(String strVorname) {
		this.strVorname = strVorname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public static int getPersonenAnzahl() {
		return iPersonenAnzahl;
	}

//	public static void setPersonenAnzahl(int iPersonenAnzahl) {
//		Person.iPersonenAnzahl = iPersonenAnzahl;
//	}
	
	////////////////  Getter und Setter  //////////////////////
	 
}
 
