package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne{

    private String passeport;

    private List<Reservation> reservations;
    public Passager(int identifiant, String nom, String adresse, String contact,String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public void reserverVol(int numeroReservation,String dateReservation, String statut,Vol vol){
        Reservation reservation = new Reservation();
        reservation.setNumeroReservation(numeroReservation);
        reservation.setDataReservation(dateReservation);
        reservation.setStatut(statut);
        reservation.setPassager(this);
        reservation.setVol(vol);
        reservations.add(reservation);
        System.out.println("Vol"+ vol.getNumeroVol()+"réservée.");
    }

    public void annulerReservation() {
        System.out.println("Réservation annulée pour le passager.");
    }

    public void obtenirReservations() {
        System.out.println("Liste des réservations pour le passager.");
    }
}
