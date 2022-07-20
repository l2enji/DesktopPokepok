/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke;

/**
 *
 * @author phana
 */
public class Produit {
    private int idProduit;
    private String refProduit;
    private String designationProd;
    private Double prixVenteUHT;
    private static int compteur = 0;
    
 //Constructeur  //Le constructeur sans paramètres appelle le constructeur à un paramètre
 Produit(){
    this(0);
    compteur ++;
}
  //Le constructeur à un paramètre appelle le constructeur à deux paramètres
 Produit(int id){
     this (id, "inconnue");
     compteur ++;
 }
 //Le constructeur à 2 paramètre appelle le constructeur à 3 paramètres
 Produit(int id, String ref){
     this (id, "inconnue", "inconnue");
     compteur ++;
 }
 //Le constructeur à 3 paramètres appelle le constructeur à 4 paramètres    
 Produit (int id, String ref, String design){
    this (id, "inconnue", "inconnue", 0.0);
    compteur ++;
 }
  //Le constructeur à 4 paramètres
 Produit(int id, String ref, String design, Double pvuht){
    idProduit = id;
    refProduit = ref;
    designationProd = design;
    prixVenteUHT = pvuht;

    compteur++;
 }
    
 
    /**
     * @return the idProduit
     */
    public int getIdProduit() {
        return idProduit;
    }

    /**
     * @param idProduit the idProduit to set
     */
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    /**
     * @return the refProduit
     */
    public String getRefProduit() {
        return refProduit;
    }

    /**
     * @param refProduit the refProduit to set
     */
    public void setRefProduit(String refProduit) {
        this.refProduit = refProduit;
    }

    /**
     * @return the designationProd
     */
    public String getDesignationProd() {
        return designationProd;
    }

    /**
     * @param designationProd the designationProd to set
     */
    public void setDesignationProd(String designationProd) {
        this.designationProd = designationProd;
    }

    /**
     * @return the prixVenteUHT
     */
    public Double getPrixVenteUHT() {
        return prixVenteUHT;
    }

    /**
     * @param prixVenteUHT the prixVenteUHT to set
     */
    public void setPrixVenteUHT(Double prixVenteUHT) {
        this.prixVenteUHT = prixVenteUHT;
    }

    /**
     * @return the compteur
     */
    public static int getCompteur() {
        return compteur;
    }

    /**
     * @param aCompteur the compteur to set
     */
    public static void setCompteur(int aCompteur) {
        compteur = aCompteur;
    }

    public String afficher() {
        return "Produit n °"+this.idProduit+", ref : "+this.refProduit+", "+this.designationProd+", "+this.prixVenteUHT+"€";
    }
    

}
