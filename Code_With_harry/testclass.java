package Code_With_harry;

import java.util.HashSet;

public class testclass {

    public static void main(String[] args) {

        int []arr = {2,4,3,5,6};
        int sum = 14;
        int add =0;
        for(int i =0; i<arr.length; i++) {
            add = add + arr[i];
            if(add == sum){
                System.out.println(i);
            }
//            for (int j= i+1; j<arr.length; j++) {
//                if (arr[i]+arr[j]==sum){
//                    System.out.println(i);
//                    System.out.println(j);
//                }
//                }
            }
//        [10:40] Varshini Adiga
//        Find the first non repeating character in a string.
//
//                Input: str = "abcab"
//
//        Output: c

        String name = "abcdad";
        for(int i = 0; i<name.length(); i++){

           for(int j = i+1; j<name.length(); j++){
               if(name.charAt(i)==name.charAt(j)){
               }
           }
        }
    }
}


