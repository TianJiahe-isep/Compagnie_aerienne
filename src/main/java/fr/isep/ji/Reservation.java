package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private int numeroReservation;
    private String dateReservation;
    private String statut;

    private Passager passager;
    private Vol vol;

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation() {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.passager = passager;
        this.vol = vol;
        reservations.add(this); // Ajouter la nouvelle reservation dans le liste
    }


    public int getNumeroReservation() {
        return numeroReservation;
    }


    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public void confirmerReservation(int numeroReservation) {
        System.out.println("Le numero de reservation ： " + numeroReservation + " est confirmé.");
    }

    public void annulerReservation() {
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation() == numeroReservation) {
                reservation.setStatut("Annulée");
                System.out.println("Le numéro de réservation " + numeroReservation + " est annulé.");
                return;
            }
        }
        System.out.println("Réservation avec le numéro " + numeroReservation + " introuvable.");
    }

    public void modifierReservation(int numeroReservation, Vol vol) {
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation() == numeroReservation) {
                reservation.setVol(vol);
                System.out.println("La réservation " + numeroReservation + " a été modifiée pour le vol " + vol.getNumeroVol());
                return;
            }
        }
        System.out.println("Réservation avec le numéro " + numeroReservation + " introuvable.");
    }

}
