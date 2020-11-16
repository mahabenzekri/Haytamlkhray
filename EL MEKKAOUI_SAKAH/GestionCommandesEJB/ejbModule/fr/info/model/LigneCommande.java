package fr.info.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(schema="gestioncommande", name="lignecommade")
public class LigneCommande implements Serializable {

	private String id;
	private String code;
	private String designation;
	private int qantit�;
	private int prixUnitaire;
	private Commande commande;
	

	@Id
	@GeneratedValue
	@Column(name="pk_commande")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@ManyToOne
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	@Column(name="code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="designation")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name="qte")
	public int getQantit�() {
		return qantit�;
	}
	public void setQantit�(int qantit�) {
		this.qantit� = qantit�;
	}
	@Column(name="prixU")
	public int getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	
}
