package fr.info.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.Table;

import fr.info.model.Categorie;
import fr.info.model.Commande;


public interface GestionCommandeBeanRemote {

	
	public Commande createCommande();
	public List<Categorie> gererCommande();
	public void validerCommande(Commande c);
	
}
