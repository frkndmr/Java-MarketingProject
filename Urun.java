package magaza;

class Urun {
    private String ad;
    private String üretici;
    private int fiyat;
    private int adet;
    private Uretici bilgileri;
    public Urun(String ad, String üretici, Uretici bilgileri, int fiyat,int adet) {
        this.ad = ad;
        this.üretici = üretici;
        this.bilgileri = bilgileri;
        this.fiyat = fiyat;
        this.adet = adet;
    }
    
    public String getAd() {
        return ad;
    }

    public double getKullanıcıFiyat(Kullanici user){
        double indirim = (double)fiyat;
        if(user.getKullaniciTipi() == "Premium"){
            indirim = fiyat*0.75;
        }
        return indirim;
    }

    public int getFiyat(){
        return fiyat;
    }

    public int getAdet(){
        return adet;
    }
    
    public String getUretici() {
        return üretici;
    }
    public Uretici getBilgileri() {
        return bilgileri;
        }
        }
        
        

