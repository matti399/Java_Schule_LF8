
public class SchulApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person oMarie, oMax;
//		
		oMarie = new Person();		//Konstruktor aufrufen
		oMarie.druckeAusweis();		//Ausweis mit Standard-Daten drucken
//		
		oMax 			= new Person();
//		oMax.strVorname = "Maximilian";
//		oMax.strGeboren	= "05.08.1985";
		oMax.druckeAusweis();
//		
//		oMarie.erfasseDaten();
//		oMarie.druckeAusweis();
		
		Schueler oPupil = new Schueler();
//		oPupil.erfasseDaten();
		oPupil.druckeAusweis();
		
		//Lehrer oLämpel = new Lehrer();
		Lehrer oLämpel = new Lehrer("Lämpel");
//		oLämpel.erfasseDaten();
		oLämpel.druckeAusweis();
		
		System.out.println("\nInsgesamt " +  Person.getPersonenAnzahl()  + " Personen erzeugt.");
	}

}
