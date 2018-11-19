package Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Ccama on 28/06/2017.
 */
public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

        hashtable.put(14, "Juan");
        hashtable.put(12, "Carlos");
        hashtable.put(100, "Maria");
        hashtable.put(152, "Luz");

        System.out.println(hashtable);

        Enumeration<String> tabla = hashtable.elements();
        Enumeration<Integer> cod = hashtable.keys();

        while (tabla.hasMoreElements()){
            System.out.println(cod.nextElement() +  " = " + tabla.nextElement());
        }

        Enumeration<Integer> del = hashtable.keys();
        while (del.hasMoreElements()){
            hashtable.remove(del.nextElement());
        }

        hashtable.put(200, "Vanessa");

        System.out.println(hashtable);

    }
}
