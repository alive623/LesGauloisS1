package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int forcePotion=1;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller "
			+ "d'une force " + effetPotionMin + " à "
	+ effetPotionMax + ".");
	}
	public String getNom() {
	return nom;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
	return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion() {
		Random i = new Random();
		int forcePotion = i.nextInt(effetPotionMin,effetPotionMax);
		parler("je vais aller preparer une potion");
		if (forcePotion>=7) {
			System.out.println(prendreParole() + " <<j'ai prepare une super potion de force " 
		+ forcePotion +">>");
		}
		else {
			System.out.println(prendreParole()+ "<<je n'ai pas trouve tous les ingrediens ,ma potion "
					+ "est seulement de force " + forcePotion +">>");
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois){
		String monNom=gaulois.getNom();
		if (monNom == "Obelix") {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
			gaulois.parler("Par Bélénos, ce n'est pas juste !");
		}
		else {
			gaulois.boirePotion(gaulois.getforce());
		}
		
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.preparerPotion();
	}

}
