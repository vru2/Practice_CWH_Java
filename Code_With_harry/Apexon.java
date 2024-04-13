package Code_With_harry;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Apexon {

    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,9,7,0};
//        int[] temparr = arr.clone();
//        int temp;
//       // System.out.println(Arrays.toString(temparr));
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                if(arr[i]>arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Array.get(arr,1));

        // Print the sum of integer number

//        int number = 456;
//        int sum = 0;
//        int digit;
//        while(number>0){
//            digit = number%10;
//            sum = sum +digit;
//            number = number/10;
//        }
//        System.out.println(sum);

//        String str = "vrushabhab gueasf eqtw wry";
//        String[] str1 = str.split(" ");
//        System.out.println("Words in string: "+str1.length);
//        str.concat("gurjar");
//        System.out.println(str);
//        char ch[] = str.toCharArray();
//        System.out.println(ch);
//        Set<Character> car= new HashSet<>();
//        for(int i=0; i<ch.length; i++){
//            System.out.println(ch[i]);
//            car.add(ch[i]);
//        }
//        System.out.print(car+" ");

        // string that dont have vowel
        String str = "vrusHabh Is a GoOd boy";
        String lower = "";
        String upper = "";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                upper = upper+str.charAt(i);
            }else{
                lower = lower + str.charAt(i);
            }
        }
        System.out.println(upper);
        System.out.println(lower);


//        int []arr ={1,2,3,4,5,6,7,8,9,12,34};
//        System.out.println(binary(arr,2));

    }
     // binary search
//    public static int binary(int []numbers, int numberToFind){
//        int low = 0;
//        int high = numbers.length-1;
//
//        while(low<=high){
//            int middlePosition = (low+high)/2;
//            int middleNumber = numbers[middlePosition];
//
//            if(numberToFind==middleNumber){
//                return middlePosition;
//            }
//            if(numberToFind<middleNumber){
//                high = middlePosition-1;
//            }
//            else{
//                low = middlePosition+1;
//            }
//        }
//        return -1;
//    }

}
