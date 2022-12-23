package com.turgay;

public class KarasalGezegen extends Gezegen implements IGezegen{

    public KarasalGezegen(String isim, float yerCekimi, Gazlar gazlar, float uzaklik, int gonderilenUyduSayisi, float sicaklik, boolean atmosferVarMi, float radyasyonOrani, float yuzolcumu) {
        super(isim, yerCekimi, gazlar, uzaklik, gonderilenUyduSayisi, sicaklik, atmosferVarMi, radyasyonOrani, yuzolcumu);
    }

    @Override
    public void sartlariIyilestir() {
        // Karasal gezegenin problemi radyasyon ve sıcaklık olabilir
        this.setSicaklik(this.getSicaklik() + 10);
        this.setRadyasyonOrani(0.1f);
    }

    @Override
    public void sartlariKotulestir() {
        this.setRadyasyonOrani(0.5f);
    }

    @Override
    public void yasanabilirHaleGetir() {
        this.setSicaklik(30);
        Gazlar gazlar = new Gazlar();
        gazlar.setOksijen(0.05f);
        gazlar.setKarbon(0.03f);
        gazlar.setAzot(0.78f);
        gazlar.setHidrojen(0.04f);
        this.setGazlar(gazlar);
        this.setAtmosferVarMi(true);
        this.setRadyasyonOrani(0.01f);
    }
}
