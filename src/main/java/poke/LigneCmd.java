/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poke;

import java.util.Date;

/**
 *
 * @author phana
 */
public class LigneCmd {
    private int numLigneCmd;
    private int qteLigneCmd;
    private Date dateLivrLigneCmd;
    private double prixUHTLigneCmd;

    public LigneCmd(){
        this(0);
    }
    
    public LigneCmd(int num){
        this(num, 0);
    }
    
    public LigneCmd(int num, int qte){
        this(num, qte, 0.0);
    }
    
    public LigneCmd(int num, int qte, double prixUHTLC){
        this(num, qte, prixUHTLC, new Date());
    }
    public LigneCmd(int num, int qte, double prixUHTLC, Date dateLivrLigneCmd) {
        this.numLigneCmd = num;
        this.qteLigneCmd = qte;
        this.prixUHTLigneCmd = prixUHTLC;
        this.dateLivrLigneCmd = new Date ();
    }



    /**
     * @return the numLigneCmd
     */
    public int getNumLigneCmd() {
        return numLigneCmd;
    }

    /**
     * @param numLigneCmd the numLigneCmd to set
     */
    public void setNumLigneCmd(int numLigneCmd) {
        this.numLigneCmd = numLigneCmd;
    }

    /**
     * @return the qteLigneCmd
     */
    public int getQteLigneCmd() {
        return qteLigneCmd;
    }

    /**
     * @param qteLigneCmd the qteLigneCmd to set
     */
    public void setQteLigneCmd(int qteLigneCmd) {
        this.qteLigneCmd = qteLigneCmd;
    }

    /**
     * @return the dateLivrLigneCmd
     */
    public Date getDateLivrLigneCmd() {
        return dateLivrLigneCmd;
    }

    /**
     * @param dateLivrLigneCmd the dateLivrLigneCmd to set
     */
    public void setDateLivrLigneCmd(Date dateLivrLigneCmd) {
        this.dateLivrLigneCmd = dateLivrLigneCmd;
    }

    /**
     * @return the prixUHTLigneCmd
     */
    public double getPrixUHTLigneCmd() {
        return prixUHTLigneCmd;
    }

    /**
     * @param prixUHTLigneCmd the prixUHTLigneCmd to set
     */
    public void setPrixUHTLigneCmd(double prixUHTLigneCmd) {
        this.prixUHTLigneCmd = prixUHTLigneCmd;
    }
    
       public String afficher() {
        return "n ° Ligne : "+numLigneCmd+", quantité : "+qteLigneCmd+", prix unitaire :"+prixUHTLigneCmd+"€ , date livraison : "+dateLivrLigneCmd;
    }
    
}
