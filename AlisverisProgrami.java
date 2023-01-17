package magaza;



public class AlisverisProgrami {
    // Kullanıcıları saklamak için bir Kullanici[] dizisi oluşturalım
    private Kullanici[] kullanicilar;
    // Mağazaları saklamak için bir Magaza[] dizisi oluşturalım
    private Magaza[] magazalar;

    public AlisverisProgrami() {
        // kullanicilar ve magazalar dizilerini başlatın
        kullanicilar = new Kullanici[100];
        magazalar = new Magaza[100];
    }

    // Kullanıcı ekleme metodu
    public void kullaniciEkle(Kullanici kullanici) {
        // Kullanıcılar dizisine yeni bir kullanıcı ekleyin
        for (int i = 0; i < kullanicilar.length; i++) {
            if (kullanicilar[i] == null) {
                kullanicilar[i] = kullanici;
                break;
            }
        }
    }

    // Mağaza ekleme metodu
    public void magazaEkle(Magaza magaza) {
        // Mağazalar dizisine yeni bir mağaza ekleyin
        for (int i = 0; i < magazalar.length; i++) {
            if (magazalar[i] == null) {
                magazalar[i] = magaza;
                break;
            }
        }
    }

    // Kullanıcı bilgilerini listeleme metodu
    public void kullaniciBilgileriniListele(String kullaniciAdi) {
        // Kullanıcılar dizisinde adı girilen kullanıcıyı arayın
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici != null && kullanici.getAd().equals(kullaniciAdi)) {
                // Kullanıcının bilgilerini ekrana yazdırın
                System.out.println("Kullanıcı Adı: " + kullanici.getAd());
                System.out.println("Kullanıcı Soyadı: " + kullanici.getSoyad());
                System.out.println("Satın Aldığı Ürünler:");
                // Kullanıcının sepeti içinde dolaşarak, satın aldığı ürünleri listeleyin
                for (Urun urun : kullanici.getSepeti()) {
                    if (urun != null) {
                    System.out.println("- Ürün Adı: " + urun.getAd());
                    System.out.println("- Ürün Üretici: " + urun.getUretici());
                    System.out.println("- Ürün Üretici Bilgileri: " );
                    System.out.println("    -" + urun.getBilgileri().getAd());
                    System.out.println("    -" + urun.getBilgileri().getAdres());
                    System.out.println("    -" + urun.getBilgileri().getTelefon());
                    System.out.println("    -" + urun.getBilgileri().getePosta());
                    }
                    }
                    break;
                    }
                    }
                    }
// Mağaza bilgilerini listeleme metodu
public void magazaBilgileriniListele(String magazaAdi) {
    // Mağazalar dizisinde adı girilen mağazayı arayın
    for (Magaza magaza : magazalar) {
        if (magaza != null && magaza.getAd().equals(magazaAdi)) {
            // Mağazanın bilgilerini ekrana yazdırın
            System.out.println("Mağaza Adı: " + magaza.getAd());
            System.out.println("Mağaza Adresi: " + magaza.getAdres());
            System.out.println("Mağaza Takipçi Sayısı: " + magaza.getTakipciSayisi());
            System.out.println("Mağaza Yapılan Satış Sayısı: " + magaza.getYapilanSatisSayisi());
            System.out.println("Mağaza Satılan Ürünler:");
            // Mağazanın satılan ürünleri listeleyin
            for (Urun urun : magaza.getUrunler()) {
                if (urun != null) {
                    System.out.println("- Ürün Adı: " + urun.getAd());
                    System.out.println("- Ürün Üretici: " + urun.getUretici());
                    System.out.println("- Ürün Üretici Bilgileri: " );
                    System.out.println("    -" + urun.getBilgileri().getAd());
                    System.out.println("    -" + urun.getBilgileri().getAdres());
                    System.out.println("    -" + urun.getBilgileri().getTelefon());
                    System.out.println("    -" + urun.getBilgileri().getePosta());
                }
            }
            break;
        }
    }
}

// Kullanıcı sepetindeki ürünleri listeleme metodu
public void sepetiListele(String kullaniciAdi) {
    // Kullanıcılar dizisinde adı girilen kullanıcıyı arayın
    for (Kullanici kullanici : kullanicilar) {
        if (kullanici != null && kullanici.getAd().equals(kullaniciAdi)) {
            // Kullanıcının sepeti içinde dolaşarak, sepetindeki ürünleri listeleyin
            for (Urun urun : kullanici.getSepeti()) {
            if (urun != null) {
            System.out.println("- Ürün Adı: " + urun.getAd());
            System.out.println("- Ürün Üretici: " + urun.getUretici());
            System.out.println("- Ürün Üretici Bilgileri: " );
                    System.out.println("    -" + urun.getBilgileri().getAd());
                    System.out.println("    -" + urun.getBilgileri().getAdres());
                    System.out.println("    -" + urun.getBilgileri().getTelefon());
                    System.out.println("    -" + urun.getBilgileri().getePosta());
            }
            }
            break;
            }
            }
            }

            // En çok takipçiye sahip olan mağazayı bulma metodu
