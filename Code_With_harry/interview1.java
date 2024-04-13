package Code_With_harry;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class interview1 {

    public static void main(String[] args) {

//        //anagram (2 string there length and number of char are equal)
//
//        String str1 = "abcdefg";
//        String str2 ="cfedbga";
//        boolean status = false;
//
//        if(str1.length()!=str2.length()){
//            System.out.println("Not an anagram");
//            status = false;
//        }
//        else{
//            char []s1= str1.toCharArray();
//            char []s2=str2.toCharArray();
//
//            Arrays.sort(s1);
//            Arrays.sort(s2);
//
//            status = Arrays.equals(s1,s2);
//
//            if(status){
//                System.out.println("Anagram");
//            }
//            else{
//                System.out.println("not an anagram");
//            }
//        }
        int []arr ={1,2,3,4,5,6,7,8,9,12,34};
        System.out.println(binary(arr,7));

    }
    public static int binary(int []numbers, int numberToFind){

        int low =0;
        int high = numbers.length-1;

        while(low<=high){

            int middlePosition = (low+high)/2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind==middleNumber){
                return middlePosition;
            }
            if(numberToFind<middleNumber){
                high = middlePosition-1;
            }
            else{
                low= middlePosition +1;
            }
        }
        return -1;
    }

}


