package Code_With_harry;

public class ternary_operator {
    public static void main(String[] args) {

        //Print largest of 2 number without using if else
        int a = 10;
        int b=20;
        int result =0;
        result = a>b ? a : b;
        System.out.println(result);

        //Print number is even or odd
        int x=11;
        int result1=0;

        result1 = x%2==0? 10: 20;
        System.out.println(result1);
    }
}
