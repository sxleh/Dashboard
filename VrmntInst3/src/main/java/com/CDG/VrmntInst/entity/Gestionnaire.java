package com.CDG.VrmntInst.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Gestionnaire")
public class Gestionnaire {

    @Id
    @Column(name = "idGest")
    private int idGest;

    @Column(name = "Succursale")
    private int succursale;

    @Column(name = "Ville")
    private String ville;

    @Column(name = "Prenom")
    private String prenom;

    @Column(name = "Nom")
    private String nom;

    
    
	public int getIdGest() {
		return idGest;
	}

	public int getSuccursale() {
		return succursale;
	}

	public String getVille() {
		return ville;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setIdGest(int idGest) {
		this.idGest = idGest;
	}

	public void setSuccursale(int succursale) {
		this.succursale = succursale;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

}
