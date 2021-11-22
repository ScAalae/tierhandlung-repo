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
			System.out.println("Hauptmen�");
			System.out.println("1. Tier hinzuf�gen");
			System.out.println("2. Tier verkaufen");
			System.out.println("3. Tiere anzeigen");
			System.out.println("4. Tiere l�schen");
			System.out.println("5. Person einf�gen");
			System.out.println("6. Person anzeigen");
			System.out.println("7. Person l�schen");
			System.out.println("9. Programm beenden");
			eingabe = sc.nextInt();
	
			
			switch(eingabe) {
				case 1:
					men�punkt1(tierhandlungBieler);
					break;
				case 2:					
					men�punkt2(tierhandlungBieler);
					break;
				case 3:					
					men�punkt3(tierhandlungBieler);
					break;
				case 4:					
					men�punkt4(tierhandlungBieler);
					break;
				case 5:					
					men�punk5(tierhandlungBieler);
					break;
				case 6:					
					men�punkt6(tierhandlungBieler);
					break;		
				case 7:					
					men�punkt7(tierhandlungBieler);
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
	
	
	//---Men�methoden---
	
	public static void men�punkt1(Tierhandlung tierhandlungBieler) {
		
		Scanner sc = new Scanner(System.in);
		String art;
		String name;
		float gr�sse;
		
		System.out.println("Bitte Daten eingeben./n Art:");
		art = sc.next();
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Gr��e:");
		gr�sse = sc.nextFloat();
		
		Tier neuesTier = new Tier(art, name, gr�sse);
		tierhandlungBieler.addTier(neuesTier);
		
		
	}
	public static void men�punkt2(Tierhandlung tierhandlungBieler) {
		System.out.println("Tier wird gl�cklich verkauft");
		
	}
	
	public static void men�punkt3(Tierhandlung tierhandlungBieler) {
		
		for(int i = 0; i< tierhandlungBieler.getTierliste().length; i++ ) {
			if(tierhandlungBieler.getTierliste()[i] == null) {
				System.out.println("-------Liste Ende------");
				break;
			}
			
			System.out.println("---------------");
			System.out.println( (i+1) + ". Tier");
			System.out.println("Art: " + tierhandlungBieler.getTierliste()[i].getArt() );
			System.out.println("Name: " + tierhandlungBieler.getTierliste()[i].getName() );
			System.out.println("Gr�sse: " + tierhandlungBieler.getTierliste()[i].getGr�sse() );
		}
		
		System.out.println("");
		
	}
	
	public static void men�punkt4(Tierhandlung tierhandlungBieler) {
		
		System.out.println("---------------");
		System.out.println("Geben Sie bitte die Position ein:");
		Scanner sc = new Scanner(System.in);
		int nummer;
		nummer=sc.nextInt();
		
		tierhandlungBieler.deliteTier(nummer);
		
	}
	
	public static void men�punk5( Tierhandlung verwaltungBieler) {
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
		gr�sse = sc.nextFloat();
		System.out.println("Geburtsdatum: ");
		gebDat = sc.nextFloat();
		
		Person newperson = new Person(name, adresse, statusMA, gebDat);
		tierhandlungBieler.addPerson(newperson);
	}
	
	public static void men�punkt6(Tierhandlung verwaltungBieler) {
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
	public static void men�punkt7(Tierhandlung verwaltungBieler) {
		
	}
}

