package produit;

public class Poisson extends Produit{
	private static String nom = "poisson";
	private static Unite unite;
	private String date;
	
	
	public Poisson(String date) {
		super(nom, unite);
		this.date = date;
		this.unite = unite.PIECE;
	}

	public void DescProduit() {
		System.out.println(nom + " pêchés " + date);
	}

}
