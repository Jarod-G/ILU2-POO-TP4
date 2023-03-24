package produit;


public abstract class Produit {
	private String nom;
	public enum Unite {LITRE, GRAMME, KILOGRAMME, CENTILITRE, MILLILITRE, PIECE}
	protected Unite unite;
	
	public Produit(String nom, Unite unite){
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void DescProduit(Produit produit) {}
}
