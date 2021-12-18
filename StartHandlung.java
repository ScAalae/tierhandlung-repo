package Tierpackage;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StartHandlung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Tierhandlungsobjekt erstellen
		Tierhandlung tierhandlungBieler;
		tierhandlungBieler = new Tierhandlung(); //neues Objekt wird erstelle
		
		//Benutzereingabe
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Willkommen bei der " + tierhandlungBieler.getFirmenname() );
		int eingabe = 0;
		
		while (eingabe != 9) {
			System.out.println("---------(Schleife beginnt)------------");
			System.out.println("Hauptmenü");
			System.out.println("1. Tier hinzufügen");
			System.out.println("2. Tier verkaufen");
			System.out.println("3. Tiere anzeigen");
			System.out.println("4. Tiere löschen");
			System.out.println("5. Person einfügen");
			System.out.println("6. Person anzeigen");
			System.out.println("7. Person löschen");
			System.out.println("9. Programm beenden");
			eingabe = sc.nextInt();
	
			
			switch(eingabe) {
				case 1:
					menüpunkt1(tierhandlungBieler);
					break;
				case 2:					
					menüpunkt2(tierhandlungBieler);
					break;
				case 3:					
					menüpunkt3(tierhandlungBieler);
					break;
				case 4:					
					menüpunkt4(tierhandlungBieler);
					break;
				case 5:					
					menüpunk5(tierhandlungBieler);
					break;
				case 6:					
					menüpunkt6(tierhandlungBieler);
					break;		
				case 7:					
					menüpunkt7(tierhandlungBieler);
					break;	
				case 9:
					System.out.println("Programm wird beendet");
					break;
				default:
					System.out.println("Falsche Eingabe!!!!1");
					break;
			}
	
		}
		System.out.println(  "Daten wurden nicht gespeichert.. :("  );

	}
	
	
	//---Menümethoden---
	
	public static void menüpunkt1(Tierhandlung tierhandlungBieler) {
		
		Scanner sc = new Scanner(System.in);
		String art;
		String name;
		float grösse;
		
		System.out.println("Bitte Daten eingeben./n Art:");
		art = sc.next();
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Größe:");
		grösse = sc.nextFloat();
		
		Tier neuesTier = new Tier(art, name, grösse);
		tierhandlungBieler.addTier(neuesTier);
		
		
	}
	public static void menüpunkt2(Tierhandlung tierhandlungBieler) {
		System.out.println("Tier wird glücklich verkauft");
		
	}
	
	public static void menüpunkt3(Tierhandlung tierhandlungBieler) {
		
		for(int i = 0; i< tierhandlungBieler.getTierliste().length; i++ ) {
			if(tierhandlungBieler.getTierliste()[i] == null) {
				System.out.println("-------Liste Ende------");
				break;
			}
			
			System.out.println("---------------");
			System.out.println( (i+1) + ". Tier");
			System.out.println("Art: " + tierhandlungBieler.getTierliste()[i].getArt() );
			System.out.println("Name: " + tierhandlungBieler.getTierliste()[i].getName() );
			System.out.println("Grösse: " + tierhandlungBieler.getTierliste()[i].getGrösse() );
		}
		
		System.out.println("");
		
	}
	
	public static void menüpunkt4(Tierhandlung tierhandlungBieler) {
		
		System.out.println("---------------");
		System.out.println("Geben Sie bitte die Position ein:");
		Scanner sc = new Scanner(System.in);
		int nummer;
		nummer=sc.nextInt();
		
		tierhandlungBieler.deliteTier(nummer);
		
	}
	
	public static void menüpunk5( Tierhandlung verwaltungBieler) {
		Scanner sc = new Scanner(System.in);
		String name;
	 	Tierpackage.adresse adresse;
	 	boolean statusMA;
	 	SimpleDateFormat gebDat;
		
		System.out.println("Bitte Daten eingeben.");
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Adresse:");
		adresse = sc.nextInt();
		System.out.println("Status MA: 0 oder 1 ");
		grösse = sc.nextFloat();
		System.out.println("Geburtsdatum: ");
		gebDat = sc.nextFloat();
		
		Person newperson = new Person(name, adresse, statusMA, gebDat);
		tierhandlungBieler.addPerson(newperson);
	}
	
	public static void menüpunkt6(Tierhandlung verwaltungBieler) {
		Tierhandlung tierhandlungBieler;
		for(int i = 0; i< tierhandlungBieler.getPersonenliste().length; i++ ) {
			if(tierhandlungBieler.getPersonenliste()[i] == null) {
				System.out.println("-------Liste Ende------");
				break;
			}
			
			System.out.println("---------------");
			System.out.println( (i+1) + ". Person");
			System.out.println("Name: " + tierhandlungBieler.getPersonenliste()[i].getName() );
			System.out.println("Adresse: " + tierhandlungBieler.getPersonenliste()[i].getAdresse() );
			System.out.println("Status MA: " + tierhandlungBieler.getPersonenliste()[i].getStatusMA() );
			System.out.println("Geburtsdatum: " + tierhandlungBieler.getPersonenliste()[i].getGebDat() );
		}
		
		System.out.println("");
		
	}
	public static void menüpunkt7(Tierhandlung verwaltungBieler) {
		
	}
}

