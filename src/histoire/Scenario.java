package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois ob = new Gaulois("Obelix",25);
		Romain minus = new Romain("Minus",6);
		Druide Panoramix = new Druide("Panoramix",5,10);
		Panoramix.preparerPotion();
		Panoramix.booster(ob);
		asterix.parler("  Bonjour à tous ");
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}


}
