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

    private ArrayList reservations = new ArrayList();
    private Avion avion;

    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;

    public Vol(int numeroVol,String Origine,String Destination,String DateHeureDepart,String DateHeureArrivee,String Etat,Aeroport aeroportDepart,Aeroport aeroportArrivee){
        this.NumeroVol = numeroVol;
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

    public ArrayList getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList reservations) {
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

    }

    public void annulerVol(){

    }

    public void modifierVol(){

    }

    public void ListingPassager(){

    }
}
