package fr.isep.ji;

public class Personne {

    private int identifiant; //身份证号
    private String nom; //姓名
    private String adresse; //地址
    private String contact; //邮箱或电话

    public Personne(int identifiant, String nom, String adresse, String contact){
        this.identifiant = identifiant ;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }


//getter et setter
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

//fonction
    public void obtenirInfos(){
        System.out.println("Identifiant :"+this.identifiant);
        System.out.println("Nom :"+this.nom);
        System.out.println("Adresse :"+this.adresse);
        System.out.println("Contact :"+this.contact);
    }
}
