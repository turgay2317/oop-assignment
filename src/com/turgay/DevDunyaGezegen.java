package com.turgay;

public class DevDunyaGezegen extends Gezegen implements IGezegen{

    public DevDunyaGezegen(String isim, float yerCekimi, Gazlar gazlar, float uzaklik, int gonderilenUyduSayisi, float sicaklik, boolean atmosferVarMi, float radyasyonOrani, float yuzolcumu) {
        super(isim, yerCekimi, gazlar, uzaklik, gonderilenUyduSayisi, sicaklik, atmosferVarMi, radyasyonOrani, yuzolcumu);
    }

    @Override
    public void sartlariIyilestir() {
        // Dev dünya gezegenin problemi yüzölçümüdür. Yüzölçümünü küçültelim
        this.setYuzolcumu(1);
    }

    @Override
    public void sartlariKotulestir() {
        this.setYuzolcumu(1000);
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
