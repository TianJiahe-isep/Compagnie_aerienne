package fr.isep.ji;

public class PersonnelCabine extends Employe {

    private String qualification;

    public PersonnelCabine(int identifiant, String nom, String adresse, String contact,String qualification) {
        super(identifiant, nom, adresse, contact);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void affecterVol() {
        System.out.println("Vol affecté au personnel de cabine.");
    }

    public void obtenirVol() {
        System.out.println("Vols assignés au personnel de cabine.");
    }

}
