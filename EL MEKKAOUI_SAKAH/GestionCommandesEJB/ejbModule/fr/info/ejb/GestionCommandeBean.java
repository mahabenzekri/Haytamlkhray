package fr.info.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.info.model.Categorie;
import fr.info.model.Commande;

/**
 * Session Bean implementation class GestionCommandeBean
 */
@Stateless(name="Hello")
@LocalBean
public class GestionCommandeBean implements GestionCommandeBeanRemote {
	@PersistenceContext(unitName="managerBoutique")
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionCommandeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Commande createCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> gererCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validerCommande(Commande c) {
		// TODO Auto-generated method stub
		
	}

}
