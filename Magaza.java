package magaza;

class Magaza {
    private String ad;
    private String adres;
    private int takipciSayisi;
    private int yapilanSatisSayisi;
    private Urun[] urunler;
    private Kullanici[] takipEdenler;

    public Magaza(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
        this.takipciSayisi = 0;
        this.yapilanSatisSayisi = 0;
        this.urunler = new Urun[10];
        this.takipEdenler = new Kullanici[10];
}
public String getAd() {
    return ad;
}

public String getAdres() {
    return adres;
}



public int getTakipciSayisi() {
    return takipciSayisi;
}

public int getYapilanSatisSayisi() {
    return yapilanSatisSayisi;
}

public Urun[] getUrunler() {
    return urunler;
}

public Kullanici[] getTakipEdenler() {
    return takipEdenler;
}

// Ürün ekleme metodu
public void urunEkle(Urun urun) {
    boolean eklendi = false;
    // Magazada boş yer varsa ürünü ekleyin
    for (int i = 0; i < urunler.length; i++) {
        if (urunler[i] == null) {
            urunler[i] = urun;
            eklendi = true;
            break;
        }
    }
    // Magazada boş yer yoksa, magazadaki ürünlerin listesini 1 arttırarak ürünü ekleyin
    if (!eklendi) {
        Urun[] yeniUrunler = new Urun[urunler.length + 1];
        for (int i = 0; i < urunler.length; i++) {
            yeniUrunler[i] = urunler[i];
        }
        yeniUrunler[urunler.length] = urun;
        urunler = yeniUrunler;
    }
}

// Ürün silme metodu
public void urunSil(Urun urun) {
    // Magazadaki ürünler arasından ürünü silin
    for (int i = 0; i < urunler.length; i++) {
        if (urunler[i] != null && urunler[i].equals(urun)) {
            urunler[i] = null;
            break;
        }
    }
}

// Mağazayı takip etme metodu
public void takipEt(Kullanici kullanici) {

    boolean eklendi = false;
    // Magazada boş yer varsa kullanıcıyı ekleyin
    for (int i = 0; i < takipEdenler.length; i++) {
        if (takipEdenler[i] == null) {
            takipEdenler[i] = kullanici;
            eklendi = true;

            break;
        }
    }
    // Mağazayı takip edenler listesine kullanıcıyı ekleyin
    if (!eklendi) {
        Kullanici[] yeniKullanıcı = new Kullanici[takipEdenler.length + 1];
        for (int i = 0; i < takipEdenler.length; i++) {
            yeniKullanıcı[i] = takipEdenler[i];
        }
        yeniKullanıcı[takipEdenler.length] = kullanici;
        takipEdenler = yeniKullanıcı;

    }

    

    // Mağaza takipçi sayısını 1 arttırın
    takipciSayisi++;
}

// Mağazayı takip etmeyi bırakma metodu
public void takiptenCikar(Kullanici kullanici) {
    // Mağazayı takip edenler listesinden kullanıcıyı çıkarın
    for (int i = 0; i < takipEdenler.length; i++) {
        if (takipEdenler[i] != null && takipEdenler[i].equals(kullanici)) {
            takipEdenler[i] = null;
            break;
        }
    }
    // Mağaza takipçi sayısını 1 azaltın
    takipciSayisi--;
    }
// Satış yapma metodu
public void satisYap() {
    // Mağazanın yapmış olduğu satış sayısını 1 arttırın
    yapilanSatisSayisi++;
}

// Maksimum beğeni alan mağazayı bulma metodu
public static Magaza enCokBegenilenMagaza(Magaza[] magazalar) {
    Magaza enCokBegenilenMagaza = magazalar[0];
    for (int i = 1; i < magazalar.length; i++) {
        if (magazalar[i].begeniSayisi() > enCokBegenilenMagaza.begeniSayisi()) {
            enCokBegenilenMagaza = magazalar[i];
        }
    }
    return enCokBegenilenMagaza;
}

// Minimum beğeni alan mağazayı bulma metodu
public static Magaza enAzBegenilenMagaza(Magaza[] magazalar) {
    Magaza enAzBegenilenMagaza = magazalar[0];
    for (int i = 1; i < magazalar.length; i++) {
        if (magazalar[i].begeniSayisi() < enAzBegenilenMagaza.begeniSayisi()) {
            enAzBegenilenMagaza = magazalar[i];
        }
    }
    return enAzBegenilenMagaza;
}

// Mağazanın beğeni sayısını bulma metodu
public int begeniSayisi() {
    int begeniSayisi = 0;
    for (Kullanici kullanici : takipEdenler) {
        if(kullanici == null){
            break;
        }
        for(int i=0;i<10;i++){
            if(kullanici.getBegendikleri()[i] != null){
                begeniSayisi++;
            }
            else{
                break;
            }
        }
    }
    return begeniSayisi;
}
}