package com.CDG.VrmntInst.entity;

import jakarta.persistence.*;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Compte")
public class Compte {

    @Id
    @Column(name = "Numero_de_compte")
    private String numCompte;

    @Column(name = "solde")
    private float solde;

    @Column(name = "Status_du_compte")
    private int status;
    
    @Column(name = "Nature_du_compte")
    private String nature;
    
    @Column(name = "intitule_du_compte")
    private String intitule;
    
    @Column(name = "RIB")
    private String rib;
    
    @Column(name = "date_ouverture_du_compte")
    private Date DateOverture;
    
    @ManyToOne
    @JoinColumn(name="racine", nullable=false)
    @JsonBackReference
    private Client client;
    
    @Transient
    private Integer clientRacine;

    
    @PostLoad
    void fillTransient() {
        if (client != null) {
            this.clientRacine = client.getRacine();
        }
    }
    
	public String getNumCompte() {
		return numCompte;
	}


	public float getSolde() {
		return solde;
	}

	public int getStatus() {
		return status;
	}

	public String getNature() {
		return nature;
	}

	public String getIntitule() {
		return intitule;
	}

	public Date getDateOverture() {
		return DateOverture;
	}

	public Client getClient() {
		return client;
	}


	public String getRib() {
		return rib;
	}


	public void setRib(String rib) {
		this.rib = rib;
	}


	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public void setNature(String nature) {
		this.nature = nature;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}


	public void setDateOverture(Date dateOverture) {
		DateOverture = dateOverture;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getClientRacine() {
		return clientRacine;
	}

	public void setClientRacine(Integer clientRacine) {
		this.clientRacine = clientRacine;
	}

    
}
