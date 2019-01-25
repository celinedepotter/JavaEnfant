package fr.adaming.JavaEnfant.testVehicule;

public class ProprietaireVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewVoiture Voiture = new NewVoiture(); //les parenthèses signifient qu'ils va appeler toutes les méthodes de la calsse "NewVoiture"//
		int distance = Voiture.rouler(60);
		
		System.out.println("Mon vehicule roule une distance de : " +distance);
		
	}

}