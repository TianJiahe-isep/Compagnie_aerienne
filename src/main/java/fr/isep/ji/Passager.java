package fr.isep.ji;

import java.util.ArrayList;
//import java.util.List;

public class Passager extends Personne{

    private String passeport;

    private ArrayList reservations = new ArrayList();
    public Passager(int identifiant, String nom, String adresse, String contact,String Passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public void reserverVol(){
        System.out.println("Vol réservé pour le passager.");
    }

    public void annulerReservation() {
        System.out.println("Réservation annulée pour le passager.");
    }

    public void obtenirReservations() {
        System.out.println("Liste des réservations pour le passager.");
    }
}