public void enCokTakipciyeSahipMagazayiBul() {
    Magaza enCokTakipciyeSahipMagaza = null;
    int enCokTakipci = 0;
    // Mağazalar dizisinde dolaşarak, en çok takipçiye sahip mağazayı bulun
    for (Magaza magaza : magazalar) {
        if (magaza != null && magaza.getTakipciSayisi() > enCokTakipci) {
            enCokTakipci = magaza.getTakipciSayisi();
            enCokTakipciyeSahipMagaza = magaza;
        }
    }
    // En çok takipçiye sahip mağazanın bilgilerini ekrana yazdırın
    if (enCokTakipciyeSahipMagaza != null) {
        System.out.println("En Çok Takipçiye Sahip Mağaza:");
        System.out.println("- Mağaza Adı: " + enCokTakipciyeSahipMagaza.getAd());
        System.out.println("- Mağaza Adresi: " + enCokTakipciyeSahipMagaza.getAdres());
        System.out.println("- Mağaza Takipçi Sayısı: " + enCokTakipciyeSahipMagaza.getTakipciSayisi());
        System.out.println("- Mağaza Yapılan Satış Sayısı: " + enCokTakipciyeSahipMagaza.getYapilanSatisSayisi());
    } else {
        System.out.println("Mağaza bulunamadı.");
    }
}

// En çok alışveriş yapan kullanıcıyı bulma metodu
public void enCokAlisverisYapanKullaniciyiBul() {
    Kullanici enCokAlisverisYapanKullanici = null;
    int enCokAlisveris = 0;
    // Kullanıcılar dizisinde dolaşarak, en çok alışveriş yapan kullanıcıyı bulun
    for (Kullanici kullanici : kullanicilar) {
    if (kullanici != null) {
    int alisverisSayisi = kullanici.getSatinAlmaMiktari();
    // Kullanıcının sepeti içinde dolaşarak, kullanıcının yaptığı alışveriş sayısını bulun

    if (alisverisSayisi > enCokAlisveris) {
    enCokAlisveris = alisverisSayisi;
    enCokAlisverisYapanKullanici = kullanici;
    }
    }
    }
    // En çok alışveriş yapan kullanıcının bilgilerini ekrana yazdırın
    if (enCokAlisverisYapanKullanici != null) {
    System.out.println("En Çok Alışveriş Yapan Kullanıcı:");
    System.out.println("- Kullanıcı Adı: " + enCokAlisverisYapanKullanici.getAd());
    System.out.println("- Kullanıcı Soyadı: " + enCokAlisverisYapanKullanici.getSoyad());
    System.out.println("- Alışveriş Sayısı: " + enCokAlisveris);
    } else {
    System.out.println("Kullanıcı bulunamadı.");
    }
    }

// Maksimum ve minimum beğeni alan mağazaları bulma metodu
public void maxMinBegeniAlanMagazalariBul() {
    Magaza maxBegeniAlanMagaza = null;
    int maxBegeni = 0;
    Magaza minBegeniAlanMagaza = null;
    int minBegeni = Integer.MAX_VALUE;
    // Mağazalar dizisinde dolaşarak, maksimum ve minimum beğeni alan mağazaları bulun
    for (Magaza magaza : magazalar) {
        if (magaza != null) {
            if (magaza.begeniSayisi() > maxBegeni) {
                maxBegeni = magaza.begeniSayisi();
                maxBegeniAlanMagaza = magaza;
            }
            if (magaza.begeniSayisi() < minBegeni) {
                minBegeni = magaza.begeniSayisi();
                minBegeniAlanMagaza = magaza;
            }
        }
    }
    // Maksimum ve minimum beğeni alan mağazaların bilgilerini ekrana yazdırın
    if (maxBegeniAlanMagaza != null) {
        System.out.println("Maksimum Beğeni Alan Mağaza:");
        System.out.println("- Mağaza Adı: " + maxBegeniAlanMagaza.getAd());
        System.out.println("- Mağaza Adresi: " + maxBegeniAlanMagaza.getAdres());
 
        System.out.println("- Mağaza Takipçi Sayısı: " + maxBegeniAlanMagaza.getTakipciSayisi());
        System.out.println("- Mağaza Yapılan Satış Sayısı: " + maxBegeniAlanMagaza.getYapilanSatisSayisi());
    } else {
        System.out.println("Maksimum beğeni alan mağaza bulunamadı.");
    }
    if (minBegeniAlanMagaza != null) {
        System.out.println("Minimum Beğeni Alan Mağaza:");
        System.out.println("- Mağaza Adı: " + minBegeniAlanMagaza.getAd());
        System.out.println("- Mağaza Adresi: " + minBegeniAlanMagaza.getAdres());
        System.out.println("- Mağaza Takipçi Sayısı: " + minBegeniAlanMagaza.getTakipciSayisi());
        System.out.println("- Mağaza Yapılan Satış Sayısı: " + minBegeniAlanMagaza.getYapilanSatisSayisi());
        } else {
        System.out.println("Minimum beğeni alan mağaza bulunamadı.");
        }
        }

        // Tüm sepetlerdeki ürünler arasından tutarı maksimum ve minimum olan ürünleri bulma metodu
