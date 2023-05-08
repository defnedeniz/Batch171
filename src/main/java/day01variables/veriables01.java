package day01variables;

public class veriables01 {


    public static void main(String[] args) {

        //java bu satiri okumaz, kendimize ve baskalarina aciklama satiridir
        /*
        java bu satirlari da okumaz
         */

        //Variable nasil olusturulur?
        //Data type + variable name + Assignment Operator(atama operatoru) + Variable degeri+ noktali virgul
        int                 age                  =                              13                  ;

        //java cumlesi => statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gosterir.
        //Eger variable declaration yapar,Assignment yapmazsaniz java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir.
        //Java da "=" assignment operator dir. ve java bu operatoru gordugu zaman once sag tarafi calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Java da esitir demek "=="        Matematikte"=",  Javada "=="
        //Data type + VariableName ==> Variable declariton
        //Assignment Operator (=) + Variabel degeri ==> Assignment

        /*
        Javada temelde iki tip data vardir
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double
            2)non-primitive data type:
                String
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Data type + variable name + Assignment Operator(atama operatoru) + Variable degeri+ noktali virgul
        String        ogrenciAdi              =                                 "Ali Can "            ;

        //String lere verilen degerler daima cift tirnak icinde yazilmalidir
        //String ler icin "default value"(==>varsayilan deger) "null" dir
        /*
        String bir variable olusturdugumuzda cogu zaman ona bir deger atariz. Atama yapmazsak, java o varibale a
        varsayilan deger olarak null koyar
        -null demek 0 demek degildir, 0 da coding te bir degerdir, null hiclik demektir.
        -icinde variable yada method bulunmayan bos bir obje demektir
         */


        //char data type
        //TEK karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //ornegin ==> A,x, ?, 5,...
        //Ornek 2: char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A' ;

        //Note: char data type inda degerler daima tek tirnak icinde yazilmalidir
    }



}

