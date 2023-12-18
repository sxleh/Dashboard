package com.CDG.VrmntInst.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "opret")
public class Opret {

    @Id
    @Column(name = "Reference")
    private String reference;
    
    @Column(name = "Code_Operation")
    private int code;
    
    @Column(name = "Intitule")
    private String intitule;

    @Column(name = "RefOrigine")
    private String refOrigine;
    
    @Column(name = "client_Emetteur")
    private String clientEmetteur;
    
    @Column(name = "Code_Banque_Emettrice")
    private String codeBanqueEmettrice;
    
    @ManyToOne
    @JoinColumn(name="Client_Beneficiaire", nullable=false)
    private Compte clientBeneficiaire;

    @Column(name = "Code_Banque_Receptrice")
    private String codeBanqueReceptrice;

    @Column(name = "Date_Operation")
    private Date dateOperation;
    
    @Column(name = "Date_Comptable")
    private Date dateComptable;
    
    @Column(name = "Date_Valeur")
    private Date dateValeur;
    
    @Column(name = "Montant")
    private float montant;
    
    @Column(name = "Devise")
    private String devise;

    @Column(name = "Motif")
    private String motif;
    
    @Column(name="Status")
    private int Status;
    
    @Column(name="reponse")
    private String reponse;
    
    @Column(name="CodeRejet")
    private String codeR;
    
    @Column(name="MotifRejet")
    private String motifR;
    
    @ManyToOne
    @JoinColumn(name="Utilisateur", nullable=false)
    private Gestionnaire utilisateur;

	public String getReference() {
		return reference;
	}

	public int getCode() {
		return code;
	}

	public String getIntitule() {
		return intitule;
	}

	public String getRefOrigine() {
		return refOrigine;
	}

	public String getClientEmetteur() {
		return clientEmetteur;
	}

	public String getCodeBanqueEmettrice() {
		return codeBanqueEmettrice;
	}

	public Compte getClientBeneficiaire() {
		return clientBeneficiaire;
	}

	public String getCodeBanqueReceptrice() {
		return codeBanqueReceptrice;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public Date getDateComptable() {
		return dateComptable;
	}

	public Date getDateValeur() {
		return dateValeur;
	}

	public float getMontant() {
		return montant;
	}

	public String getDevise() {
		return devise;
	}

	public String getMotif() {
		return motif;
	}

	public int getStatus() {
		return Status;
	}

	public String getReponse() {
		return reponse;
	}

	public String getCodeR() {
		return codeR;
	}

	public String getMotifR() {
		return motifR;
	}

	public Gestionnaire getUtilisateur() {
		return utilisateur;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public void setRefOrigine(String refOrigine) {
		this.refOrigine = refOrigine;
	}

	public void setClientEmetteur(String clientEmetteur) {
		this.clientEmetteur = clientEmetteur;
	}

	public void setCodeBanqueEmettrice(String codeBanqueEmettrice) {
		this.codeBanqueEmettrice = codeBanqueEmettrice;
	}

	public void setClientBeneficiaire(Compte clientBeneficiaire) {
		this.clientBeneficiaire = clientBeneficiaire;
	}

	public void setCodeBanqueReceptrice(String codeBanqueReceptrice) {
		this.codeBanqueReceptrice = codeBanqueReceptrice;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public void setDateComptable(Date dateComptable) {
		this.dateComptable = dateComptable;
	}

	public void setDateValeur(Date dateValeur) {
		this.dateValeur = dateValeur;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public void setCodeR(String codeR) {
		this.codeR = codeR;
	}

	public void setMotifR(String motifR) {
		this.motifR = motifR;
	}

	public void setUtilisateur(Gestionnaire utilisateur) {
		this.utilisateur = utilisateur;
	}
    
	
}
