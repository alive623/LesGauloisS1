package personnages;


public class Romain {
	private String nom;
	private int force;
	private Equipement[]equipements=new Equipement[2];
	private int nbEquipement=0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
			assert force < 0;
		}
	}
	
	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement++;
		System.out.println("le soldat "+ nom + " s’équipe avec un "+ equipement +".");
		
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2: {
			System.out.println("le soldat "+ nom + " est déjà bien protégé !");
			break;
			}
		case 1:{
			if (equipements[0]==equipement) {
				System.out.println("le soldat "+ nom + " possède déjà un "+equipement + "!");
				break;
				}
			else {
				ajouterEquipement(equipement);
				break;
			}	
		}
		default :{
			ajouterEquipement(equipement);
			break;
		}	
		}
	}

	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus",6);
		romain.parler("Gain");
		romain.recevoirCoup(5);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.CASQUE);
		
		
	}
}
