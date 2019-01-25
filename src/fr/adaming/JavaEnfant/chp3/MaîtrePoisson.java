package fr.adaming.JavaEnfant.chp3;

public class MaîtrePoisson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Poisson monPoisson = new Poisson();
		
	    monPoisson.plonger(2);
	    monPoisson.plonger(3);
	    monPoisson.dormir();
	  
String reactionPoisson = monPoisson.dire("Un poisson qui parle !");
System.out.println(reactionPoisson);
}


}