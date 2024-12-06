package fr.isep.ji;

import java.util.List;

public class Avion {

    private String Immatriculation;//飞机的注册编号
    private String Modele; //飞机型号
    private int Capacite; //最大载客量

    private Vol vol;

    public Avion(String immatriculation, String modele, int capacite) {
        this.Immatriculation = immatriculation;
        this.Modele = modele;
        this.Capacite = capacite;

    }

    public String getImmatriculation() {
        return Immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        Immatriculation = immatriculation;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String modele) {
        Modele = modele;
    }

    public int getCapacite() {
        return Capacite;
    }

    public void setCapacite(int capacite) {
        Capacite = capacite;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public void affecterVol(Vol vol, List<Avion> avionsDisponibles) {
        for (Avion avion : avionsDisponibles) {
            if (avion.verifierDisponibilite(vol.getDateHeureDepart(), vol.getDateHeureArrivee())) {
                avion.setVol(vol);
                vol.setAvion(avion);
                System.out.println("L'avion " + avion.getImmatriculation() + " a été affecté au vol " + vol.getNumeroVol());
                return;
            }
        }
        System.out.println("Aucun avion disponible pour le vol " + vol.getNumeroVol() + ".");
    }


    public boolean verifierDisponibilite(String dateHeureDepart, String dateHeureArrivee) {

        boolean conflit = !(dateHeureArrivee.compareTo(this.vol.getDateHeureDepart()) <= 0 ||
                dateHeureDepart.compareTo(this.vol.getDateHeureArrivee()) >= 0);

        if (conflit) {
            System.out.println("L'avion " + this.Immatriculation + " est déjà assigné à un vol pendant cette période.");
        }

        return !conflit;

    }
}
