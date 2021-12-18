package Tierpackage;

import java.util.Date;
//import java.util.Date;

public class Tier {
	private String art;
	private String name;
	private float gr�sse;
	private float gewicht = 0;
	private boolean satt = false;
	private Date gebDatum;
	
	public Tier(String art, String name, float gr�sse) {
		 super();
		 this.art = art;
		 this.name = name;
		 this.satt = false;
		 this.gr�sse = gr�sse;
	}

	
	//hier fehlen noch Getter und Setter
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getGr�sse() {
		return gr�sse;
	}
	public void setGr�sse(float gr�sse) {
		this.gr�sse = gr�sse;
	}
	
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gr�sse = gewicht;
	}
	
	public Date getDate() {
		return gebDatum;
	}
	public void setDate(Date date) {
		this.gebDatum = date;
	}
	
	
	public boolean f�ttern(){
		if(satt){
			return false;
		} else {
			//F�tterungsprozess
			System.out.println("Bitte " +art +" namens " +name +" f�ttern");
			return true;
		}

	}
	
	public void schlafen() {
		//Licht aus
		
	}
	
	public int besch�ftigen() {
		int besch�ftigungswert;
		
		//Besch�ftigungsprozedur (errechnet Besch�ftigungswert)
		besch�ftigungswert = 5;
		
		return besch�ftigungswert;	
	}
	
	public void entwurmen() {
		
	}

}
