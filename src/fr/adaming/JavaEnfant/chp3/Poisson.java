package fr.adaming.JavaEnfant.chp3;

public class Poisson extends AnimalFamilier {

int profondeurCourante = 0;
//Il faut initialiser l	a classe au d�but sinon ca fausse le r�sultat qui ferait 2m, 2m, 3m, 3m

public int plonger(int combienDePlus){
  profondeurCourante = profondeurCourante + combienDePlus;
  System.out.println("Plong�e de " +  combienDePlus + " m�tres");
  System.out.println("Je suis � " + profondeurCourante + " m�tres sous le niveau de la mer");
  return profondeurCourante; 
}


public String dire(String unMot) {
return "Ne sais-tu pas que les poissons ne parlent pas ?"; //ce qu'on lui dit de m�moriser dans le cas o� on lui demande poisson.dire. Ce n'est pas une fonction ex�cut� donc elle n'a pas besoin d'�tre dans la class du main
	} 
}