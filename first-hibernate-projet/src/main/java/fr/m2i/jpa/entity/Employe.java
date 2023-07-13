package main.java.fr.m2i.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table @Entity
public class Employe extends Personne{

	@Column(name = "numero_employe")
	private int numeroEmploye;
	
	private String fonction;
	
	private float salaire;

	public int getNumeroEmploye() {
		return numeroEmploye;
	}

	public void setNumeroEmploye(int numeroEmploye) {
		this.numeroEmploye = numeroEmploye;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public Employe() {
		super();
	}

	@Override
	public String toString() {
		return "Employe [numeroEmploye=" + numeroEmploye + ", fonction=" + fonction + ", salaire=" + salaire
				+ ", getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getAdresse()="
				+ getAdresse() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
