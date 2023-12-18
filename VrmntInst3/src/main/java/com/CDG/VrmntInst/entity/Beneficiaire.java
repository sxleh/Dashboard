package com.CDG.VrmntInst.entity;

import java.math.BigInteger;

import jakarta.persistence.*;

@Entity
@Table(name = "beneficiaire")
public class Beneficiaire {

    @Id
    @Column(name = "idBeneficiaire")
    private BigInteger id;

    @Column(name = "Adresse")
    private String adresse;
    
    @Column(name = "intitule")
    private String intitule;
    
    @Column(name = "nom_affaire")
    private String nom;
    
    @Column(name = "Code_banque")
    private String codeBanque;
    
    @Column(name = "RIB")
    private String rib;
    
    @Column(name = "CIN_RC")
    private String cin_rc;

    @ManyToOne
    @JoinColumn(name="idClient", nullable=false)
    private Client client;

	public BigInteger getId() {
		return id;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getIntitule() {
		return intitule;
	}

	public String getNom() {
		return nom;
	}

	public String getCodeBanque() {
		return codeBanque;
	}

	public String getRib() {
		return rib;
	}

	public String getCin_rc() {
		return cin_rc;
	}

	public Client getClient() {
		return client;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCodeBanque(String codeBanque) {
		this.codeBanque = codeBanque;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public void setCin_rc(String cin_rc) {
		this.cin_rc = cin_rc;
	}

	public void setClient(Client client) {
		this.client = client;
	}

    
    

}
