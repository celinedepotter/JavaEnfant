package fr.adaming.JavaEnfant.chp3;

public class Ma�treAnimal {

	  public static void main(String[] args) {

	    String r�actionAnimal;	

	    AnimalFamilier monAnimal = new AnimalFamilier();
	    Poisson monPetitPoisson = new Poisson();
	    monPetitPoisson.dormir();
	    monAnimal.manger();
	    r�actionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(r�actionAnimal);
	  
	    monAnimal.dormir();
		  
	  }}

