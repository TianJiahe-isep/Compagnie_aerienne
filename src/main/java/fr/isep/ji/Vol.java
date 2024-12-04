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

    private List<String> reservations = new ArrayList<>();
    private Avion avion;

    public Vol(int numeroVol,String Origine,String Destination,String DateHeureDepart,String DateHeureArrivee,String Etat){
        this.NumeroVol = numeroVol;
        this.Origine = Origine;
        this.Destination = Destination;
        this.DateHeureDepart = DateHeureDepart;
        this.DateHeureArrivee = DateHeureArrivee;
        this.Etat = Etat;
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


    public void planifierVol(){

    }

    public void annulerVol(){

    }

    public void modifierVol(){

    }

    public void ListingPassager(){

    }
}
