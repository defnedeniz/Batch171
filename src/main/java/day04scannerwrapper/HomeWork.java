package day04scannerwrapper;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {



        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5

        /*Scanner input= new Scanner(System.in);
        System.out.println("Lutfen 3 tane sayi giriz : ");
        double number1= input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();
        System.out.println((number1+number2+number3)/3);*/

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner input2= new Scanner(System.in);
        System.out.println("Uc rakamli bir sayi giriniz ");
        int sayi= input2.nextInt();

        //son rakami al
        int birlerBasamagi = sayi % 10;
        //sayiyi kucult
        sayi = sayi/ 10;

        System.out.println(birlerBasamagi);

        //sondan ikinci rakami al
        int sondanIkinci = sayi % 10;
        //sayiyi kucult
        sayi = sayi / 10;
        System.out.println(sondanIkinci);

        //sondan ucuncu rakami al
        int sondanUcuncu = sayi % 10;
        //sayiyi kucult
        sayi = sayi / 10;

        System.out.println(sondanUcuncu);

        System.out.println(birlerBasamagi+sondanIkinci+sondanUcuncu);






    }}
