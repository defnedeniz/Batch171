package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a)Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar
        //b)cevresini hesaplayiniz ==> 2*kisa kenar + 2*uzun kenar

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen dikdorgenin kisa kenarini giriniz : ");
        double a=input.nextDouble();
        System.out.println("Lutfen dikdorgenin uzun kenarini giriniz : ");
        double b=input.nextDouble();
        System.out.println("Dikdortgenin alani ="  + (a*b));
        System.out.println("Dikdortgenin cevresi =" + ((a+b)*2+2));

    }
}


