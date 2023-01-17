package magaza;

class Uretici {
    private String ad;
    private String adres;
    private String telefon;
    private String ePosta;
    public Uretici(String ad, String adres, String telefon, String ePosta) {
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.ePosta = ePosta;
    }
    
    public String getAd() {
        return ad;
    }
    
    public String getAdres() {
        return adres;
    }
    
    public String getTelefon() {
        return telefon;
    }
    
    public String getePosta() {
        return ePosta;
    }
}
