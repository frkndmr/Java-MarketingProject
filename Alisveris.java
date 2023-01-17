package magaza;

public class Alisveris {
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici("Furkan", "Demir","Normal");
        Kullanici kullanici2 = new Kullanici("Ece", "Ucar","Premium");
        Kullanici kullanici3 = new Kullanici("Ahmet", "Yılmaz","Normal");
        Kullanici kullanici4 = new Kullanici("Mehmet", "Yeşil","Premium");

        Uretici uretici1 = new Uretici("Halk Ekmek Anonim AS","İstanbul Fatih","01230120122","halk@ekmek.com");
        Urun urun1 = new Urun("Ekmek","Halk Ekmek", uretici1,5,100);
        Urun urun6 = new Urun("Poğaça","Halk Ekmek", uretici1,7,100);
        Magaza magaza = new Magaza("Karaca Fırın","Gümüşhane");

        Uretici uretici2 = new Uretici("Mavi Giyim","Antalya","01230120122","mavi@mavi.com");
        Urun urun2 = new Urun("Sweat","Mavi", uretici2,50,20);
        Urun urun3 = new Urun("Mont","Mavi", uretici2,500,20);
        Urun urun4 = new Urun("Pantolon","Mavi", uretici2,350,20);
        Urun urun5 = new Urun("Çorap","Mavi", uretici2,20,20);
        Magaza magaza2 = new Magaza("Mavi","Trabzon");



        magaza.urunEkle(urun1);
        magaza.urunEkle(urun6);
        // 9. Özellik sepete ürün ekleme
        kullanici1.sepeteUrunEkle(urun1);
        // 11. Özellik Ürün beğenme mağaza takip etme
        kullanici1.urunBegen(urun1);
        kullanici1.magazaTakipEt(magaza,kullanici1);
        kullanici1.satinAl();
        magaza.satisYap();
        
        magaza2.urunEkle(urun2);
        magaza2.urunEkle(urun3);
        magaza2.urunEkle(urun4);
        magaza2.urunEkle(urun5);
        kullanici2.sepeteUrunEkle(urun2);
        kullanici2.urunBegen(urun2);
        kullanici2.magazaTakipEt(magaza2,kullanici2);
        kullanici2.satinAl();
        magaza2.satisYap();

        kullanici3.sepeteUrunEkle(urun2);
        kullanici3.urunBegen(urun2);
        kullanici3.magazaTakipEt(magaza2,kullanici3);

        kullanici2.sepeteUrunEkle(urun1);
        kullanici2.satinAl();
        magaza.satisYap();

        kullanici3.sepeteUrunEkle(urun1);
        kullanici3.urunBegen(urun1);
        kullanici3.satinAl();
        magaza.satisYap();

        kullanici4.sepeteUrunEkle(urun1);
        kullanici4.satinAl();
        magaza.satisYap();

        kullanici1.sepeteUrunEkle(urun2);
        kullanici1.urunBegen(urun2);
        kullanici1.satinAl();
        magaza2.satisYap();
        
        kullanici4.sepeteUrunEkle(urun3);
        kullanici1.satinAl();
        magaza2.satisYap();
        



        

        AlisverisProgrami alisverisProgrami = new AlisverisProgrami();
        alisverisProgrami.kullaniciEkle(kullanici1);
        alisverisProgrami.kullaniciEkle(kullanici2);
        alisverisProgrami.kullaniciEkle(kullanici3);
        alisverisProgrami.kullaniciEkle(kullanici4);
        alisverisProgrami.magazaEkle(magaza);
        alisverisProgrami.magazaEkle(magaza2);

        // 1. Özellik
        alisverisProgrami.kullaniciBilgileriniListele("Furkan");

        System.out.println("##################################");

        // 2. Özellik
        alisverisProgrami.magazaBilgileriniListele("Karaca Fırın");

        System.out.println("##################################");

        // 3. Özellik
        alisverisProgrami.sepetiListele("Furkan");

        System.out.println("##################################");

        // 4. Özellik
        alisverisProgrami.enCokTakipciyeSahipMagazayiBul();

        System.out.println("##################################");

        // 5. Özellik

        alisverisProgrami.enCokAlisverisYapanKullaniciyiBul();

        System.out.println("##################################");

        // 6. Özellik
        alisverisProgrami.maxMinBegeniAlanMagazalariBul();

        System.out.println("##################################");

        // 7. Özellik
        alisverisProgrami.maxMinTutarliUrunleriBul();

        System.out.println("##################################");

        // 8. Özellik
        // Kullanıcının isminin ilk ve son harfini girdiğinde kullanıcıyı bulup sepetindeki ürün miktarını sayar
        alisverisProgrami.karmasikStringArama("F","n");


        // 9. Özellik Sepetten ürün silme
        System.out.println("##################################");
        System.out.println("Ürün 1 silinmeden önce sepet");
        alisverisProgrami.sepetiListele("Furkan");
        kullanici1.sepettenUrunSil(urun1);
        System.out.println("##################################");
        System.out.println("Ürün 1 silindikten sonra sepet");
        alisverisProgrami.sepetiListele("Furkan");
        System.out.println("##################################");

        // 10. Özellik
        alisverisProgrami.getIndirim(kullanici1, urun2);
        alisverisProgrami.getIndirim(kullanici2, urun2);





        //alisverisProgrami.sepetiListele("Furkan");
        /*alisverisProgrami.sepetiListele("Ece");
        alisverisProgrami.sepetiListele("Ahmet");
        alisverisProgrami.sepetiListele("Mehmet");

        alisverisProgrami.kullaniciBilgileriniListele("Furkan");
        alisverisProgrami.magazaBilgileriniListele("Karaca Fırın");
        alisverisProgrami.kullaniciBilgileriniListele("Ece");
        alisverisProgrami.magazaBilgileriniListele("Mavi");
        alisverisProgrami.kullaniciBilgileriniListele("Ahmet");
        alisverisProgrami.kullaniciBilgileriniListele("Mehmet");*/

        //alisverisProgrami.maxMinTutarliUrunleriBul();
        
        //alisverisProgrami.enCokTakipciyeSahipMagazayiBul();

        //alisverisProgrami.enCokAlisverisYapanKullaniciyiBul();

        //alisverisProgrami.maxMinBegeniAlanMagazalariBul();

    }
}
