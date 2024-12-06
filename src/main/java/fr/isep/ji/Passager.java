package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne{

    private String passeport;

    private List<Reservation> reservations;
    public Passager(int identifiant, String nom, String adresse, String contact,String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void reserverVol(int numeroReservation, String dateReservation, String statut, Vol vol){
        Reservation reservation = new Reservation();
        reservation.setNumeroReservation(numeroReservation);
        reservation.setDateReservation(dateReservation);
        reservation.setStatut(statut);
        reservation.setPassager(this);
        reservation.setVol(vol);
        reservations.add(reservation);
        System.out.println("Vol"+ vol.getNumeroVol()+"réservée.");
    }

    public void annulerReservation(int numeroReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation() == numeroReservation) {
                reservation.setStatut("Annulée");
                System.out.println("Le numéro de réservation " + numeroReservation + " est annulé.");
                return;
            }
        }
        System.out.println("Réservation avec le numéro " + numeroReservation + " introuvable.");
    }

    public void obtenirReservations(int numeroReservation) {
        System.out.println("Recherche des informations pour la réservation numéro : " + numeroReservation);
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation() == numeroReservation) {
                System.out.println("Liste de la réservation :");
                System.out.println("- Numéro de réservation : " + reservation.getNumeroReservation());
                return;
            }
        }
        System.out.println("Réservation avec le numéro " + numeroReservation + " introuvable.");
    }

}
