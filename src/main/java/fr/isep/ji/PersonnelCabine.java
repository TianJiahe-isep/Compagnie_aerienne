package fr.isep.ji;

public class PersonnelCabine extends Employe {

    private String qualification;

    public PersonnelCabine(int identifiant, String nom, String adresse, String contact) {
        super(identifiant, nom, adresse, contact);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


}
