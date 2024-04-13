package Code_With_harry;

import java.util.HashMap;

public class testing1 {

    //tcs 2 emp key tcs, put emp as value

    public static void main(String[] args) {

        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("Hello");
    }

}
