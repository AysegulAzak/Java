public class OgretimUyesi extends Akademisyen {
    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    String unvan;

    @Override
    public String giris() {
        return this.unvan + " " + super.giris();
    }

    public OgretimUyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders, String unvan) {
        super(adSoyad, eposta, telefon, bolum, gorevler, ders);
        this.unvan = unvan;
    }
    public void derseGir(int dersSaati) {
        System.out.println(getUnvan() + " " + getAdSoyad() + " "+ getDers()+" saat "+ dersSaati + " Dersine girdi");
    }
}
