package fr.isep.ji;

public class Employe extends Personne{
    private int NumeroEmploye;
    private String DateEmbauche;

    public Employe( int identifiant, String nom, String adresse, String contact) {
        super(identifiant, nom, adresse, contact);
        this.NumeroEmploye = NumeroEmploye;
        this.DateEmbauche = DateEmbauche;
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
