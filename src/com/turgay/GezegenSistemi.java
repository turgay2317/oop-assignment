package com.turgay;

import java.util.ArrayList;

public class GezegenSistemi {
    private final Gezegen referansGezegen;
    private final Canli referansCanli;
    private ArrayList<Gezegen> gezegenler;

    public GezegenSistemi(Gezegen referansGezegen, Canli referansCanli, ArrayList<Gezegen> gezegenler){
        this.referansGezegen = referansGezegen;
        this.referansCanli = referansCanli;
        this.gezegenler = gezegenler;

        // Bilgilendirme
        System.out.println("Bu gezegen sistemindeki kıyaslar ve oranlar " + referansGezegen.getIsim() + " gezegeni ve " + referansCanli.getClass().getSimpleName() + " canlısı referans alınarak yapılacaktır.");
        //System.out.println(referansGezegen.toString());
        //System.out.println(referansCanli.toString());
    }

    public double yasamOlasiiginiHesapla(int indis){
        Gezegen gezegen = this.gezegenler.get(indis);
        /*
        Yaşam olasılığı hesaplanırken, sıcaklık ve radyasyon değerleri canlıdan canlıya değişebildiği için
        formüldeki yeri de değişkendir. Fakat gazlar ve gazların oranları tüm canlı formları için
        aşağı yukarı aynı gereksinimler olduğudann gaz ortak hesaplanır.

            Yaşam olasılığı formulünde:
                Gaz (%50), Sıcaklık (%20), Radyasyon Oranı (%20), Yerçekimi(%10) etkiye sahiptir.
            Gaz yaşam olasılığı formulü = 1 - (|Azot - 0.78| + |Oksijen - 0.21| + |Hidrojen - 0.005| + |Karbon - 0.005|)
            Sıcaklık yaşam olasılığı formulü = 1 - (|OrtSıcaklık - GezegenSıcaklığı| / 100)
            Radyasyon yaşam olasığı formülü = 1 - (|OrtRadyasyon - GezegenRadyasyon| / 100)

        */
        double gazYasamOlasiligi = 1 - (Math.abs(gezegen.getGazlar().getAzot() - 0.78) + Math.abs(gezegen.getGazlar().getOksijen() - 0.21) + Math.abs(gezegen.getGazlar().getHidrojen() - 0.005) + Math.abs(gezegen.getGazlar().getKarbon() - 0.005));
        double sicaklikYasamOlasiligi = 1 - (Math.abs((referansCanli.maxSicaklik - referansCanli.minSicaklik) / 2 - gezegen.getSicaklik()) / 100);
        double radyasyonYasamOlasiligi = 1 - (Math.abs((referansCanli.maxRadyasyon - referansCanli.minRadyasyon) / 2 - gezegen.getRadyasyonOrani()) / 100);
        double yercekimiYasamOlasiligi = 1 - (Math.abs((referansCanli.maxYerCekimi - referansCanli.minYerCekimi) / 2 - gezegen.getYerCekimi()) / 100);
        double genelYasamOlasiligi = Math.abs(gazYasamOlasiligi * 50 + sicaklikYasamOlasiligi * 20 + radyasyonYasamOlasiligi * 20 + yercekimiYasamOlasiligi * 10);
        return genelYasamOlasiligi;
    }

    public Gezegen getReferansGezegen() {
        return referansGezegen;
    }

    public ArrayList<Gezegen> getGezegenler() {
        return gezegenler;
    }
}
