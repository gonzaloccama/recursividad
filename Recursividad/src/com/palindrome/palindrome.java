package com.palindrome;

/**
 * Created by Ccama on 29/06/2017.
 */
public class palindrome {
    public static boolean Palindrome(int ini, int fin, String txt){
        if(ini < fin){
            if (txt.charAt(ini) == txt.charAt(fin)){
                return Palindrome(++ini, --fin, txt);
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean Palindrome(String txt){
        String t = "áéíóú", r = "aeiou";

        for (int i = 32; i < 65 ; i++){
            txt = txt.replace((char)i + "", "");
        }
        for (int i = 65; i < 91; i++) {
            txt = txt.replace((char)i + "", (char)(i + 32) + "");
        }
        for (int i = 0; i < t.length(); i++) {
            txt = txt.replace(t.charAt(i) + "", r.charAt(i) + "");
        }
        return Palindrome(0, txt.length()-1, txt);
    }

    public static void main(String[] args) {
        String txt = "No lata, no: la totalidad arada dilato talón a talón.";
        String text = "Madam, in Eden I'm Adam";
        String frase = "Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, " +
                "ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, " +
                "anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico " +
                "camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina " +
                "y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida";

        if (Palindrome(text)){
            System.out.println("Palindrome!!");
        }else {
            System.out.println("No Palindrome!!");
        }
    }
}
