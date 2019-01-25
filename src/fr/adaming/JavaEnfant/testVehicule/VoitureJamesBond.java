package fr.adaming.JavaEnfant.testVehicule;

public class VoitureJamesBond extends NewVoiture {
	
	
	public  int rouler(int duree) {
	int distance= duree*180;
	return distance;
	}
	
//Test de tout faire dans une même classe
public static void main(String[] args) {
VoitureJamesBond bolide = new VoitureJamesBond() ;
System.out.println("Mon vehicule roule une distance de : " +bolide.rouler(180));	
		
	
}
}

