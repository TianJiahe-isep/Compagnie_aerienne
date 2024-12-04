package fr.isep.ji;

public class Pilote extends Employe {

    private String Licence;
    private int heuresDeVol;


    public Pilote(int identifiant, String nom, String adresse, String contact,int numeroEmploye,String dateEmbauche,String licence,int heuresDeVol) {
        super(identifiant, nom, adresse, contact,numeroEmploye,dateEmbauche);
        this.Licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public String getLicence() {
        return Licence;
    }

    public void setLicence(String licence) {
        Licence = licence;
    }

    public int getHeuresDeVol() {
        return heuresDeVol;
    }

    public void setHeuresDeVol(int heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }

    public void affecterVol() {
        System.out.println("Vol affecté au pilote.");
    }

    public void obtenirVol() {
        System.out.println("Vols assignés au pilote.");
    }
}
