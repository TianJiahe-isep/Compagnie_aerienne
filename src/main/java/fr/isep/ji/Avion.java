package fr.isep.ji;

public class Avion {

    private String Immatriculation;//飞机的注册编号
    private String Modele; //飞机型号
    private int Capacite; //最大载客量

    private Vol vol;

    public Avion(String immatriculation,String modele,int capacite){
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

    public void afficherVol(){

    }

    public void verifierDisponibilite(){

    }
}
