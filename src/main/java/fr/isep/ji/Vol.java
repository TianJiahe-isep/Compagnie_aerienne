package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;

public class Vol {

    private int NumeroVol;
    private String Origine;
    private String Destination;
    private String DateHeureDepart;
    private String DateHeureArrivee;
    private String Etat;

    private ArrayList<String> reservations = new ArrayList<>();
    private Avion avion;

    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;

    public Vol(int NumeroVol,String Origine,String Destination,String DateHeureDepart,String DateHeureArrivee,String Etat,Aeroport aeroportDepart,Aeroport aeroportArrivee){
        this.NumeroVol = NumeroVol;
        this.Origine = Origine;
        this.Destination = Destination;
        this.DateHeureDepart = DateHeureDepart;
        this.DateHeureArrivee = DateHeureArrivee;
        this.Etat = Etat;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
    }

    //getter et setter
    public int getNumeroVol() {
        return NumeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.NumeroVol = numeroVol;
    }

    public String getOrigine() {
        return Origine;
    }

    public void setOrigine(String origine) {
        Origine = origine;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDateHeureDepart() {
        return DateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        DateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return DateHeureArrivee;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        DateHeureArrivee = dateHeureArrivee;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String etat) {
        Etat = etat;
    }

    public ArrayList<String> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<String> reservations) {
        this.reservations = reservations;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

//fonction
    public void planifierVol(){
        System.out.println("Le vol " + NumeroVol + " a été planifié.");
    }

    public void annulerVol(){
        System.out.println("Le vol " + NumeroVol + " a été annulé.");
    }

    public void modifierVol(String nouvelleOrigine, String nouvelleDestination) {
        this.Origine = nouvelleOrigine;
        this.Destination = nouvelleDestination;
        System.out.println("Le vol " + NumeroVol + " a été modifié.");
    }

    public void ListingPassager(){
        System.out.println("Liste des passagers du vol " + NumeroVol + ":");
        for (String reservation : reservations) {
            System.out.println("- " + reservation);
        }
    }
}
