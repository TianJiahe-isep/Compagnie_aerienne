package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aeroport aeroportDepart = new Aeroport("CDG", "Paris", "Charles de Gaulle Airport");
        Aeroport aeroportArrivee = new Aeroport("JFK", "New York", "John F. Kennedy International Airport");

        // Création des avions
        Avion avion1 = new Avion("AB123", "Boeing 737", 180);
        Avion avion2 = new Avion("CD456", "Airbus A320", 150);
        List<Avion> avionsDisponibles = new ArrayList<>();
        avionsDisponibles.add(avion1);
        avionsDisponibles.add(avion2);

        // Création d'un vol
        Vol vol1 = new Vol(101, "Paris", "New York", "2024-12-01T10:00", "2024-12-01T14:00", "En attente", aeroportDepart, aeroportArrivee);
        aeroportDepart.affecterVol(vol1, true);

        // Affectation d'un avion au vol
        avion1.affecterVol(vol1, avionsDisponibles);

        // Création des employés
        Pilote pilote = new Pilote(1, "Jean", "123 Rue Main", "jean@mail.com", 201, "2020-01-01", "P12345", 5000);
        PersonnelCabine personnelCabine = new PersonnelCabine(2, "Marie", "456 Rue Park", "marie@mail.com", 202, "2019-06-01", "Safety Specialist");

        // Affectation du pilote et du personnel au vol
        vol1.setPilote(pilote);
        vol1.getEquipeCabine().add(personnelCabine);

        // Création d'un passager et réservation d'un vol
        Passager passager = new Passager(3, "Alice", "789 Rue Ocean", "alice@mail.com", "PA67890");
        passager.reserverVol(1, "2024-11-30", "Confirmée", vol1);

        // Affichage des informations
        System.out.println("=== Informations du vol ===");
        System.out.println("Vol numéro: " + vol1.getNumeroVol());
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
        vol1.modifierVol("Paris", "Chicago");
        System.out.println("Nouvelle destination: " + vol1.getDestination());
    }

}