package produit;

import personnages.Gaulois;
import produit.Produit.Unite;

public class Sanglier extends Produit{
	private static Unite unite;
	private static String nom = "sanglier";
	private int poid;
	private Gaulois chasseur;
	
	public Sanglier(int poid, Gaulois chasseur) {
		super(nom, unite);
		this.poid = poid;
		this.chasseur = chasseur;
	}
	
	public String DescProduit() {
		return (nom + " de " + poid + " kg chassé par " + chasseur.getNom());
	}
	
	public int calculerPrix(int prixD){
		return (prixD*poid)/1000;
	}

}
