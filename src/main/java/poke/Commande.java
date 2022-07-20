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
public class Commande {
    private int idCmd;
    private Date dateCmd;
    private double fraisPortCmd;
 //Le constructeur sans paramètres appelle le constructeur à un paramètre
    public Commande() {
        this(0);
    }
 //Le constructeur à un paramètre appelle le constructeur à 2 paramètres
    public Commande(int idCmd) {
        this(idCmd, new Date());
    }
//Le constructeur à 2 paramètres appelle le constructeur à 3 paramètres    
    public Commande(int idCmd, Date dateCmd) {
        this(idCmd, new Date(), 0);
    }
    
      public Commande(int idCmd, double fraisPortCmd) {
        this.idCmd = idCmd;
        this.fraisPortCmd = fraisPortCmd;
    }
//Le constructeur à 3 paramètres     
    public Commande(int idCmd, Date dateCmd, double fraisPortCmd) {
        this.idCmd = idCmd;
        this.dateCmd = new Date();
        this.fraisPortCmd = fraisPortCmd;
    }

    
    /**
     * @return the idCmd
     */
    public int getIdCmd() {
        return idCmd;
    }

    /**
     * @param idCmd the idCmd to set
     */
    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    /**
     * @return the dateCmd
     */
    public Date getDateCmd() {
        return dateCmd;
    }

    /**
     * @param dateCmd the dateCmd to set
     */
    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    /**
     * @return the fraisPortCmd
     */
    public double getFraisPortCmd() {
        return fraisPortCmd;
    }

    /**
     * @param fraisPortCmd the fraisPortCmd to set
     */
    public void setFraisPortCmd(double fraisPortCmd) {
        this.fraisPortCmd = fraisPortCmd;
    }
    public String afficher() {
        return "Commande n° : "+idCmd+", "+dateCmd+", livraison : "+fraisPortCmd+"€";
    }
    
    //Pour afficher une commande sans date, il faut créer ue nouvelle méthode affiche

    
    public String afficher2() {
        return "Commande{" + "idCmd=" + idCmd +  ", fraisPortCmd=" + fraisPortCmd + '}';
    }
    
    
}
