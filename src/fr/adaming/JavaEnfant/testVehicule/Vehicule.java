package fr.adaming.JavaEnfant.testVehicule;

public class Vehicule {

	int vitesse = 50 ;
	
	
	  public String rouler(int vitesse) {
		    String LaVoitureRouleA = "La voiture roule � " + vitesse;
		    return LaVoitureRouleA;}
	
	public void rouler() {
		System.out.println(
	            "Mon vehicule roule � : " +vitesse +"k/h)");
	
}}
