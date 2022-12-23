package com.turgay;

public class Gezegen{
    private String isim;
    private float yerCekimi;
    private float uzaklik;
    private int gonderilenUyduSayisi;
    private float sicaklik;
    private boolean atmosferVarMi;
    private float radyasyonOrani;
    private float yuzolcumu;
    private Gazlar gazlar;

    public Gezegen(){

    }

    public Gezegen(String isim, float yerCekimi, Gazlar gazlar, float uzaklik, int gonderilenUyduSayisi, float sicaklik, boolean atmosferVarMi, float radyasyonOrani, float yuzolcumu) {
        this.isim = isim;
        this.yerCekimi = yerCekimi;
        this.gazlar = gazlar;
        this.uzaklik = uzaklik;
        this.gonderilenUyduSayisi = gonderilenUyduSayisi;
        this.sicaklik = sicaklik;
        this.atmosferVarMi = atmosferVarMi;
        this.radyasyonOrani = radyasyonOrani;
        this.yuzolcumu = yuzolcumu;
    }

    @Override
    public String toString() {
        return "Gezegen{" +
                "isim='" + isim + '\'' +
                ", yerCekimi=" + yerCekimi +
                ", uzaklik=" + uzaklik +
                ", gonderilenUyduSayisi=" + gonderilenUyduSayisi +
                ", sicaklik=" + sicaklik +
                ", atmosferVarMi=" + atmosferVarMi +
                ", radyasyonOrani=" + radyasyonOrani +
                ", yuzolcumu=" + yuzolcumu +
                ", gazlar=" + gazlar.toString() +
                '}';
    }

