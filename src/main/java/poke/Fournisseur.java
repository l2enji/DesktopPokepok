/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke;

/**
 *
 * @author phana
 */
public class Fournisseur {
    private int idFournisseur;
    private String nomFourn;
    private String rsFour;
    private String adresseFour;
    private String cpFour;
    private String villeFour;
    private String paysFour;
    private String telFour;
    private String faxFour;
    private String emailFour;

    //Le constructeur sans paramètres appelle le constructeur à un paramètre
   public Fournisseur(){
       this(0);
   } 
   
    //Le constructeur à un paramètre appelle le constructeur à 2 paramètres
   public Fournisseur(int id){
      this(id, "");
   }
   
    //Le constructeur à 2 paramètres appelle le constructeur à 3 paramètres
   public Fournisseur(int id, String nom){
       this(id, nom, "");
   }
     //Le constructeur à 3 paramètres appelle le constructeur à 4 paramètres
    public Fournisseur(int id, String nom, String rs) {
        this(id, nom, rs, "");
    }
    //Le constructeur à 4 paramètres appelle le constructeur à 5 paramètres
    public Fournisseur(int id, String nom, String rs, String adresse){
        this(id, nom, rs, adresse,"");
    }
      //Le constructeur à 5 paramètres appelle le constructeur à 6 paramètres
    public Fournisseur(int id, String nom, String rs, String adresse, String cp){
        this(id, nom, rs, adresse, cp,"");
    }
    
    public Fournisseur(int id, String nom, String rs, String adresse, String cp, String ville) {
        this.idFournisseur = id;
        this.nomFourn = nom;
        this.rsFour = rs;
        this.adresseFour = adresse;
        this.cpFour = cp;
        this.villeFour = ville;
    }

    
    /**
     * @return the idFournisseurt
     */
    public int getIdFournisseur() {
        return idFournisseur;
    }

    /**
     * @param idFournisseur the idFournisseurt to set
     */
    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    /**
     * @return the nomFourn
     */
    public String getNomFourn() {
        return nomFourn;
    }

    /**
     * @param nomFourn the nomFourn to set
     */
    public void setNomFourn(String nomFourn) {
        this.nomFourn = nomFourn;
    }

    /**
     * @return the rsFour
     */
    public String getRsFour() {
        return rsFour;
    }

    /**
     * @param rsFour the rsFour to set
     */
    public void setRsFour(String rsFour) {
        this.rsFour = rsFour;
    }

    /**
     * @return the adresseFour
     */
    public String getAdresseFour() {
        return adresseFour;
    }

    /**
     * @param adresseFour the adresseFour to set
     */
    public void setAdresseFour(String adresseFour) {
        this.adresseFour = adresseFour;
    }

    /**
     * @return the cpFour
     */
    public String getCpFour() {
        return cpFour;
    }

    /**
     * @param cpFour the cpFour to set
     */
    public void setCpFour(String cpFour) {
        this.cpFour = cpFour;
    }

    /**
     * @return the villeFour
     */
    public String getVilleFour() {
        return villeFour;
    }

    /**
     * @param villeFour the villeFour to set
     */
    public void setVilleFour(String villeFour) {
        this.villeFour = villeFour;
    }

    /**
     * @return the paysFour
     */
    public String getPaysFour() {
        return paysFour;
    }

    /**
     * @param paysFour the paysFour to set
     */
    public void setPaysFour(String paysFour) {
        this.paysFour = paysFour;
    }

    /**
     * @return the telFour
     */
    public String getTelFour() {
        return telFour;
    }

    /**
     * @param telFour the telFour to set
     */
    public void setTelFour(String telFour) {
        this.telFour = telFour;
    }

    /**
     * @return the faxFour
     */
    public String getFaxFour() {
        return faxFour;
    }

    /**
     * @param faxFour the faxFour to set
     */
    public void setFaxFour(String faxFour) {
        this.faxFour = faxFour;
    }

    /**
     * @return the emailFour
     */
    public String getEmailFour() {
        return emailFour;
    }

    /**
     * @param emailFour the emailFour to set
     */
    public void setEmailFour(String emailFour) {
        this.emailFour = emailFour;
    }
    
    public String afficher() {
        return "Fournisseur n° "+idFournisseur+", nom : "+nomFourn+", rs : "+rsFour+", adresse : "+adresseFour+" "+cpFour+" "+villeFour+" "+paysFour;
    }
    
}

    
   
