package magaza;

class Kullanici {
    private String ad;
    private String soyad;
    private int satınAlmaMiktari;
    private Urun[] sepeti;
    private Magaza[] takipEttikleri;
    private Urun[] begendikleri;
    private String kullaniciTipi;

public Kullanici(String ad, String soyad, String kullaniciTipi) {
    this.ad = ad;
    this.soyad = soyad;
    this.kullaniciTipi = kullaniciTipi;
    this.satınAlmaMiktari = 0;
    this.sepeti = new Urun[10];
    this.takipEttikleri = new Magaza[10];
    this.begendikleri = new Urun[10];
}

public String getAd() {
    return ad;
}

public String getSoyad() {
    return soyad;
}

public String getKullaniciTipi() {
    return kullaniciTipi;
}

public Urun[] getSepeti() {
    return sepeti;
}

public Magaza[] getTakipEttikleri() {
    return takipEttikleri;
}

public Urun[] getBegendikleri() {
    return begendikleri;
}

public int getSatinAlmaMiktari(){
    return satınAlmaMiktari;
}

public int satinAl(){
    return satınAlmaMiktari++;
}


// Sepete ürün ekleme metodu
public void sepeteUrunEkle(Urun urun) {
    boolean eklendi = false;
    // Sepette boş yer varsa ürünü sepete ekleyin
    for (int i = 0; i < sepeti.length; i++) {
        if (sepeti[i] == null) {
            sepeti[i] = urun;
            eklendi = true;
            break;
        }
    }
    // Sepette boş yet yoksa, sepeti boyutunu 1 arttırarak ürünü sepete ekleyin
if (!eklendi) {
Urun[] yeniSepet = new Urun[sepeti.length + 1];
for (int i = 0; i < sepeti.length; i++) {
yeniSepet[i] = sepeti[i];
}
yeniSepet[sepeti.length] = urun;
sepeti = yeniSepet;
}
}
// Sepetten ürün silme metodu
public void sepettenUrunSil(Urun urun) {
    // Sepette bulunan ürünler arasından ürünü silin
    for (int i = 0; i < sepeti.length; i++) {
        if (sepeti[i] != null && sepeti[i].equals(urun)) {
            sepeti[i] = null;
            break;
        }
    }
}

// Mağaza takip etme metodu
public void magazaTakipEt(Magaza magaza, Kullanici kullanici) {
    // Takip ettiğiniz mağazalar listesine mağazayı ekleyin
    boolean eklendi = false;
    // Magazada boş yer varsa ürünü ekleyin
    for (int i = 0; i < takipEttikleri.length; i++) {
        if (takipEttikleri[i] == null) {
            takipEttikleri[i] = magaza;
            eklendi = true;
            break;
        }
    }
    // Magazada boş yer yoksa, magazadaki ürünlerin listesini 1 arttırarak ürünü ekleyin
    if (!eklendi) {
        Magaza[] yeniMagaza = new Magaza[takipEttikleri.length + 1];
        for (int i = 0; i < takipEttikleri.length; i++) {
            yeniMagaza[i] = takipEttikleri[i];
        }
        yeniMagaza[takipEttikleri.length] = magaza;
        takipEttikleri = yeniMagaza;
    }
    magaza.takipEt(kullanici);
}

// Mağazayı takipten çıkarma metodu
public void magazayiTakiptenCikar(Magaza magaza) {
    // Takip ettiğiniz mağazalar listesinden mağazayı çıkarın
    for (int i = 0; i < takipEttikleri.length; i++) {
        if (takipEttikleri[i] != null && takipEttikleri[i].equals(magaza)) {
            takipEttikleri[i] = null;
            break;
        }
    }
}

// Ürün beğenme metodu
public void urunBegen(Urun urun) {
    // Beğendiğiniz ürünler listesine ürünü ekleyin
    boolean eklendi = false;
    // Magazada boş yer varsa ürünü ekleyin
    for (int i = 0; i < begendikleri.length; i++) {
        if (begendikleri[i] == null) {
            begendikleri[i] = urun;
            eklendi = true;
            break;
        }
    }
    // Magazada boş yer yoksa, magazadaki ürünlerin listesini 1 arttırarak ürünü ekleyin
    if (!eklendi) {
        Urun[] yeniUrun = new Urun[begendikleri.length + 1];
        for (int i = 0; i < begendikleri.length; i++) {
            yeniUrun[i] = begendikleri[i];
        }
        yeniUrun[begendikleri.length] = urun;
        begendikleri = yeniUrun;
    }
}

// Ürün beğenmeme metodu
public void urunBegenme(Urun urun) {
    // Beğendiğiniz ürünler listesinden ürünü çıkarın
    for (int i = 0; i < begendikleri.length; i++) {
        if (begendikleri[i] != null && begendikleri[i].equals(urun)) {
            begendikleri[i] = null;
            break;
        }
    }
}
}
