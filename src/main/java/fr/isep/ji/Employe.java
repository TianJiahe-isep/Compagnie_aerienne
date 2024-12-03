package fr.isep.ji;

public class Employe extends Personne{
    private int NumeroEmploye;
    private int DateEmbauche;

    public void obtenirRole(Employe e){
        if(e.getIdentifiant()) {
            return Pilote;
        }
        else if(e.getIdentifiant()...){
            return PersonnelCabine;
        }
    }
}
