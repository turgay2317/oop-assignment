package com.turgay;

import java.util.Random;
import java.util.Scanner;

public class KomutArayuzu {

    public static void hosgeldin(){
        System.out.println("========================================================================");
        System.out.println("| UZAY VE GEZEGENLER BİLGİ SİSTEMİ (UGBS) Simülasyonuna hoş geldiniz |");
        System.out.println("========================================================================");
    }

    public static void tanitim(){
        System.out.println("Bu simülasyon ile gezegenlere uydular gönderebilir ve \nfarklı canlıların farklı gezegenlerde yaşam olasılıklarını hesaplayabilirsiniz.");
        System.out.println("========================================================================");
    }

    public static void baslangic(){
        System.out.println("Aşağıdaki komutlarla işlem gerçekleştirebilirsiniz;");
        System.out.println("1 - Uzaklığa göre gezegen tara");
        System.out.println("2 - Gezegen ekle");
        System.out.println("3 - Rastgele Gezegen oluştur");
        System.out.println("4 - Gezegen düzenle");
        System.out.println("5 - Gezegenlerdeki yaşam olasılığını hesapla");
        System.out.println("6 - Gezegenleri kıyasla");
        System.out.println("========================================================================");
    }

    public static void baslikYaz(String baslik){
        System.out.println("========================================================================");
        System.out.println(baslik);
        System.out.println("========================================================================");
    }

    public static Gezegen gep(Scanner scanner, GezegenSistemi gezegenSistemi){

        Gezegen yeniGezegen = new Gezegen();
        scanner.nextLine();

        // Gezegen ismi
        System.out.print("Yeni gezegenin ismini giriniz: ");
        String yeniIsim= scanner.nextLine();
        yeniGezegen.setIsim(yeniIsim);
        System.out.println("OK");

        // Gezegen Yer çekimi
        float yerCekimi;
        do {
            System.out.print("Yeni gezegenin yer çekimi değerini m/s^2 cinsinden giriniz:");
            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar yer çekimi değeri giriniz: ");
                scanner.next();
            }
            yerCekimi = scanner.nextFloat();
            yeniGezegen.setYerCekimi(yerCekimi);
            System.out.println("OK");
        } while (Float.isNaN(yerCekimi));

