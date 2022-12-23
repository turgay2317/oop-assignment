package com.turgay;

public class Gazlar {
    private float Hidrojen, Karbon, Oksijen, Azot;

    public Gazlar(float hidrojen, float karbon, float oksijen, float azot) {
        Hidrojen = hidrojen;
        Karbon = karbon;
        Oksijen = oksijen;
        Azot = azot;
    }

    public Gazlar() {

    }

    public float getHidrojen() {
        return Hidrojen;
    }

    public float getAzot() {
        return Azot;
    }

    public float getKarbon() {
        return Karbon;
    }

    public float getOksijen() {
        return Oksijen;
    }

    public void setHidrojen(float hidrojen) {
        Hidrojen = hidrojen;
    }

    public void setKarbon(float karbon) {
        Karbon = karbon;
    }

    public void setOksijen(float oksijen) {
        Oksijen = oksijen;
    }

    public void setAzot(float azot) {
        Azot = azot;
    }

    @Override
    public String toString() {
        return "Gazlar{" +
                "Hidrojen=" + Hidrojen +
                ", Karbon=" + Karbon +
                ", Oksijen=" + Oksijen +
                ", Azot=" + Azot +
                '}';
    }
}
