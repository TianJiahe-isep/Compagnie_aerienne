package fr.isep.ji;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Tester Personne
        System.out.println("=== Tester Personne ===");
        Personne personne = new Personne(1, "Jean Dupont", "10 rue des Lilas, Paris", "jean.dupont@gmail.com");
        personne.obtenirInfos();

        // Tester Passager
        System.out.println("\n=== Tester Passager ===");
        Passager passager = new Passager(2, "Marie Curie", "20 avenue Einstein, Lyon", "marie.curie@gmail.com", "P123456789");
        passager.obtenirInfos();
        passager.reserverVol();
        passager.annulerReservation();
        passager.obtenirReservations();

        //Tester Employe
        System.out.println("\n=== Tester Employe ===");
        Employe employe = new Employe(3, "Paul Martin", "30 boulevard Newton, Marseille", "paul.martin@gmail.com");
        employe.obtenirInfos();
        System.out.println("Numéro Employé: " + employe.getNumeroEmploye());
        System.out.println("Date d'Embauche: " + employe.getDateEmbauche());
        System.out.println("Rôle: " + employe.obtenirRole());

        // Tester Pilote
        System.out.println("\n=== Tester Pilote ===");
        Pilote pilote = new Pilote(4, "Charles Lindbergh", "50 rue de l'Aviation, Toulouse", "charles.lindbergh@gmail.com", 2001, "2015-06-20", "LIC12345", 5000);
        pilote.obtenirInfos();
        System.out.println("Licence: " + pilote.getLicence());
        System.out.println("Heures de Vol: " + pilote.getHeuresDeVol());
        pilote.affecterVol();
        pilote.obtenirVol();

        // Tester PersonnelCabine
        System.out.println("\n=== Tester PersonnelCabine ===");
        PersonnelCabine personnelCabine = new PersonnelCabine(5, "Alice Steward", "60 chemin des Équipages, Bordeaux", "alice.steward@gmail.com", 3001, "2018-09-10", "Qualification A");
        personnelCabine.obtenirInfos();
        System.out.println("Qualification: " + personnelCabine.getQualification());
        personnelCabine.affecterVol();
        personnelCabine.obtenirVol();
    }
    }
}