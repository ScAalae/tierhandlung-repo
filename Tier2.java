package Tierpackage;
import java.util.*;

	public class Tier2 {
		 String rasse;
		 String name;
		 boolean satt = false;
		 String farbe;
	
		public Tier2(String rasse, String name, String farbe) {
			 super();
			 this.rasse = rasse;
			 this.name = name;
			 this.farbe = farbe;
			 }
		
		public void setRasse(String name) {
			this.name=name;
		}		
		public String getRasse() {
			return rasse;
		}
		
		public void setFarbe(String farbe) {
			this.farbe=farbe;
		}
		public String getFarbe() {
			return farbe;
		}
		
		public void fuettern(){
			 System.out.println( name + " muss gefuettert werden");
			 } 
		
		public String getName(){
			 return this.name;
			 }
			 
	    public void setName(String name){
			 this.name = name;
			 }
	}
	
	public class Hund extends Tier2{
	   boolean entwurmt;
	   String[] kommandos;
	   private String[] kommandoliste;
			 
	   public Hund(String rasse, String name, String farbe,
	   boolean entwurmt, String[] kommandos){ 
	     super(rasse, name, farbe);
			 this.entwurmt = entwurmt;
			 this.kommandos = kommandos;
			 }
	   
		public Hund(String rasse, String name, String farbe, boolean entwurmt, String[] kommandos)
		 public boolean getEntwurmt(){
			 return entwurmt;
			 }
			 public void setEntwurmt(boolean entwurmt){
			 this.entwurmt = entwurmt;
			 }
			 public String[] getKommandos(){
			 return kommandos;
			 }
			 public void setKommandos(String[] kommandos){
			 this.kommandos = kommandos;
			 }
			 
			 public String getKommandos(int index) {
					return kommandoliste[index];
				}
				
				
				public void setKommandosliste(String[] kommandoliste) {
					this.kommandoliste = kommandoliste;
				}
			 public void entwurmen(){
				 if(entwurmt){
					 System.out.println( this.getName()
					 + " muss nicht entwurmt werden." );
				 }  else {
					 System.out.println( this.getName() + " entwurmen!");
					 entwurmt = true;
				  }
			 }
		
			 public void gassiGehen(){
			 System.out.println( "Gassi gehen mit: " + this.getName() );
			 }
			 
			}		 
		public class Katze extends Tier2{
			boolean entwurmt;
		    boolean hauskatze;
				 
			public Katze (String rasse, String name, String farbe,
		    boolean entwurmt, boolean hauskatze) {
				 
		    super(rasse, name, farbe);
			this.entwurmt = entwurmt;
			this.hauskatze = hauskatze;
			}
				 
				 
			 public boolean getEntwurmt() {
				return entwurmt;
			 }
			public void setEntwurmt(boolean entwurmt) {
				this.entwurmt=entwurmt;
			}
				
			public void setHauskatze(boolean hauskatze) {
				this.hauskatze=hauskatze;
		    }
				 
				 public boolean getHauskatze() {
					 return hauskatze;
				 }
				 
			public void entwurmen(){
			
			   if(entwurmt){
				System.out.println( this.getName()
				+ " muss nicht entwurmt werden."); 
			   } else {
				 
				 System.out.println( this.getName() + " entwurmen!");
				 entwurmt = true;
				}
		 }
				 
		public class Fisch extends Tier2(){
			double salzgehalt;
			
			public Fisch(String rasse, String name, String farbe,boolean satt, double salzgehalt) {
				super(rasse,name,farbe);
				this.salzgehalt = salzgehalt;
			}
			
			public double setSalzgehalt(double salzgehalt) {
				this.salzgehalt = salzgehalt;
			}
			
			public double getSalzgehalt() {
				return salzgehalt;
			}
			
			public void aquariumSaubern(int rythmus, double volume) {
				
			}
		}	 
				 
  }
