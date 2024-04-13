package JavaProg;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {

        String name = "Vrushabh";
        System.out.println(name);

        int value = name.length();
        System.out.println("lenght of the string is: "+value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        System.out.println(name.substring(3)); // this will return all the characters after 3rd index number

        System.out.println(name.substring(3,7)); // This will print all the character in between the index number provided

        System.out.println(name.replace('a','d')); // This will replace the character a with d in the string

        System.out.println(name.startsWith("Vru"));
        System.out.println(name.startsWith("abc"));
        System.out.println(name.endsWith("abh"));
        System.out.println(name.endsWith("qwe"));

        System.out.println(name.charAt(2)); // this will return the character at index 2

        System.out.println(name.equals("Vrushabh")); // compare the string and return true or false
        System.out.println(name.equalsIgnoreCase("vrushaBH")); // ignore the case and just compare the value and return true or false
    }
}
