package produit;
import produit.Sanglier;

public abstract class Produit implements IProduit {
	private String nom;
	public enum Unite {LITRE, GRAMME, KILOGRAMME, CENTILITRE, MILLILITRE, PIECE}
	protected Unite unite;
	
	public Produit(String nom, Unite unite){
		this.nom = nom;
		this.unite = unite;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public String DescProduit() {
		return nom;}
	
	@Override
	public int calculerPrix(int prixD){
		return prixD;
	}
}
