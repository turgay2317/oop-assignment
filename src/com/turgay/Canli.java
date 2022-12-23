package com.turgay;

abstract class Canli {
    // Yaşayabilmesi için min. max. sıcaklık değer aralığı
    public int minSicaklik;
    public int maxSicaklik;

    // Yaşayabilmesi için min. max. radyasyon oranı aralığı
    public int minRadyasyon;
    public int maxRadyasyon;

    // Yaşayabilmesi için min. max. yerçekimi miktarı aralığı
    public int minYerCekimi;
    public int maxYerCekimi;

    @Override
    public String toString() {
        return "Canli{" +
                "minSicaklik=" + minSicaklik +
                ", maxSicaklik=" + maxSicaklik +
                ", minRadyasyon=" + minRadyasyon +
                ", maxRadyasyon=" + maxRadyasyon +
                ", minYerCekimi=" + minYerCekimi +
                ", maxYerCekimi=" + maxYerCekimi +
                '}';
    }
}
