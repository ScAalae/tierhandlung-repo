package Tierpackage;

import java.text.SimpleDateFormat;

public class Person {
 	String name;
 	Tierpackage.adresse adresse;
 	boolean statusMA;
 	SimpleDateFormat gebDat;
 	
 	public Person(String name, Tierpackage.adresse adresse, boolean statusMA, SimpleDateFormat 
 			gebDat) {
 			super();
 			this.adresse = adresse;
 			this.name = name;
 			this.statusMA = false;
 			this.gebDat = gebDat;
 		}

	
	//hier fehlen noch Getter und Setter
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	
	public Tierpackage.adresse getAdresse() {
		return adresse;
		}
	public void  setAdresse( Tierpackage.adresse adresse) {
		this.adresse = adresse;
		}
	
	public boolean getStatusMA() {
		return statusMA;
		}
	public void setStatusMA(boolean statusMA) {
		this.statusMA = statusMA;
		}
 		
 	public SimpleDateFormat getGebDat() {
 		return gebDat;
 	}
 	
 	public void setGebDat(SimpleDateFormat gebDat) {
 		this.gebDat = gebDat;
 	}

}
