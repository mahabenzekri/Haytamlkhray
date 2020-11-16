package fr.info.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(schema="gestioncommande", name="commande")
public class Commande implements Serializable {

	private String id;
	private String numero;
	private Collection<LigneCommande> lignesCommande ;
	

	@Id
	@GeneratedValue
	@Column(name="pk_ligneCommande")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="numero")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@OneToMany
	public Collection<LigneCommande> getLignesCommande() {
		return lignesCommande;
	}

	public void setLignesCommande(Collection<LigneCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}
	
	

}
