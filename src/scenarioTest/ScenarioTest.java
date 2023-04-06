package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
	
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
	
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etalSanglier1 = new Etal<>();
		Etal<Sanglier> etalSanglier2 = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
	
		etalSanglier1.installerVendeur(obelix,sangliersObelix, 8);
		etalSanglier2.installerVendeur(asterix,sangliersAsterix, 10);
		etalPoisson.installerVendeur(ordralfabetix,poissons, 7);
		
		System.out.println("ETAT MARCHE\n");
		System.out.println(etalSanglier2.etatEtal());
		System.out.println(etalSanglier1.etatEtal());
		System.out.println(etalPoisson.etatEtal());
		System.out.println("A l'étal 0 je paye " + etalSanglier1.acheterProduit(1) + " sous \n");
		System.out.println("A l'étal 1 je paye " + etalSanglier2.acheterProduit(2) + " sous \n");
		System.out.println("Je voulais 3 sangliers, j'en ai acheté 3.\n");
		System.out.println("ETAT DU MARCHE\n");
		System.out.println(etalSanglier2.etatEtal());
		System.out.println(etalSanglier1.etatEtal());
		System.out.println(etalPoisson.etatEtal());
		
		
	}
	
}
