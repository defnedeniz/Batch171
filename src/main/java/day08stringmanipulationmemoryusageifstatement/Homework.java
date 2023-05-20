package day08stringmanipulationmemoryusageifstatement;

public class Homework {

    public static void main(String[] args) {

        //  1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz

       String myString = "H3llo W0rld! 123";
        StringBuilder result = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (!Character.isDigit(c)) {
                result.append(c);
            }
        }

        System.out.println(result);


        // 2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz


        String myString2 = "example";
        StringBuilder result2 = new StringBuilder();

        for (int i = 1; i < myString2.length() - 1; i++) {
            char c = myString.charAt(i);
            result2.append(Character.toUpperCase(c));

        }
        System.out.println(result2);
    }



}



