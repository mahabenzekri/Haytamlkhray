package fr.info.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.info.model.Categorie;
import fr.info.model.Client;
import fr.info.model.Produit;

/**
 * Session Bean implementation class accesCatalogueBean
 */

@LocalBean
@Stateless(name="HelloJNDI")
public class accesCatalogueBean implements accesCatalogueBeanRemote {

	@PersistenceContext(unitName="managerBoutique")
	EntityManager mh ;

    /**
     * Default constructor. 
     */
    public accesCatalogueBean() {
       
    }

	@Override
	public List<Categorie> getListCategories() {
		CriteriaBuilder cb = mh.getCriteriaBuilder();
        CriteriaQuery<Categorie> cq = cb.createQuery(Categorie.class);
        Root<Categorie> rootEntry = cq.from(Categorie.class);
        CriteriaQuery<Categorie> all = cq.select(rootEntry);
        TypedQuery<Categorie> allQuery = mh.createQuery(all);
        return allQuery.getResultList();
	}

	@Override
	public List<Produit> getListProduits(int id) {
		CriteriaBuilder cb = mh.getCriteriaBuilder();
        CriteriaQuery<Produit> cq = cb.createQuery(Produit.class);
        Root<Produit> rootEntry = cq.from(Produit.class);
        CriteriaQuery<Produit> all = cq.select(rootEntry).where(cb.equal(rootEntry.get("categorie"),id));
        TypedQuery<Produit> allQuery = mh.createQuery(all);
        return allQuery.getResultList();
		
	}

	@Override
	public void test() {
		 System.out.println("BONJOUUUUUUUUUUUUUUUUUUUUUUUUR");
	}

	@Override
	public void persistCategorie(Categorie cat) {
		mh.persist(cat);		
	}

	@Override
	public Produit getProduitbyID(int id) {
		Object p= mh.find(Produit.class, id);
		return (Produit) p;
		
	}

	@Override
	public Client getClientbyID(int id) {
		
		Object p= mh.find(Client.class, id);
		return (Client) p;
	}

	@Override
	public String getClientbyLogin(String login) {
		
		javax.persistence.Query q =  mh.createQuery("select h.login from Client h where h.login=:login").setParameter("login", login);
    	try {
    		String helloBean = (String)((javax.persistence.Query) q).getSingleResult();
        	return helloBean;
    	} catch (javax.persistence.NoResultException e) {
    		return "unregistered";
    	}
	
	}

	@Override
	public void persistClient(Client client) {
		mh.persist(client);
		
	}

	
	

}
