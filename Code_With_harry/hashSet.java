package Code_With_harry;

import JavaProg.While_loop;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

    public static void main(String[] args) {

        HashSet<Integer> a = new HashSet<>();
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(3);
        System.out.println(a);
        System.out.println(a.size());

        a.remove(2);
        System.out.println(a);

        System.out.println(a.contains(5));
        System.out.println(a.size());

       Iterator it = a.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        int [] arr = {1,4,6,2,8,5,2,4};
        HashSet<Integer> x = new HashSet<>();
        for (int i = 0; i<=arr.length-1;i++){
            x.add(arr[i]);
        }
        System.out.println(x);

        // Print the unique words in the array
        String[] name = {"vru","sai","ashlu","sai","akshu","vru"};
        HashSet<String> str = new HashSet<>();
        for(int i =0; i< name.length-1; i++){
            str.add(name[i]);
        }
        System.out.println(str);

    }

}
