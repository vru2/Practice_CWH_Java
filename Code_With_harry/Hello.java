package Code_With_harry;


import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 4;
        int b = 5;
        int c = 6;

        int sum = a+b+c;
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("first number: ");
        int x = sc.nextInt();
        System.out.print("second number: ");
        int y = sc.nextInt();
        int add = x+y;
        System.out.print("Sum is: "+ add);


    }

}