public void maxMinTutarliUrunleriBul() {
    Urun maxTutarliUrun = null;
    int maxTutar = 0;
    Urun minTutarliUrun = null;
    int minTutar = Integer.MAX_VALUE;
    // Kullanıcılar dizisinde dolaşarak, tüm sepetlerdeki ürünler arasından tutarı maksimum ve minimum olan ürünleri bulun
    for (Kullanici kullanici : kullanicilar) {
        if (kullanici != null) {
            // Kullanıcının sepeti içinde dolaşarak, maksimum ve minimum tutarı olan ürünleri bulun
            for (Urun urun : kullanici.getSepeti()) {
                if (urun != null) {
                    int tutar = urun.getFiyat();
                    if (tutar > maxTutar) {
                        maxTutar = tutar;
                        maxTutarliUrun = urun;
                    }
                    if (tutar < minTutar) {
                        minTutar = tutar;
                        minTutarliUrun = urun;
                    }
                }
            }
        }
    }
    // Maksimum ve minimum tutarı olan ürünlerin bilgilerini ekrana yazdırın
    if (maxTutarliUrun != null) {
        System.out.println("Maksimum Tutarı Olan Ürün:");
        System.out.println("- Ürün Adı: " + maxTutarliUrun.getAd());
        System.out.println("- Ürün Fiyatı: " + maxTutarliUrun.getFiyat());
        System.out.println("- Ürün Tutarı: " + maxTutar);
        System.out.println("- Ürün Üretici: " + maxTutarliUrun.getUretici());
        System.out.println("- Ürün Üretici Bilgileri: " + maxTutarliUrun.getBilgileri());
    } else
    {
        System.out.println("Maksimum tutarı olan ürün bulunamadı.");
        }
        if (minTutarliUrun != null) {
        System.out.println("Minimum Tutarı Olan Ürün:");
        System.out.println("- Ürün Adı: " + minTutarliUrun.getAd());
        System.out.println("- Ürün Fiyatı: " + minTutarliUrun.getFiyat());
        System.out.println("- Ürün Tutarı: " + minTutar);
        System.out.println("- Ürün Üretici: " + minTutarliUrun.getUretici());
        System.out.println("- Ürün Üretici Bilgileri: " + minTutarliUrun.getBilgileri());
        } else {
        System.out.println("Minimum tutarı olan ürün bulunamadı.");
        }
        }
    // Karmaşık String araması yapma metodu
public void karmasikStringArama(String baslangic, String bitis) {
    // Örneğin adı 'a' ile başlayan ve sonu 't' ile biten kullanıcıların satın aldığı ürünlerin sayısı ekrana gösterilebilir
    int sayac = 0;
    // Kullanıcılar dizisinde dolaşarak, arama koşullarını sağlayan kullanıcıları bulun
    for (Kullanici kullanici : kullanicilar) {
        if (kullanici != null && kullanici.getAd().startsWith(baslangic.charAt(0) + "")  && kullanici.getAd().endsWith(bitis.charAt(0) + "")) {
            // Kullanıcının sepeti içinde dolaşarak, kullanıcının satın aldığı ürünlerin sayısını bulun
            for (Urun urun : kullanici.getSepeti()) {
                if (urun != null) {
                    sayac += 1;
                }
            }
        }
    }
    // Bulunan ürün sayısını ekrana yazdırın
    System.out.println("Arama Koşullarını Sağlayan Kullanıcıların Satın Aldığı Ürünlerin Sayı: " + sayac);
}


public void getIndirim(Kullanici user, Urun urun){
    System.out.println(user.getAd() + " "+user.getKullaniciTipi() + " bir kullanıcı olduğu için " + urun.getAd() +" ürün fiyatı " + urun.getKullanıcıFiyat(user));
}
}
