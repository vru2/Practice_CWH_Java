package Code_With_harry;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.EnumControl;
import java.text.SimpleDateFormat;
import java.util.*;

public class Interview2 {



    public static void main(String[] args) {

        //prime number from 1000 to 1500
//        int temp = 0;
//        int count =0;
//        for(int i=1000; i<=1500; i++){
//            for (int j=2;j<i; j++){
//                if(i%j==0){
//                    temp = temp+1;
//                }
//            }
//            if(temp==0){
//                System.out.println(i);
//                count++;
//            }else{
//                temp =0;
//            }
//        }
//        System.out.println(count);

        // Find the count of the number
//        int [] arr = {10, 30, 10, 20, 10, 20, 30, 10};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> e: map.entrySet()){
//            System.out.println("Number: "+ e.getKey() +" Count: "+ e.getValue());
//        }

        // Find the distinct number in the arr and sum that distinct number
//        int [] arr = {10, 30, 40, 20, 10, 20, 50, 10};
//        int sum = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> e: map.entrySet()){
//         //   System.out.println("Number: "+ e.getKey() +" Count: "+ e.getValue());
//
//            if(e.getValue()>1){
//           //     System.out.println();
//            }else{
//                System.out.println(e.getKey());
//                 sum = sum +e.getKey();
//            }
//        }
//        System.out.println("Sum of distinct numbers are: "+sum);

        //anagram (2 string there length and number of char are equal)

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

        // print the unique char in the string
//        String str = "qqwffqwefdqweqweqwasfdhgj";
//        char []arr = str.toCharArray();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Character,Integer> e: map.entrySet()){
//     //       System.out.println("Char: "+e.getKey()+" count: "+e.getValue()); == to find the repitation of char in string
//            if(e.getValue()==1){
//                System.out.println(e.getKey());
//            }
//        }
//
//        Given a string paragraph and a string array of words marked, return the most frequently occurring word that is not blacklisted. The words in paragraph are case-insensitive and the answer should be returned in lowercase.
//        Input = "Ben hit a ball, the hit BALL flew far after it was hit.", blacklisted = ["hit"]
//        Output: "ball"
//        Explanation:
//        "hit" occurs 3 times, but it is a blacklisted word.
//        "ball" occurs twice (and no other word does), so it is the most frequent non-blacklisted word in the paragr

//        String str = "Ben hit a ball, the hit BALL flew far after it was hit.";
//        String lower = str.toLowerCase();
//        String rep = lower.replace(",","");
//        String newstr[]= rep.split(" ");
//        System.out.println(rep);
//
//        HashMap<String, Integer> map = new HashMap<>();
//        for (int i=0; i<newstr.length;i++){
//            map.put(newstr[i],map.getOrDefault(newstr[i],0)+1);
//        }
//        for(Map.Entry<String,Integer> e: map.entrySet()){
// //           System.out.println("String: "+e.getKey()+" count: "+e.getValue());
//            if(e.getValue()>1){
//                if(e.getKey()!="hit"){
//                    System.out.println(e.getKey());
//                }
//            }
//        }
//        // Factorial of a number
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//        int fact= 1;
//        for (int i=num; i>1;i--){
//            fact = fact*i;
//        }
//        System.out.println(fact);

        // Reverse the linkedList

//        LinkedList<Integer> l = new LinkedList<>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        System.out.println(l);
//
//        LinkedList<Integer> l1 = new LinkedList<>();
//        l.descendingIterator().forEachRemaining(l1::add);
//        System.out.println(l1);
//
        // Binary search result
//        int [] arr ={1,4,6,8,9,12,23};
//        System.out.println(binary(arr,12));

        // prog to check 2 arr contain same element

//        int arr[] = {1,2,3,4,7,5,9,8};
//        int arr1[] = {9,8,7,3,2,4,1,5,6};
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//        System.out.println("Array 1: "+Arrays.toString(arr));
//        System.out.println("Array 2: "+Arrays.toString(arr1));
//
//        if(Arrays.toString(arr).equalsIgnoreCase(Arrays.toString(arr1))){
//            System.out.println("Both arrays are equal");
//        }else{
//            System.out.println("Arrays are not equal");
//        }

        //Sum of elements in array
//        int []arr = {2,4,6,7,2,3};
//        int sum = 0;
//        for(int i=0; i<arr.length;i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        //Find secound largest number in java
//        int []arr={2,5,8,9,5,10,35,21,11};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length-2]);
//        System.out.println(Arrays.stream(arr).max());

        // Print date in specific format
//        String dateFormat = "dd-MM-YYYY";
//        SimpleDateFormat date = new SimpleDateFormat(dateFormat);
//
//        String reqdateFormat = date.format(new Date());
//        System.out.println(reqdateFormat);

       // Merge the 2 list
//        List l1 = new ArrayList();
//        l1.add("Vru");
//        l1.add("abc");
//        l1.add("xyz");
//        System.out.println(l1);
//
//        List l2 = new ArrayList();
//        l2.add(22);
//        l2.add(21);
//        l2.add(23);
//        System.out.println(l2);
//        List l3 = new ArrayList(l1);
//        l3.addAll(l2);
//        System.out.println(l3);

        // Print the character and there count in String
//        String str1 = "abcdABCDabcd";
//        String str2 = str1.toLowerCase();
//        char []arr = str2.toCharArray();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i=0; i<arr.length; i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//            System.out.println("Character: "+entry.getKey()+" Count: "+entry.getValue());
//        }

//        HashSet shortset = new HashSet();
//        for(short i=0; i<100; i++){
//            shortset.add(i);
//            shortset.remove(i-1);
//        }
//        System.out.println(shortset.size());

        // Fibonacii series
//
//        int a = 0;
//        int b= 1;
//        int c;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//        for(int i=0; i<=num; i++){
//            c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//        }

        // Reverse the number
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number to be reversed: ");
//        int num = sc.nextInt();
//        int rev = 0;
//        int rem;
//        while (num !=0){
//            rem = num%10;
//            rev = rev*10+rem;
//            num = num/10;
//        }
//        System.out.println(rev);

        // FInd duplicate char in String

//        String str = "agasdgsbwew";
//        char []arr= str.toCharArray();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
//        System.out.println();
//        System.out.print("Duplicate Character are: ");
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//           // System.out.println("Character: "+entry.getKey()+ " count: "+entry.getValue());
//            if(entry.getValue()>1){
//                System.out.print(entry.getKey()+" ");
//
//            }
//        }

        // Bubble sort

//        int arr[] ={3,60,35,2,45,320,5};
//        System.out.println("Original array: ");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//        int n = arr.length;
//        int temp =0;
//        for (int i=0; i<n; i++){
//            for(int j=1; j<(n-i); j++){
//                if(arr[j-1]>arr[j]){
//                    temp = arr[j-1];
//                    arr[j-1]= arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Sorted array");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }

        // String is palindrome or not without reversing the string

//        String str = "abcddcba";
//        StringBuilder sb = new StringBuilder(str);
//        String abc = sb.reverse().toString();
//        System.out.println(abc);
//        if(str.equalsIgnoreCase(abc)){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not palindrome");
//        }

//        String str = "abcddcba";
//        System.out.println("Original String: "+str);
//        String rev ="";
//        for(int i=str.length()-1; i>=0;i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reverse String: "+rev);
//        if(str.equalsIgnoreCase(rev)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not palindrome");
//        }

    }
//    // Binary search
//    public static int binary(int []numbers, int numberToFind){
//        int low = 0;
//        int high =numbers.length-1;
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
