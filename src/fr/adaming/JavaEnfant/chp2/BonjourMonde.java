package fr.adaming.JavaEnfant.chp2;

public class BonjourMonde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour Monde");
		afficherAdresse(25 , "rue hegel" , 59160 , "Lomme");
	}

		  public static void afficherAdresse(int numRue ,String rue ,int code ,String ville ){
			  System.out.println("J'habite au ");
			  System.out.println(numRue + " "+rue);
			  System.out.println(code + " "+ ville);
	}

}
