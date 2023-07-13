package main.java.fr.m2i.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table @Entity
public class Etudiant extends Personne{
	
	@Column(name = "numero_etudiant")
	private int numeroEtudiant;

	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public Etudiant() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "Etudiant [numeroEtudiant=" + numeroEtudiant + "]";
	}


	
	
}
