package fr.adaming.JavaEnfant.chp3;

public class GameBoyAdvance {
	String typeCartouche;
	  int largeurEcran;
public static void main(String[] args) {
	int x;
	int y;
	x = 5;
	y = x + 2;
	y++;
	int monScore = 5;
	monScore = monScore + 1;
	
	System.out.println("x : "+x);
	System.out.println("y : "+y);
	System.out.println("monScore : "+monScore);
	
	y+=2;
	System.out.println("y : "+y);
	
	/*
	 * monScore = monScore * 2; est �quivalent � monScore *= 2;
monScore = monScore + 2; est �quivalent � monScore += 2;
monScore = monScore - 2; est �quivalent � monScore -= 2;
monScore = monScore / 2; est �quivalent � monScore /= 2;  
	  *
	  */
	  
monScore = monScore + 2;
System.out.println("monScore etape1 on devrait avoir 8 : "+monScore);
monScore +=2;
System.out.println("monScore etape2 on devrait avoir 10 = "+monScore);
monScore = monScore -2;
System.out.println("monScore etape3 on devrait avoir 8= "+monScore);
monScore -=2;
System.out.println("monScore etape4 on devrait avoir 6 = "+monScore);
monScore= monScore/2;
System.out.println("monScore etape5 on devrait avoir 3= "+monScore);
monScore /= 2; 
System.out.println("monScore etape6 on devrait avoir 1.5 = "+monScore);

char niveau = 'E';
int chaises = 12;
boolean sonActif = false;
double revenuNational = 23863494965745.78; 
float prixJeu = 12.50f;      
long totalVoitures = 4637283648392l; 

System.out.println("niveau de type char : "+niveau);
System.out.println("Niveau de type int : "+chaises);
System.out.println("Niveau de type boolean : "+sonActif);
System.out.println("Niveau de type float : "+revenuNational);
System.out.println("Niveau de type long : "+totalVoitures);


final String CAPITALE_ETAT = "Washington";

x = 12;
y = 12;
int zx = x++;
int zy = ++y;
System.out.println("x :"+x + "zx : "+zx );
System.out.println("y :"+y + "zy : "+zy );}










	    
	  void d�marrerJeu() {
	  }
	  void arr�terJeu() {}}


