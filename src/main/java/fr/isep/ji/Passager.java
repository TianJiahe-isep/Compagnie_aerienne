package fr.isep.ji;

public class Passager extends Personne{
    private String passeport;

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

    public void annulerResercation(){
        System.out.println("Réservation annulée pour le passager.");
    }

    public void obtenirReservation(){
        System.out.println("Liste des réservations pour le passager.");
    }
}
