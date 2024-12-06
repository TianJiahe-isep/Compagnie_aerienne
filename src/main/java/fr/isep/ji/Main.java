package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aeroport aeroportDepart = new Aeroport("CDG", "Paris", "Aéroport Charles de Gaulle");
        Aeroport aeroportArrivee = new Aeroport("NCE", "Nice", "Aéroport Nice Côte d'Azur");

        // Création des avions
        Avion avion1 = new Avion("FR123", "Airbus A320", 180);
        Avion avion2 = new Avion("FR456", "Airbus A350", 300);
        List<Avion> avionsDisponibles = new ArrayList<>();
        avionsDisponibles.add(avion1);
        avionsDisponibles.add(avion2);

        // Création d'un vol
        Vol vol1 = new Vol(101, "Paris", "Nice", "2024-12-15T09:00", "2024-12-15T10:30", "En attente", aeroportDepart, aeroportArrivee);
        aeroportDepart.affecterVol(vol1, true);

        // Affectation d'un avion au vol
        avion1.affecterVol(vol1, avionsDisponibles);

        // Création des employés
        Pilote pilote = new Pilote(1, "Jean Dupont", "12 Rue Lafayette", "jean.dupont@mail.fr", 201, "2015-01-01", "FRA123", 4500);
        PersonnelCabine personnelCabine = new PersonnelCabine(2, "Marie Curie", "34 Boulevard Haussmann", "marie.curie@mail.fr", 202, "2018-03-15", "Spécialiste de la sécurité");

        // Affectation du personnel au vol
        vol1.setPilote(pilote);
        vol1.getEquipeCabine().add(personnelCabine);

        // Création d'un passager et réservation d'un vol
        Passager passager = new Passager(3, "Jacques Martin", "56 Avenue des Champs-Élysées", "jacques.martin@mail.fr", "FR987654");
        passager.reserverVol(1, "2024-12-01", "Confirmée", vol1);

        // Affichage des informations du vol
        System.out.println("=== Informations du vol ===");
        System.out.println("Numéro du vol: " + vol1.getNumeroVol());
        System.out.println("Origine: " + vol1.getOrigine());
        System.out.println("Destination: " + vol1.getDestination());
        System.out.println("Pilote: " + vol1.getPilote().getNom());
        System.out.println("Équipe de cabine: " + vol1.getEquipeCabine().get(0).getNom());
        System.out.println("Avion assigné: " + vol1.getAvion().getModele());
        System.out.println("Statut: " + vol1.getEtat());

        // Annulation de la réservation
        System.out.println("\n=== Annulation de la réservation ===");
        passager.annulerReservation(1);

        // Modification des informations du vol
        System.out.println("\n=== Modification du vol ===");
        vol1.modifierVol("Paris", "Marseille");
        System.out.println("Nouvelle destination: " + vol1.getDestination());
    }

}