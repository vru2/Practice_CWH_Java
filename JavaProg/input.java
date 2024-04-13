package JavaProg;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the user");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enterv second number:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of the two numbers is: "+sum);

    }

}
