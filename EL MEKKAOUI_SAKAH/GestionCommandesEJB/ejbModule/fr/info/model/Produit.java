package fr.info.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(schema="gestioncommande", name="produit")
public class Produit implements Serializable {

	private int id;
	private String nom;
	private String prix;
	private String description;
	private String dernier_map;
	private Categorie categorie;
	
	@Id
	@GeneratedValue
	@Column(name="pk_produit")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="nom")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Column(name="prix")
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="date_map")
	public String getDernier_map() {
		return dernier_map;
	}
	public void setDernier_map(String dernier_map) {
		this.dernier_map = dernier_map;
	}
	
	@ManyToOne
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", description=" + description
				+ ", dernier_map=" + dernier_map + ", categorie=" + categorie + "]";
	}
	
	
	
}
