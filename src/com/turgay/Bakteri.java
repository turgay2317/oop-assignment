package com.turgay;

public class Bakteri extends Canli{

    public Bakteri(){

        // Bakteri -1000 ile 1000 derece arasında yaşayabilir.
        this.minSicaklik = -1000;
        this.maxSicaklik = 1000;

        // Bakteri 0 ile 100 radyasyon oranı arasında yaşayabilir.
        this.minRadyasyon = 0;
        this.maxRadyasyon = 100;

        // Bakteri, -+100m/s2 yerçekiminde yaşayabilir.
        this.minYerCekimi = -100;
        this.maxYerCekimi = 100;
    }

}