        // Uzaklık
        float yeniUzaklik;
        do {
            System.out.print("Yeni gezegenin uzaklık değerini " +gezegenSistemi.getReferansGezegen().getIsim()
                    + " gezegenine göre ışık yılı cinsinden giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar göreceli uzaklık değeri giriniz: ");
                scanner.next();
            }
            yeniUzaklik = scanner.nextFloat();
            yeniGezegen.setUzaklik(yeniUzaklik);
            System.out.println("OK");
        } while (Float.isNaN(yeniUzaklik));

        // Sıcaklık
        float yeniSicaklik;
        do {
            System.out.print("Yeni gezegenin sıcaklık değerini santigrat cinsinden giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar sıcaklık değeri giriniz: ");
                scanner.next();
            }
            yeniSicaklik = scanner.nextFloat();
            yeniGezegen.setSicaklik(yeniSicaklik);
            System.out.println("OK");
        } while (Float.isNaN(yeniSicaklik));

        // Atmosfer
        boolean yeniAtmosfer;
        do {
            System.out.print("Yeni gezegenin atmosferi var mı?: (true, false)");

            while (!scanner.hasNextBoolean()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar sıcaklık değeri giriniz: ");
                scanner.next();
            }
            yeniAtmosfer = scanner.nextBoolean();
            yeniGezegen.setAtmosferVarMi(yeniAtmosfer);
            System.out.println("OK");
        } while (yeniAtmosfer != true && yeniAtmosfer != false);

        // Radyasyon
        float yeniRadyasyon = -1;
        do {
            System.out.print("Yeni gezegenin radyasyon oranını (0-100)% olarak giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar radyasyon değeri giriniz: ");
                scanner.next();
            }
            yeniRadyasyon = scanner.nextFloat();
            yeniGezegen.setRadyasyonOrani(yeniRadyasyon);
            System.out.println("OK");
        } while (Float.isNaN(yeniRadyasyon));

        // Yüzölçümü
        float yeniYuzolcumu;
        do {
            System.out.print("Yeni gezegenin " +gezegenSistemi.getReferansGezegen().getIsim()+ " gezegenine göre yüzölçümü oranını giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar yüzölçümü değeri giriniz: ");
                scanner.next();
            }
            yeniYuzolcumu = scanner.nextFloat();
            yeniGezegen.setYuzolcumu(yeniYuzolcumu);
            System.out.println("OK");
        } while (Float.isNaN(yeniYuzolcumu));

        // GAZLAR
        Gazlar gazlar = new Gazlar();

        // Hidrojen gazı
        float hidrojen = -1;
        do {
            System.out.print("Yeni gezegenin hidrojen oranını 0-1 aralığında olarak giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar hidrojen değeri giriniz: ");
                scanner.next();
            }
            hidrojen = scanner.nextFloat();
            gazlar.setHidrojen(hidrojen);
            System.out.println("OK");
        } while (Float.isNaN(hidrojen));

        // Oksijen gazı
        float oksijen = -1;
        do {
            System.out.print("Yeni gezegenin oksijen oranını 0-1 aralığında olarak giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar oksijen değeri giriniz: ");
                scanner.next();
            }
            oksijen = scanner.nextFloat();
            gazlar.setOksijen(oksijen);
            System.out.println("OK");
        } while (Float.isNaN(oksijen));

        // Azot gazı
        float azot = -1;
        do {
            System.out.print("Yeni gezegenin azot oranını 0-1 aralığında olarak giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar azot değeri giriniz: ");
                scanner.next();
            }
            azot = scanner.nextFloat();
            gazlar.setAzot(azot);
            System.out.println("OK");
        } while (Float.isNaN(azot));

        // Karbon gazı
        float karbon = -1;
        do {
            System.out.print("Yeni gezegenin karbon oranını 0-1 aralığında olarak giriniz:");

            while (!scanner.hasNextFloat()) {
                System.out.println("ERROR / GEÇERSİZ VERİ");
                System.out.print("Lütfen tekrar karbon değeri giriniz: ");
                scanner.next();
            }
            karbon = scanner.nextFloat();
            gazlar.setKarbon(karbon);
            System.out.println("OK");
        } while (Float.isNaN(karbon));

        yeniGezegen.setGonderilenUyduSayisi(0);
        yeniGezegen.setGazlar(gazlar);

        return yeniGezegen;
    }

    public static Gezegen rgep(){
        Gezegen rastgeleGezegen = new Gezegen();
        Random random = new Random();
        float f = random.nextFloat();
        int i = random.nextInt(10) + 1;
        boolean b = random.nextBoolean();
        int q = random.nextInt(1000) + 1;
        // İsim
        String yeniRandomIsim= "RastgeleGezegen - " + q;
        rastgeleGezegen.setIsim(yeniRandomIsim);

        // Yerçekimi
        float rastgeleYerCekimi = f*100;
        rastgeleGezegen.setYerCekimi(rastgeleYerCekimi);

        // Uzaklık
        float rastgeleUzaklik = f*200;
        rastgeleGezegen.setUzaklik(rastgeleUzaklik);

        // Gönderilen uydu sayısı
        int rastgeleGonderilenUyduSayisi = i;
        rastgeleGezegen.setGonderilenUyduSayisi(rastgeleGonderilenUyduSayisi);

        // Sıcaklık
        boolean np = random.nextBoolean();
        float rastgeleSicaklik;
        if(np == true){
            rastgeleSicaklik = f*1500;
        }else{
            rastgeleSicaklik = - (f * 1500);
        }
        rastgeleGezegen.setSicaklik(rastgeleSicaklik);

        // Atmosfer
        boolean rastgeleAtmosferVarMi = b;
        rastgeleGezegen.setAtmosferVarMi(rastgeleAtmosferVarMi);

        // Radyasyon
        float rastgeleRadyasyonOrani = f*100;
        rastgeleGezegen.setRadyasyonOrani(rastgeleRadyasyonOrani);

        // Yüzölçümü
        float rastgeleYuzOlcumu = f*2500;
        rastgeleGezegen.setYuzolcumu(rastgeleYuzOlcumu);

        // Gazlar
        Gazlar gazlar = new Gazlar();
        float top = 1;
        // Azot
        float azot = 0.00f + random.nextFloat() * (top); // 0-1 arasında
        gazlar.setAzot(azot);
        top -= azot;

        // Oksijen
        float oksijen = 0.00f + random.nextFloat() * (top); // 0-1 arasında
        gazlar.setOksijen(oksijen);
        top -= oksijen;

        // Karbon
        float karbon = 0.00f + random.nextFloat() * (top); // 0-1 arasında
        gazlar.setKarbon(karbon);
        top -= karbon;

        // Hidrojen
        float hidrojen = 0.00f + random.nextFloat() * (top); // 0-1 arasında
        gazlar.setHidrojen(hidrojen);

        rastgeleGezegen.setGazlar(gazlar);

        return rastgeleGezegen;

    }

    static void ggp(Scanner scanner, GezegenSistemi gezegenSistemi){
        System.out.println("Düzenleyeceğiniz gezegen numarasını giriniz:");

        int secilen;

        secilen = scanner.nextInt();

        Gezegen secilenGezegen = gezegenSistemi.getGezegenler().get(secilen);

        System.out.println("Düzenleyeceğiniz Özelliği tuşlayınız:");
        System.out.println("1 - Sıcaklık");
        System.out.println("2 - Radyasyon");
        System.out.println("3 - Gazlar");

        int secenek;

        secenek = scanner.nextInt();

        switch (secenek){
            case 1:
                float yeniSicaklik;
                System.out.println("Yeni Sıcaklık değerini giriniz: ");
                yeniSicaklik = scanner.nextFloat();
                secilenGezegen.setSicaklik(yeniSicaklik);
                System.out.println("Sıcaklık güncellendi!");
                break;
            case 2:
                float yeniRadyasyon;
                System.out.println("Yeni Radyasyon değerini giriniz: ");
                yeniRadyasyon = scanner.nextFloat();
                secilenGezegen.setRadyasyonOrani(yeniRadyasyon);
                System.out.println("Radyasyon yüzdesi güncellendi!");
                break;
            case 3:
                System.out.println("Düzenlemek istediğiniz gazı seçin:");
                System.out.println("1 - Hidrojen Gazı");
                System.out.println("2 - Oksijen Gazi");
                System.out.println("3 - Azot Gazı");
                System.out.println("4 - Karbon Gazı");

                int gazSecim;

                gazSecim = scanner.nextInt();

                float oran;

                switch (gazSecim){
                    case 1:
                        System.out.println("Hidrojen gazı için oran giriniz:");
                        oran = scanner.nextFloat();
                        secilenGezegen.getGazlar().setHidrojen(oran);
                        break;
                    case 2:
                        System.out.println("Oksijen gazı için oran giriniz:");
                        oran = scanner.nextFloat();
                        secilenGezegen.getGazlar().setOksijen(oran);
                        break;
                    case 3:
                        System.out.println("Azot gazı için oran giriniz:");
                        oran = scanner.nextFloat();
                        secilenGezegen.getGazlar().setAzot(oran);
                        break;
                    case 4:
                        System.out.println("Karbon gazı için oran giriniz:");
                        oran = scanner.nextFloat();
                        secilenGezegen.getGazlar().setKarbon(oran);
                        break;

                    default:
                        System.out.println("Komut tanınamadı! Geri dönülüyor...");
                        break;
                }

                break;
        }
    }


    static double gyohp(Scanner scanner, GezegenSistemi gezegenSistemi) throws InterruptedException {
        System.out.println("Gezegenin numarasını tuşlayınız: ");
        int secim = scanner.nextInt();
        Gezegen secilenGezegen = gezegenSistemi.getGezegenler().get(secim);
        System.out.println(secilenGezegen.getIsim() + " gezegenindeki yaşam olasılığının hesaplanması için uydu gönderiliyor...");

        System.out.print(gezegenSistemi.getReferansGezegen().getIsim());
        for(int i = 1; i<= 15; i++){
            System.out.print("=");
            Thread.sleep(500);
        }
        System.out.print(secilenGezegen.getIsim());
        System.out.println(secilenGezegen.getIsim() + " GEZEGENİNDE YAŞAM OLASILIĞI HESAPLANDI: ");
        System.out.println();
        secilenGezegen.setGonderilenUyduSayisi(secilenGezegen.getGonderilenUyduSayisi() + 1);
        return gezegenSistemi.yasamOlasiiginiHesapla(secim);
    }

    static void gkp(Scanner scanner, GezegenSistemi gezegenSistemi) throws InterruptedException {
        System.out.println("1.Gezegenin numarasını tuşlayınız: ");
        int secim1 = scanner.nextInt();
        System.out.println("2.Gezegenin numarasını tuşlayınız: ");
        int secim2 = scanner.nextInt();

        Gezegen secilenGezegen1 = gezegenSistemi.getGezegenler().get(secim1);
        Gezegen secilenGezegen2 = gezegenSistemi.getGezegenler().get(secim2);

        System.out.print(gezegenSistemi.getReferansGezegen().getIsim());
        for(int i = 1; i<= 15; i++){
            System.out.print("=");
            Thread.sleep(200);
        }
        System.out.print(secilenGezegen1.getIsim());

        System.out.println();

        System.out.print(gezegenSistemi.getReferansGezegen().getIsim());
        for(int i = 1; i<= 15; i++){
            System.out.print("=");
            Thread.sleep(200);
        }
        System.out.print(secilenGezegen2.getIsim());

        System.out.println();

        System.out.println("ARAÇLAR GEZEGENE ULAŞTI. VERİLER TOPLANIYOR...");
        for(int i = 1; i<= 20; i++){
            System.out.print("=");
            Thread.sleep(100);
        }
        System.out.println("VERİLER TOPLANDI! KIYAS GERÇEKLEŞTİRİLİYOR...");
        for(int i = 1; i<= 20; i++){
            System.out.print("=");
            Thread.sleep(100);
        }

        System.out.println("KIYAS SONUCU");

        // Uzaklık
        if(secilenGezegen1.getUzaklik() > secilenGezegen2.getUzaklik()){
            System.out.println(secilenGezegen2.getIsim() + " gezegeni " + secilenGezegen1.getIsim() + " gezegeninden daha yakın.");
        }else{
            System.out.println(secilenGezegen1.getIsim() + " gezegeni " + secilenGezegen2.getIsim() + " gezegeninden daha yakın.");
        }

        System.out.println("..........");
        Thread.sleep(1000);

        // Sıcaklık
        if(secilenGezegen1.getSicaklik() > secilenGezegen2.getSicaklik()){
            System.out.println(secilenGezegen2.getIsim() + " gezegeni " + secilenGezegen1.getIsim() + " gezegeninden daha soğuk.");
        }else{
            System.out.println(secilenGezegen1.getIsim() + " gezegeni " + secilenGezegen2.getIsim() + " gezegeninden daha soğuk.");
        }

        System.out.println("..........");
        Thread.sleep(1000);

        // Radyasyon
        if(secilenGezegen1.getRadyasyonOrani() > secilenGezegen2.getRadyasyonOrani()){
            System.out.println(secilenGezegen2.getIsim() + " gezegeni " + secilenGezegen1.getIsim() + " gezegeninden daha az radyoaktif.");
        }else{
            System.out.println(secilenGezegen1.getIsim() + " gezegeni " + secilenGezegen2.getIsim() + " gezegeninden daha az radyoaktif.");
        }

        System.out.println("..........");
        Thread.sleep(1000);

        // Radyasyon
        if(secilenGezegen1.getYuzolcumu() > secilenGezegen2.getYuzolcumu()){
            System.out.println(secilenGezegen2.getIsim() + " gezegeni " + secilenGezegen1.getIsim() + " gezegeninden daha küçük.");
        }else{
            System.out.println(secilenGezegen1.getIsim() + " gezegeni " + secilenGezegen2.getIsim() + " gezegeninden daha küçük.");
        }

        System.out.println("..........");
        Thread.sleep(1000);

        // Radyasyon
        if(secilenGezegen1.getYerCekimi() > secilenGezegen2.getYerCekimi()){
            System.out.println(secilenGezegen2.getIsim() + " gezegeni " + secilenGezegen1.getIsim() + " gezegeninden daha az yerçekimine sahip.");
        }else{
            System.out.println(secilenGezegen1.getIsim() + " gezegeni " + secilenGezegen2.getIsim() + " gezegeninden daha az yerçekimine sahip.");
        }

    }



}
