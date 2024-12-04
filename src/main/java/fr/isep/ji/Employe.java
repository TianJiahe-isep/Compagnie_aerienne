package fr.isep.ji;

public class Employe extends Personne{
    private int NumeroEmploye; //工号
    private String DateEmbauche; //雇用日期

    public Employe(int identifiant, String nom, String adresse,String contact, int numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.NumeroEmploye = numeroEmploye;
        this.DateEmbauche = dateEmbauche;
    }

    public int getNumeroEmploye() {
        return NumeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
        this.NumeroEmploye = numeroEmploye;
    }

    public String getDateEmbauche() {
        return DateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.DateEmbauche = dateEmbauche;
    }

//fonctions
    public String obtenirRole(Employe employe){
        if (this instanceof Pilote) {
            return "Pilote";
        } else if (this instanceof PersonnelCabine) {
            return "Personnel de Cabine";
        } else {
            return "Inconnu";
        }
    }

}
