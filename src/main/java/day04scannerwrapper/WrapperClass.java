package day04scannerwrapper;

import java.awt.image.ByteLookupTable;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive     :   char     -  boolean - byte - short - int     - long  - float - double
        //Wrapper Class :  Character -  Boolean - Byte - Short - Integer - Long  - Float - Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //o yuzden sart degilse  Wrapper class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz, cunku primitive ler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz, cunku wrapper classlar method icerir
        Integer m=12;

        byte p = 13;
        Byte r = 13;

        //Ornek 1: short data type inin minimum ve maximum degerlerin kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //Ornek 2: int data type inin minumum degeri ile byte data typeinin maximum degerinin toplamini bulunuz.

          int minValu=Integer.MIN_VALUE;
          byte maxValue=Byte.MAX_VALUE;
          System.out.println( minValu+maxValue);//minValu = -2147483648

        //ornek 3 : Primitive int i wapper Integer a ceviriniz.(interviewlerde sorulabılıyor)(Auotoboxing)

        int num = 12;
        Integer wapperNum =num;
        System.out.println("wapperNum = " + wapperNum);

        // ornek 4: Wapper byte i primitive byte ceviriniz (unboxing)

        Byte k=12;
        byte primitiveK=k;
        System.out.println("primitiveK = " + primitiveK);

        //ornek 5: primitive  char i wapper Character e ceviriniz (Auotoboxing)

        char x='x';
        Character wapperX=x;
        System.out.println("wapperX = " + wapperX);

        // ornek 4: Wapper Bloone i primitive bloone ceviriniz (unboxing)

         Boolean isOldWapper=true;
         boolean primitiveIsOldWapper=isOldWapper;
        System.out.println("primitiveIsOldWapper = " + primitiveIsOldWapper);






    }

}

