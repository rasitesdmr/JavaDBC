public class Araba {
    int modelYil;  //Nesneye ait değişken
    String plaka;  //Nesneye ait değişken
    String marka;  //Nesneye ait değişken

    private static int arabaSayisi; // Sınıfa ait değişken

    public Araba(int modelYil, String plaka, String marka) {
        this.modelYil = modelYil;
        this.plaka = plaka;
        this.marka = marka;
        arabaSayisi++ ; // Her yarattığımız nesne için araba sayımızı 1 artırsın.

    }
    public static int getArabaSayisi(){
        return arabaSayisi;
    }
}
