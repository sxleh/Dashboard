package com.CDG.VrmntInst.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "racine")
    private int racine;

    @Column(name = "Nom")
    private String Nom;

    @Column(name = "Prenom")
    private String Prenom;

    @Column(name = "idClient")
    private String idClient;
    
    @Column(name = "fonction")
    private String fonction;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "adresse")
    private String adresse;

    @Column(name = "num")
    private String num;

    @Column(name = "date_entree_relation")
    private Date DateEntreeRelation;
    
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Compte> comptes;


    

	public int getRacine() {
		return racine;
	}

	public String getPrenom() {
		return Prenom;
	}

	public String getNom() {
		return Nom;
	}

	public String getIdClient() {
		return idClient;
	}

	public String getFonction() {
		return fonction;
	}

	public int getAge() {
		return age;
	}

	public String getNum() {
		return num;
	}

	public String getAdresse() {
		return adresse;
	}

	public Date getDateEntreeRelation() {
		return DateEntreeRelation;
	}

	public void setRacine(int racine) {
		this.racine = racine;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setDateEntreeRelation(Date dateEntreeRelation) {
		DateEntreeRelation = dateEntreeRelation;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	
	
	
}
