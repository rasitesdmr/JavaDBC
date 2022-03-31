public class Main {
    public static void main(String[] args) {
        System.out.println("Başlangıçta araba sayımız :" +Araba.getArabaSayisi());

        Araba araba = new Araba(2015,"12 DEF 34","Nissan");
        Araba araba1 = new Araba(2014,"58 SVS 58" ,"Hyundai");

        int arabaSayiyimiz;

        arabaSayiyimiz = Araba.getArabaSayisi();
        System.out.println("Araba Sayısı  :  " + arabaSayiyimiz);

    }
}
