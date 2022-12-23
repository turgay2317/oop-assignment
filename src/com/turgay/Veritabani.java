package com.turgay;

import java.util.ArrayList;
import java.util.Arrays;

public class Veritabani {

    ArrayList<Gezegen> gezegenler;

    public Veritabani(){
        gezegenler = new ArrayList<Gezegen>(
                Arrays.asList(
                        new KarasalGezegen("Gliese 876 b", -18.1f, new Gazlar(0.05f, 0.6f, 0.03f, 0.02f), 15, 0, -93, false,  5, 7),
                        new KarasalGezegen("HD134987 b", -23, new Gazlar(0.005f, 0.005f, 0.21f, 0.78f), 82, 0, 42, true, 5, 16.1f),
                        new KarasalGezegen("HD210277", -12.6f, new Gazlar(0.001f, 0.8f, 0.03f, 0.34f), 69, 0, -23, true,  5, 12.9f),
                        new KarasalGezegen("16 Cygni b", -16.2f, new Gazlar(0.004f, 0.35f, 0.05f, 0.12f), 70, 0, -83, false,  5, 17.8f),
                        new KarasalGezegen("47 Ursae Majoris b", -21, new Gazlar(0.06f, 0.78f, 0.06f, 0.23f), 46, 0, -83, false,  5, 25.3f),
                        new KarasalGezegen("HD10697 b", -27.3f, new Gazlar(0.08f, 0.08f, 0.02f, 0.36f), 108, 0, -9, true,  5, 60.2f),
                        new KarasalGezegen("HD37124 c", -14.7f, new Gazlar(0.058f, 0.14f, 0.01f, 0.19f), 103, 0, 54, false,  5, 6.7f),
                        new KarasalGezegen("HD222582 b", -15.3f, new Gazlar(0.034f, 0.4f, 0.07f, 0.06f), 137, 0, -39, false,  5, 83.7f),
                        new KarasalGezegen("14 Herculis b", -11.2f, new Gazlar(0.12f, 0.9f, 0.10f, 0.09f), 59, 0, -143, false,  5, 81.3f),
                        new KarasalGezegen("70 Virginis b", -7.5f, new Gazlar(0.20f, 0.62f, 0.09f, 0.13f), 58, 0, 100, true,  5, 74.9f),
                        new SicakGezegen("HD209458", -19.8f, new Gazlar(0.054f, 0.001f, 0.14f, 0.10f), 158, 0, 1037, false,  5, 7.3f),
                        new SicakGezegen("51 Pegasi b", -20.9f, new Gazlar(0.059f, 0.043f, 0.19f, 0.20f), 50, 0, 850, false,  5, 4.6f),
                        new SicakGezegen("Tau Bootis b", -18.1f, new Gazlar(0.067f, 0.018f, 0.13f, 0.44f), 51, 0, 1200, true,  5, 59.5f),
                        new SicakGezegen("HD187123 c", -8.2f, new Gazlar(0.098f, 0.71f, 0.11f, 0.42f), 150, 0, 1054, false,  5, 19.9f),
                        new SicakGezegen("HD75289 b", -10.5f, new Gazlar(0.012f, 0.004f, 0.17f, 0.28f), 95, 0, 1115, true,  5, 4.9f),
                        new SicakGezegen("HD217107 c", -22.3f, new Gazlar(0.028f, 0.006f, 0.15f, 0.18f), 65, 0, 675, false,  5, 13),
                        new SicakGezegen("Gliese 86 b", -24.1f, new Gazlar(0.023f, 0.52f, 0.16f, 0.04f), 35, 0, 325, false,  5, 44.2f),
                        new SicakGezegen("HD192263 b", -25.0f, new Gazlar(0.012f, 0.61f, 0.10f, 0.26f), 65, 0, 215, false,  5, 5.6f),
                        new SicakGezegen("55 Cancri b", -10.9f, new Gazlar(0.051f, 0.68f, 0.08f, 0.08f), 41, 0, 355, true,  5, 8.3f),
                        new SicakGezegen("AU Microscopii b", -26, new Gazlar(0.082f, 0.86f, 0.02f, 0.36f), 32, 0, 320, false,  5, 20.12f),
                        new DevDunyaGezegen("Proxima Centauri b", -12, new Gazlar(0.044f, 0.046f, 0.08f, 0.68f), 4, 0, -39, true,  5, 1.27f),
                        new DevDunyaGezegen("Ross 128 b", -14.2f, new Gazlar(0.034f, 0.076f, 0.20f, 0.22f), 11, 0, -28, true,  5, 1.41f),
                        new DevDunyaGezegen("TOI-206 b", -13.8f, new Gazlar(0.0056f, 0.004f, 0.21f, 0.38f), 156, 0, 637, false,  5, 2.24f),
                        new DevDunyaGezegen("55 Cancri e", -8.8f, new Gazlar(0.004f, 0.003f, 0.18f, 0.28f), 41, 0, 325, false,  5, 7.99f),
                        new DevDunyaGezegen("Gliese 1132 b", -9.1f, new Gazlar(0.008f, 0.079f, 0.12f, 0.02f), 40, 0, 137, true,  5, 1.66f),
                        new DevDunyaGezegen("CD Ceti b", -13.7f, new Gazlar(0.001f, 0.1f, 0.10f, 0.02f), 28, 0, 191, true,  5, 3.95f),
                        new DevDunyaGezegen("Gliese 1061 b", -15.1f, new Gazlar(0.003f, 0.497f, 0.02f, 0.58f), 12, 0, -273, false,  5, 1.37f),
                        new DevDunyaGezegen("HD 136352 b", -11.8f, new Gazlar(0.055f, 0.059f, 0.90f, 0.52f), 48, 0, 638, false,  5, 4.72f),
                        new DevDunyaGezegen("HD 20794 b", -12.7f, new Gazlar(0.044f, 0.143f, 0.01f, 0.48f), 20, 0, 88, true,  5, 2.70f),
                        new DevDunyaGezegen("Rho Coronae Borealis c", -7.9f, new Gazlar(0.0852f, 0.10f, 0.04f, 0.02f), 57, 0, 325, false, 5, 25)
                )
        );
    }

    public ArrayList<Gezegen> gezegenleriGetir(){
        return gezegenler;
    }

    public ArrayList<Gezegen> gezegenleriGetir(int uzaklik){
        ArrayList<Gezegen> newlist = new ArrayList<>();
        for (Gezegen gezegen : gezegenler){
            if (gezegen.getUzaklik() <= uzaklik)
                newlist.add(gezegen);
        }
        return newlist;
    }

    public void gezegenEkle(Gezegen gezegen){
        gezegenler.add(gezegen);
    }
}

