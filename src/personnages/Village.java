package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}

	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	
	public void afficherVillageois() {
		int i;
		System.out.println("Dans village du chef" + " " + chef.getNom() +" "+"vivent"
				+ "les legendaires gaulois");
		for (i=0;i<nbVillageois;i++){
			System.out.println("-" + trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Chef chef = new Chef ("Abraracourcix",6,village);
		//Gaulois gaulois = village.trouverHabitant(30); parce que cet
		//indice est en dehors du tableau
		village.setChef(chef);
		Gaulois asterix = new Gaulois("Asterix",6);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//on a qu'un seul gaulois dans village donc c'est normal que ça 
		//affiche Null vu q'on a rien à l'indice 1.
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}
}