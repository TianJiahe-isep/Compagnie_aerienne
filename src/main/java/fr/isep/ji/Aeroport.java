package fr.isep.ji;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {

    private String Nom;  //机场名称
    private String Ville; //
    private String Description;

    private List<Vol> volsDepart = new ArrayList<>();
    private List<Vol> volsArrivee = new ArrayList<>();

    public Aeroport(String nom,String ville,String description){
        this.Nom = nom;
        this.Ville = ville;
        this.Description = description;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Vol> getVolsDepart() {
        return volsDepart;
    }

    public void setVolsDepart(List<Vol> volsDepart) {
        this.volsDepart = volsDepart;
    }

    public List<Vol> getVolsArrivee() {
        return volsArrivee;
    }

    public void setVolsArrivee(List<Vol> volsArrivee) {
        this.volsArrivee = volsArrivee;
    }


    public void affecterVol(){

    }
}
