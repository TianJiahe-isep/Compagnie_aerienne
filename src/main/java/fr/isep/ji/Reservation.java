package fr.isep.ji;

public class Reservation {

    private int numeroReservation;
    private String dataReservation;
    private String statu;

    private Passager passager;
    private Vol vol;

    public void confirmerReservation(){

    }

    public void annulerReservation(){

    }

    public void modifierRservation(){

    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getDataReservation() {
        return dataReservation;
    }

    public void setDataReservation(String dataReservation) {
        this.dataReservation = dataReservation;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
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
}
