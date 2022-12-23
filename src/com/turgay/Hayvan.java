package com.turgay;

public class Hayvan extends Canli{

    public Hayvan(){
        // Hayvan -50 ile 50 derece arasında yaşayabilir.
        this.minSicaklik = -50;
        this.maxSicaklik = 50;

        // Hayvan, 0 ile 5 arasında radyasyonda yaşayabilir.
        this.minRadyasyon = 0;
        this.maxRadyasyon = 5;

        // Hayvan, -+15m/s2 yerçekiminde rahatça yaşayabilir.
        this.minYerCekimi = -15;
        this.maxYerCekimi = 15;
    }

}
