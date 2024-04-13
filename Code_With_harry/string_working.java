package Code_With_harry;

import java.util.*;

public class string_working {
    public static void main(String[] args) {
//        String name = "Vrushabh";
//        System.out.println(name);
//        int value = name.length();
//        System.out.println(value);
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(3,7));
//        System.out.println(name.replace('u','b'));
//        System.out.println(name.startsWith("d"));
//        System.out.println(name.endsWith("h"));
//        System.out.println(name.charAt(3));
//        System.out.println(name.indexOf('b'));
//        System.out.println(name.lastIndexOf(""));
//        System.out.println(name.equals("awfwfea"));
//        System.out.println(name.equalsIgnoreCase("VRUSHABH"));
//
//        name += " Gurjar";
//        System.out.println(name);

        // Print only the words having even letters
//        String a = "My name is vrushabh and I am good";
//        String [] words = a.split(" ");
//        for (String word: words){
//            int lengthofword = word.length();
//            if(lengthofword%2==0){
//                System.out.println(word);
//            }
//        }
        // Print  only the unique words in the string
//        String str = "hello vrushabh whats up Hello ashlu whats up hi";
//        String[] words = str.split(" ");
//            int count;
//            for (int i=0; i< words.length;i++){
//                count = 1;
//
//                for (int j=i+1; j< words.length;j++){
//                    if(words[i].equalsIgnoreCase(words[j])){
//                        count ++;
//                        words[j]= ("");
//                    }
//                }
//                if (count == 1 && words[i] != ""){
//                    System.out.println(words[i]);
//                }
//            }
        // Print unique char in string
//        String s = "selenium is java";
//        for(int i=0; i<s.length();i++){
//            int flag =0;
//            for(int j=0; j<s.length(); j++){
//                if(s.charAt(i)==s.charAt(j) && i!=j){
//                    flag =1;
//                    break;
//                }
//            }
//            if(flag==0){
//                System.out.println(s.charAt(i));
//            }
//        }

        // Insert new string in between old string
//        String original = "Vrushabh gurjar";
//        String insert = "Sunil";
//        String newstr = new String();
//        int charat = 8;
//
//        for(int i = 0; i< original.length(); i++){
//            newstr += original.charAt(i);
//            if(i==charat){
//                newstr += insert;
//            }
//        }
//        System.out.println(newstr);

        // Reverse the String and also check palindrome
//        String name = "ababa";
//        String rev = "";
//        for (int i = name.length()-1;i>=0;i--){
//            rev = rev + name.charAt(i);
//        }
//        if (rev.equalsIgnoreCase(name)){
//            System.out.println("String is palindrome");
//        }else{
//            System.out.println("String not palindrome");
//        }
//        System.out.println(rev);

        // Adding one charter at index 5
//        String a = "abcdefg";
//        Character d = 's';
//        String c = new String();
//        int b = 5;
//        for (int i = 0; i<a.length(); i++){
//            c += a.charAt(i);
//
//            if(i==b){
//                c+= d;
//            }
//        }
//        System.out.println(c);

        // Iterater for each char in string
//        String name = "Vrushabh";
//        for (int i=0; i<name.length(); i++){
//            System.out.print(name.charAt(i)+" ");
//        }

//        // String to array
//
//        String name = "Vrushabh sunil gurjar";
//
//        String [] arr = name.split(" ");
//        System.out.print("[ ");
//        for(String abc: arr){
//
//            System.out.print(abc+" ");
//
//        }
//        System.out.print(" ]");

        // Swapping the char in string

//        String name = "Vrushabh";
//        char [] ch = name.toCharArray();
//
//        for (int i=0; i<ch.length-1;i+=2){
//            char c = ch[i];
//            ch[i] = ch[i+1];
//            ch[i+1]=c;
//        }
//        System.out.println(ch);

