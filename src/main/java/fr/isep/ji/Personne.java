package fr.isep.ji;

public class Personne {

    int identifiant;
    String nom;
    String adresse;
    String contact;

    public Personne(int identifiant,String nom, String adresse,String contact){
        this.identifiant = identifiant ;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public void obtenirInfos(){
        System.out.println(this.identifiant);
        System.out.println(this.nom);
        System.out.println(this.adresse);
        System.out.println(this.contact);
    }

}