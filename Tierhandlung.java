package Tierpackage;

public class Tierhandlung {

	private String firmenname = "Tierhandlung Bieler";
	private String adresse = "Marie-Bautz-Weg";
	private int telefon = 12345;
	private Tier[] tierliste = new Tier[10];
	Person[] personenliste = new Person[100];
	
	
	public void verkaufen(Tier verkaufstier) {
		//hier wird Code stehen
		System.out.println(verkaufstier.getName() + " wurde verkauft!");
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		//Prüfung, ob echte Adresse
		
		this.adresse = adresse;
	}
	
	public String getFirmenname() {
		return firmenname;
	}
	
	public Tier[] getTierliste() {
		return tierliste;
	}
	
	public Tier getTier(int index) {
		return tierliste[index];
	}
	
	
	public void setTierliste(Tier[] tierliste) {
		this.tierliste = tierliste;
	}
	
	
	
	
	public void addTier(Tier neuesTier) {
		boolean eingefügt = false;
		
		for(int index = 0; index < tierliste.length; index++ ) {
			if(tierliste[index] == null) {
				tierliste[index] = neuesTier;
				eingefügt = true;
				break;
			} 
		}
		if(!eingefügt) {
			System.out.println("Tier wurde nicht hinzugefügt. Zu wenig Platz.");
		}
	}
	
	
	public void deliteTier(int position) {
		boolean geloescht = false;
	   
		for(int index = 0; index < tierliste.length; index++ ) {
			if((position-1)==index) {
				tierliste[index] = null;
				geloescht = true;
				break;
			}
		}
		if(!geloescht) {
			System.out.println("Tier wurde nicht geloescht!");
			}
	}
	
	public Person[] getPersonenliste() {
		return personenliste;
	}
	
	public Person getPerson(int index) {
		return personenliste[index];
	}
	
	
	public void setPersonenliste(Person[] personenliste) {
		this.personenliste = personenliste;
	}
	
	public void addPerson(Person newPerson) {
		boolean eingefügt = false;
		
		for(int index = 0; index < personenliste.length; index++ ) {
			if(personenliste[index] == null) {
				personenliste[index] = newPerson;
				eingefügt = true;
				break;
			} 
		}
		if(!eingefügt) {
			System.out.println("Person wurde nicht hinzugefügt. Zu wenig Platz.");
		}
	}
}