        // String Builder
//         StringBuilder sb = new StringBuilder("Vrushabh");
//        System.out.println(sb.append(" Gurjar"));
//        sb.setCharAt(2,'t');
//        System.out.println(sb);
//
//        String ew = "00000123456";
//        String newstr = "";
//        int a =0;
//        for(int i=0;i<ew.length();i++){
//            char ch = ew.charAt(i);
//            if(ch !='0'){
//                a=i;
//                break;
//            }
//        }
//        newstr = ew.substring(a,ew.length());
//        System.out.println(newstr);


////        //Sorting of the String
//        String name = "vrushabh";
//        char arr[] = name.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(arr);

//        int[] arr = {1,4,2,6,1,9,5,8,'e','r','d'};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        String[] abc = {"qwerty","vrushabh","ashlu","akshu"};
//        Arrays.sort(abc);
//        System.out.println(Arrays.toString(abc));

//        String name = "Vrushabh";
//        String rev = "";
//        for (int i = name.length()-1; i>=0; i--){
//            rev = rev + name.charAt(i);
//        }
//        System.out.println(rev);
//
//
//        String abc = "      vrushabh";
//        System.out.println(abc.trim());

        // Print the unique char of the given string
//            String abc = "abcba";
//            int []a = new int[256];
//            for (char c: abc.toCharArray()){
//                a[c]++;
//            }
//            int count=0;
//            for(int i =0; i<256; i++){
//                if(a[i]>0){
//                    count++;
//                }
//            }
//            System.out.println(count);

            // Print the number of char in the last word of string

//            String s = "how are you doing and whats up and";
//            String []arr = s.split(" ");
//
//            int f = arr.length;
//            String ab = arr[f-1];
//            System.out.println(ab);
//            System.out.println(ab.length());

        // Count the repeated words in the string
//       String input = "java is great and java is popular and java is widely used";

//       String []arr = input.split(" ");
//       HashMap<String,Integer> map = new HashMap<>();
//       for(String word: arr){
//           String lowercase = word.toLowerCase();
//           map.put(lowercase, map.getOrDefault(lowercase,0)+1);
//       }
//        for (HashMap.Entry<String,Integer> entry: map.entrySet()){
//            System.out.println("Word: "+entry.getKey()+", Count: "+entry.getValue());
//        }

        // Count "is" in string
//        String s = "This is Vrushabh";
//        int count=0;
//        String[] arr = s.split(" ");
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//            if(arr[i].equalsIgnoreCase("is")){
//                count++;
//
//            }
//        }
//        System.out.println(count);

        // print pattern
//        for(int i=0; i<5;i++){
////            for (int j=0; j<i;j++){
////                if(i==2 || i==4){
////                    System.out.print("#");
////                }else{
////                    System.out.print("*");
////                }
////            }
////            System.out.println();

        // Print vowel in the string
//        String s = "vrushabh gurjar";
//        int count =0;
//        for(int i=0; i<s.length(); i++){
//            char x = s.charAt(i);
//            if(x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u'){
//                System.out.print(x);
//                count++;
//            }
//        }
//        System.out.println();
//        System.out.println("The number of vowels in string are: "+count);

        // Find upper and lower case char in string

//        String s = "Vrushabh is GooD";
//        String lower ="";
//        String upper = "";
//        for (int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch>='A' && ch<='Z'){
//                upper = upper+ch;
//            }else{
//                lower = lower+ch;
//            }
//        }
//        System.out.println(lower);
//        System.out.println(upper);

        //given an array of strings find all the strings that don't have any vowels.

//        System.out.println("Hello DJ");
//
//        String s = "vrushabh gurjar cbfhd";
//        String []arr = s.split(" ");
//        boolean vowelPresent = false;
//        for (int i = 0; i < arr.length; i++) {
//            char x = s.charAt(i);
//            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
//                vowelPresent = true;
//            }
//        }
//        if(vowelPresent) {
//            System.out.println(arr);
//        }else {
//            System.out.println("No Vowel");
//        }
        //System.out.println("The number of vowels in string are: " + count);


        //print the count of is in the string
//        String str = "This is Vrushabh";
//        int count=0;
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)=='i' && str.charAt(i+1)=='s'){
//                count++;
//            }
//        }
//        System.out.println(count);

        //Print numbers in the string
//        String s = "qwerty12345asdfg";
//        String num = "";
//        for(int i =0; i<s.length(); i++){
//            char  ch = s.charAt(i);
//            if(ch>='a' && ch<='z'){
//            }else{
//                num = num+ch;
//            }
//        }
//        System.out.println(num);

       }
}
