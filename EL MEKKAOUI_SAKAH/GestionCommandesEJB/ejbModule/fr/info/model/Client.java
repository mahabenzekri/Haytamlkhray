package fr.info.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema="gestioncommande", name="client")
public class Client implements Serializable {

	private int id;
	private String login;
	private String pwd;
	
	@Id
	@GeneratedValue
	@Column(name="pk_idClient")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="login")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Column(name="pwd")
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", login=" + login + ", pwd=" + pwd + "]";
	}



}
