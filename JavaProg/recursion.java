package JavaProg;
import java.util.Scanner;

public class recursion {

    // factorial n = n * factorial(n-1)
    static int factorial(int n){
      if (n==0 || n==1){
          return 1;
      }
      else{
          return n * factorial(n-1);
      }

    }
    public static void main(String[] args) {
        System.out.print("Enter the value of x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("The value of factorial n is: "+ factorial(x));

    }
}
