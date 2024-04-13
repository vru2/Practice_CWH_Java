package Code_With_harry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonepe {

    public static void main(String[] args) {

//        You are given an integer array nums consisting of 2 * n integers.
//
//                You need to divide nums into n pairs such that:
//
//        Each element belongs to exactly one pair.
//                The elements present in a pair are equal.
//                Return true if nums can be divided into n pairs, otherwise return false.
//
//        Input: nums = [3,2,3,2,2,2]
//        Output: true
//        nums: [1,2,3,4]
//        Output: false

//        1. *Length of the longest substring without repeating characters.*
//                Input: s = "abcabcbb"
//        Output: 3

        String str= "abcabcbb";
        HashSet<Character> s = new HashSet<>();
        for(int i=0; i<str.length();i++){
     //       System.out.print(str.charAt(i)+" ");
            s.add(str.charAt(i));
            System.out.print(s+" ");
        }

        System.out.println();
        int []array = {3, 2, 2, 3, 4, 4, 5, 5,6,8};
        Phonepe p = new Phonepe();
        //p.arr(array);
        System.out.println(p.arr(array));

    }

    public boolean arr(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                return false;
            }

        }
        return true;
    }

}
