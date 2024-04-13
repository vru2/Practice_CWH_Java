package Code_With_harry;

import java.util.ArrayList;

public class testing {
 static int sum(int a, int b){
     int c = a+b;
     return c;
 }
// I have make static method so no need to create object
    public static void main(String[] args) {

        System.out.println(testing.sum(5,6));

        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(34);
        l2.add(54);

        l.add(5);
        l.add(51);
        l.add(15);
        l.add(52);
        l.add(25);
        l.add(45);
        l.add(65);
        l.addAll(0,l2);
        System.out.println(l);

        for(int l1:l){
            System.out.println(l1);
        }



    }

}
