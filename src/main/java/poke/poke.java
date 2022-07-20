/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poke;

import java.util.Date;

/**
 *
 * @author phana
 */
public class poke {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            // Création d'un objet Employe
            Produit prod1 = new Produit();
            prod1.setIdProduit(1);
            prod1.setRefProduit("5fe85");
            prod1.setDesignationProd("chaise");
            prod1.setPrixVenteUHT(29.99);



                Fournisseur four1 = new Fournisseur(1, "La prairie", "f5zf4");
                System.out.println("Fournisseur n° "+ four1.getIdFournisseur()+",  "+four1.getNomFourn()+", raison social : "+four1.getRsFour());

                Commande cmd1 = new Commande(1, new Date(), 26.79);
                System.out.println("Commande n° : "+cmd1.getIdCmd()+", "+cmd1.getDateCmd()+", livraison : "+cmd1.getFraisPortCmd()+"€");


                System.out.println("Produit n °"+prod1.getIdProduit()+", ref :"+prod1.getRefProduit()+","+prod1.getDesignationProd()+":"+prod1.getPrixVenteUHT()+"€");
                System.out.println("Le nombre de produit : "+Produit.getCompteur());




                Fournisseur four2 = new Fournisseur();
                four2.setIdFournisseur(2);
                four2.setNomFourn("La ferme");
                four2.setRsFour("5de41");
                System.out.println("Fournisseur n° "+ four2.getIdFournisseur()+",  "+four2.getNomFourn()+", raison social : "+four2.getRsFour());

                Commande cmd2 = new Commande(2, new Date(), 34.79);
                System.out.println("Commande n° : "+cmd2.getIdCmd()+", "+cmd2.getDateCmd()+", livraison : "+cmd2.getFraisPortCmd()+"€");

                Produit prod2 = new Produit(2, "7fe87", "table basse", 79.99);
                System.out.println("Produit n °"+prod2.getIdProduit()+", ref :"+prod2.getRefProduit()+","+prod2.getDesignationProd()+":"+prod2.getPrixVenteUHT()+"€");
                System.out.println("Le nombre de produit : "+Produit.getCompteur());

                Produit prod3 = new Produit(3, "4dzd4", "commode", 179.99);
                System.out.println("Produit n °"+prod3.getIdProduit()+", ref :"+prod3.getRefProduit()+","+prod3.getDesignationProd()+":"+prod3.getPrixVenteUHT()+"€");
                System.out.println("Le nombre de produit : "+Produit.getCompteur());

                Produit prod4 = new Produit(4, "6dzd6", "table", 379.99);
                System.out.println("Produit n °"+prod4.getIdProduit()+", ref :"+prod4.getRefProduit()+","+prod4.getDesignationProd()+":"+prod4.getPrixVenteUHT()+"€");
                System.out.println("Le nombre de produit : "+Produit.getCompteur());

                Produit prod5 = new Produit(5, "544d7","lampe", 19.99);
                System.out.println(prod5.afficher());
                
                Commande cmd3 = new Commande(3);
                System.out.println(cmd3.afficher());

                Commande cmd4 = new Commande(4, new Date(), 99.99);
                System.out.println(cmd4.afficher());
            
                Fournisseur four3 = new Fournisseur(3, "Le Champs", "h4sm4", "12 avenue de la foucatchella");
                System.out.println(four3.afficher());
                
                Fournisseur four4= new Fournisseur(4, "La Forêt");
                System.out.println(four4.afficher());
                
                LigneCmd ldm1= new LigneCmd(1, 5, 12.5, new Date());
                System.out.println(ldm1.afficher());
                
                Commande cmd5 = new Commande(5, 99.2); //affiche null dans la date
                System.out.println(cmd5.afficher());
                
                Commande cmd6 = new Commande(6, 99.2); //n'affiche pas la date
                System.out.println(cmd5.afficher2());
    }
    
}
