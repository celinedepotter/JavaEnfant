package fr.adaming.JavaEnfant.chp3;

public class MaîtreAnimal {

	  public static void main(String[] args) {

	    String réactionAnimal;	

	    AnimalFamilier monAnimal = new AnimalFamilier();
	    Poisson monPetitPoisson = new Poisson();
	    monPetitPoisson.dormir();
	    monAnimal.manger();
	    réactionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(réactionAnimal);
	  
	    monAnimal.dormir();
		  
	  }}

