package JavaProg;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //While loop
        int i = 1;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        // Do-While loop
        // In do while loop atleat one time we got the output then condition is checked

        int b=10;
        do{
            System.out.println(b);
            b++;
        }while (b<5);
        // here in the above prog, atleast 1 time b value get printed as 10 then condition is checked.

        // For loop
        // syntax for (initiate; condition; increment/decrement;)

        System.out.println("For loop ");
        for (int j=1; j<=10; j++){
            System.out.println(j);
        }

        // Prog to print first n odd numbers using for loop

        System.out.print("enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 0; j<=n; j++){
            System.out.println(2*j+1);
        }

        for (int a =10; a>=n; a--){
            System.out.println(a);
        }
    }
}
