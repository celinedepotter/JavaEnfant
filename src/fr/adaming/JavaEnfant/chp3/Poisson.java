package fr.adaming.JavaEnfant.chp3;

public class Poisson extends AnimalFamilier {

int profondeurCourante = 0;
//Il faut initialiser l	a classe au début sinon ca fausse le résultat qui ferait 2m, 2m, 3m, 3m

public int plonger(int combienDePlus){
  profondeurCourante = profondeurCourante + combienDePlus;
  System.out.println("Plongée de " +  combienDePlus + " mètres");
  System.out.println("Je suis à " + profondeurCourante + " mètres sous le niveau de la mer");
  return profondeurCourante; 
}


public String dire(String unMot) {
return "Ne sais-tu pas que les poissons ne parlent pas ?"; //ce qu'on lui dit de mémoriser dans le cas où on lui demande poisson.dire. Ce n'est pas une fonction exécuté donc elle n'a pas besoin d'être dans la class du main
	} 
}