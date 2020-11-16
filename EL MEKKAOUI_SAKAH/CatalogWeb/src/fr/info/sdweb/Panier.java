package fr.info.sdweb;

import java.util.ArrayList;
import java.util.List;

import fr.info.model.Produit;

public class Panier {

	private Produit produit;
	private List<Produit> produits = new ArrayList<Produit>();
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Panier() {
		super();
	}
	@Override
	public String toString() {
		return "Panier [produit=" + produit + "]";
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	public void ajout(Produit p) {
		 
    	produits.add(produit);
    }
    public void supp(Produit p) {
    	produits.remove(produit);
    }
}
