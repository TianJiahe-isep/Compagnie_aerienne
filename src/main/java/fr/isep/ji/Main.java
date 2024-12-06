package fr.isep.ji;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aeroport aeroportParis = new Aeroport("Charles de Gaulle", "Paris", "Principal aéroport de Paris");
        Aeroport aeroportNewYork = new Aeroport("JFK", "New York", "Aéroport de New York");

        Vol vol = new Vol(101, "Paris", "New York", "2024-12-10T10:30", "2024-12-10T14:30", "Scheduled", aeroportParis, aeroportNewYork);

        // 分配航班到机场
        aeroportParis.affecterVol(vol, true);
        aeroportNewYork.affecterVol(vol, false);

        // 打印航班信息
        System.out.println("Aéroport de départ : " + vol.getAeroportDepart().getNom());
        System.out.println("Aéroport d'arrivée : " + vol.getAeroportArrivee().getNom());

    }

}