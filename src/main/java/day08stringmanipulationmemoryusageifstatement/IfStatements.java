package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {

        //if statemets
        //Bazi kodlari bazi sartlara gore aktive edebilmek icin if statemet kullanilir
        //if eger demek ==>if cumlesi (hukum bıldiren cumle )

        //if you study hard,you will learn java==>english
       /*
        if (you study hard){
            you will learn java  ===>Java
        }
        */

        //Ornek 1: sayi pozitif ise ekrana pozitif yazdırın

        int num = 13;

        if (num > 0) {
            System.out.println(num + " ==> pozitif");
        }

        //Ornek2:sayi -1 ile 10 arasindaysa ekrana "Rakam " yazdırın

        int n = -5;

        if (n > -1 && n < 10) {
            System.out.println("Rakam");
        }

    }
}