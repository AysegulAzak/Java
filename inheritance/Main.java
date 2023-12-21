import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //Akademisyen a = new Akademisyen("Ahmet", "a@gmail.com", "05550000000", "CENG", "Hoca", "CENG 101");

        OgretimUyesi o = new OgretimUyesi("Mehmet", "m@gmail.com", "000", "CENG", "Hoca", "CENG 102", "Doçent");

        Memurlar m = new Memurlar("Veli", "a@gmail.com", "05550000000", "Bilgi İşlem", "Tam zamanlı");

       /* Calisan c = new Akademisyen("Ahmet", "a@gmail.com", "05550000000", "CENG", "Hoca", "CENG 101");

        Calisan[] girisListesi = {a, o, m};

        Calisan.listele(girisListesi);
*/

        o.derseGir(10);


    }
}