    public void gezegenDetay() {
        if (getUzaklik() > 1 && getUzaklik() < 20) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("            ⣀⠤⠤⠤⢄⡀              "+ getIsim());
            System.out.println("         ⢠⠞⠁⠀⠀ ⠀⠀ ⠈⢧⡀            Yer cekimi:"+getYerCekimi()+" m/s2");
            System.out.println("         ⣮           ⡇            Uzaklik:"+getUzaklik()+ " Işık yılı");
            System.out.println("         ⣇⠀⠀⠀⠀⠀ ⠀⠀  ⠀⡇            Gonderilen Uydu Sayisi:"+getGonderilenUyduSayisi());
            System.out.println("         ⠘⢦⡀⠀⠀  ⠀⠀⢀⠞⠁            Sicaklik:"+getSicaklik() + " *c");
            System.out.println("            ⠉⠒⠒⠒⠚⠁               Yuz Olcumu:"+getYuzolcumu() + "km2");
            System.out.println("                                 Azot: "+ getGazlar().getAzot()+" Hidrojen: "+getGazlar().getHidrojen()+" Karbon: "+ getGazlar().getKarbon()+" Oksijen: "+ getGazlar().getOksijen());
            System.out.println("                                Radyasyon:"+getRadyasyonOrani() + "%");
            System.out.println("-------------------------------------------------------------------------------------");

        } else if (getUzaklik() >= 20 && getUzaklik() < 40) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("            ⣀⣀⣀⣀⣀                   ");
            System.out.println("         ⢀⡶⠛⠉⠀  ⠉⠙⠳⣦⡀          "+ getIsim());
            System.out.println("       ⣴⠋⠀⠀⠀⠀ ⠀⠀  ⠀⠀ ⠈⠻⣄         Yer cekimi:"+getYerCekimi()+" m/s2");
            System.out.println("     ⣼⠃⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀  ⠀  ⢻⡀       Uzaklik:"+getUzaklik()+ " Işık yılı");
            System.out.println("    ⢠⣿⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀     ⣿       Gonderilen Uydu Sayisi:"+getGonderilenUyduSayisi());
            System.out.println("    ⠸⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀     ⠀⣿       Sicaklik:"+getSicaklik() + " *c");
            System.out.println("     ⢻⡀⠀⠀⠀⠀⠀⠀   ⠀⠀     ⠀⣰⠋       Yuz Olcumu:"+getYuzolcumu()+ "km2");
            System.out.println("       ⢻⣦⡀⠀⠀ ⠀⠀⠀   ⠀ ⠀⣴⠋         Azot: "+ getGazlar().getAzot()+" Hidrojen: "+getGazlar().getHidrojen()+" Karbon: "+ getGazlar().getKarbon()+" Oksijen: "+ getGazlar().getOksijen());
            System.out.println("         ⠙⠿⣤⣀⠀  ⢀⣀⡴⠟⠁            Radyasyon:"+getRadyasyonOrani() + "%");
            System.out.println("            ⠉⠉⠉⠉⠉⠁                   ");
            System.out.println("-------------------------------------------------------------------------------------");

        } else if (getUzaklik() >= 40) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("            ⠀ ⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ");
            System.out.println("⠀⠀⠀⠀    ⢀⣤⡶⠟⠛⠉⠉⠉⠙⠛⠶⣶⣤⡀⠀⠀⠀   ");
            System.out.println("   ⠀⠀⢠⣾⠟⠁ ⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠻⢿⣦⡀⠀    "+ getIsim());
            System.out.println("   ⠀⣰⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀    ⠀⠹⣷⡀     Yer cekimi:"+getYerCekimi() +" m/s2");
            System.out.println("   ⢠⡟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀    ⢹⣇     Uzaklik:"+getUzaklik()+ " Işık yılı");
            System.out.println("   ⣾⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⣿     Gonderilen Uydu Sayisi:"+getGonderilenUyduSayisi());
            System.out.println("   ⢿⡯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀    ⠀⣿     Sicaklik:"+getSicaklik() + " *c");
            System.out.println("   ⠸⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀ ⠀⠀⠀   ⢰⡿     Yuz Olcumu:"+getYuzolcumu()+ "km2");
            System.out.println("   ⠀⠹⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀   ⠀⣠⡿⠀      Azot: "+ getGazlar().getAzot()+" Hidrojen: "+getGazlar().getHidrojen()+" Karbon: "+ getGazlar().getKarbon()+" Oksijen: "+ getGazlar().getOksijen());
            System.out.println("     ⠀⠙⢿⣦⣀⠀⠀⠀⠀   ⠀ ⠀ ⠀⣠⣾⠏⠀⠀       Radyasyon:"+getRadyasyonOrani() + "%");
            System.out.println("⠀⠀      ⠉⠛⠿⣦⣄⣀⣀⣀⣀⣤⡴⠞⠋⠀⠀⠀     ");
            System.out.println("⠀⠀⠀⠀⠀ ⠀      ⠈⠉⠉⠉⠁⠀⠀           ");
            System.out.println("-------------------------------------------------------------------------------------");
        }

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public float getYerCekimi() {
        return yerCekimi;
    }

    public void setYerCekimi(float yerCekimi) {
        this.yerCekimi = yerCekimi;
    }

    public Gazlar getGazlar() {
        return gazlar;
    }

    public void setGazlar(Gazlar gazlar) {
        this.gazlar = gazlar;
    }

    public float getUzaklik() {
        return uzaklik;
    }

    public void setUzaklik(float uzaklik) {
        this.uzaklik = uzaklik;
    }

    public int getGonderilenUyduSayisi() {
        return gonderilenUyduSayisi;
    }

    public void setGonderilenUyduSayisi(int gonderilenUyduSayisi) {
        this.gonderilenUyduSayisi = gonderilenUyduSayisi;
    }

    public float getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(float sicaklik) {
        this.sicaklik = sicaklik;
    }

    public boolean isAtmosferVarMi() {
        return atmosferVarMi;
    }

    public void setAtmosferVarMi(boolean atmosferVarMi) {
        this.atmosferVarMi = atmosferVarMi;
    }

    public float getRadyasyonOrani() {
        return radyasyonOrani;
    }

    public void setRadyasyonOrani(float radyasyonOrani) {
        this.radyasyonOrani = radyasyonOrani;
    }

    public float getYuzolcumu() {
        return yuzolcumu;
    }

    public void setYuzolcumu(float yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

}

