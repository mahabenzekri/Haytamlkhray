package fr.info.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

import fr.info.model.Categorie;
import fr.info.model.Client;
import fr.info.model.Produit;

@Remote
public interface accesCatalogueBeanRemote {

	public void test();
	public List<Categorie> getListCategories();
	public List<Produit> getListProduits(int id);
	public void persistCategorie(Categorie cat);
	public Produit getProduitbyID(int id);
	
	public Client getClientbyID(int id);
	public String  getClientbyLogin(String login);
	public void persistClient(Client client);
}
