package JavaProg;
import java.util.Scanner;

public class Practice_set_7 {

   //Problem 1: print a table using method
    static void multiplication (int n){
        for (int i =1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }
    }

    // Problem 2: Print a pattern using method
    static void pattern(int n){
        for (int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int k=n; k>0; k--){
            for (int l=0; l<k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        multiplication(x);
        System.out.println();
        pattern(x);
        System.out.println();
        pattern1(x);

    }
}
