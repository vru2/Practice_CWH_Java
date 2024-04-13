package Code_With_harry;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {

//        HashMap<String,Integer> map = new HashMap<>();
//
//        map.put("India",120);
//        map.put("China",150);
//        map.put("US",30);
//
//        System.out.println(map);
//
//        if(map.containsKey("China")){
//            System.out.println("Present");
//        }else{
//            System.out.println("Not present");
//        }
//        System.out.println(map.get("India"));
//        System.out.println(map.get("Russia"));
//
//        for(Map.Entry<String,Integer> e: map.entrySet()){
//            System.out.print(e.getKey()+" ");
//            System.out.println(e.getValue());
//        }
//        map.remove("China");
//        System.out.println(map);

        // getOrDefault function in Hashmap to check the key present or not, if not present return count 0

        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple",3);
        map.put("banana",5);
        System.out.println(map);

        System.out.println("Count of apples"+ map.getOrDefault("apple",0));
        System.out.println("Count of Oranges"+ map.getOrDefault("Oranges",0));
    }
}
