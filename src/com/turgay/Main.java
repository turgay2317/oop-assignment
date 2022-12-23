package com.turgay;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Veritabanı bağlantısı
        Veritabani vt = new Veritabani();

        // Gezegenleri çekme
        ArrayList<Gezegen> gezegenler = vt.gezegenleriGetir();

        // Referans canlı
        Hayvan insan = new Hayvan();

        // Referans gezegen
        KarasalGezegen dunya = new KarasalGezegen("Dünya",-10,new Gazlar(0.005f, 0.005f, 0.21f, 0.78f),0,0,30,true,5,1);

        // Komut arayüzü
        KomutArayuzu.hosgeldin();
        KomutArayuzu.tanitim();

        // Gezegen sistemi
        GezegenSistemi gezegenSistemi = new GezegenSistemi(dunya, insan, gezegenler);

        KomutArayuzu.baslangic();

        while(true){

            System.out.print("Yeni komut giriniz: ");

            switch (scanner.nextInt()){
                case 1:
                    // Gezegenlerin Listelenmesi
                    System.out.println("200 ışık yılı uzaklıktaki gezegenlere kadar gezegen sorgusu yapabilirsiniz.");
                    System.out.print("Uzaklık değeri giriniz (ışık-yılı cinsinden): ");
                    int uzaklik = scanner.nextInt();
                    ArrayList<Gezegen> sorgu = vt.gezegenleriGetir(uzaklik);
                    System.out.println(uzaklik + " ışık yılı uzaklıkta " + sorgu.size() + " gezegen bulunmaktadır.");
                    int indis = 0;
                    for(Gezegen gezegen : sorgu){
                        System.out.print(indis);
                        gezegen.gezegenDetay();
                        indis++;
                    }
                    break;

                case 2:
                    // Manuel Gezegen oluşturma
                    KomutArayuzu.baslikYaz("GEZEGEN EKLEME PANELİ (GEP)");
                    Gezegen yeniGezegen = KomutArayuzu.gep(scanner, gezegenSistemi);
                    vt.gezegenEkle(yeniGezegen);
                    System.out.println("GEZEGEN BAŞARILI BİR ŞEKİLDE SİSTEME EKLENDİ!");
                    yeniGezegen.gezegenDetay();
                    break;

                case 3:
                    // Random Gezegen oluşturma
                    System.out.println("RASTGELE GEZEGEN EKLEME PANELİ (R-GEP)");
                    Gezegen rastgeleGezegen = KomutArayuzu.rgep();
                    vt.gezegenEkle(rastgeleGezegen);
                    System.out.println("RASTGELE GEZEGEN BAŞARILI BİR ŞEKİLDE SİSTEME EKLENDİ!");
                    rastgeleGezegen.gezegenDetay();
                    break;

                case 4:
                    // Gezegen Güncelleme
                    System.out.println("GEZEGEN GÜNCELLEME PANELİ (GGP)");
                    ArrayList<Gezegen> tum_gezegenler = vt.gezegenleriGetir();
                    int ind = 0;
                    for(Gezegen gezegen : tum_gezegenler){
                        System.out.print(ind);
                        gezegen.gezegenDetay();
                        ind++;
                    }
                    System.out.println("TÜM GEZEGENLER LİSTELENDİ!");
                    KomutArayuzu.ggp(scanner, gezegenSistemi);
                    break;

                case 5:
                    // Yaşam olasılığı hesaplama
                    System.out.println("GEZEGEN YAŞAM OLASILIĞI HESAPLAMA PANELİ (GYO-HP)");
                    double olasilik = KomutArayuzu.gyohp(scanner, gezegenSistemi);
                    System.out.println("%" + olasilik);
                    break;

                case 6:
                    // Gezegen Kıyaslama
                    System.out.println("GEZEGEN KIYASLAMA PANELİ (GKP)");
                    KomutArayuzu.gkp(scanner, gezegenSistemi);
                    break;
            }

        }

    }
}
