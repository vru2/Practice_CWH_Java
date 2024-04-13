package Code_With_harry;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int sum = 0;
        int num = sc.nextInt();
        int i = 0;
        while (i<num){
            sum = sum + 2*num;
            i++;
        }
        System.out.println("The sum of first "+num+ " even natural numbers is  "+sum);

        // Prog to write the multiplication number table
        System.out.print("Enter the number for table: ");
        int number = sc.nextInt();
        int mult = 1;
        for (int j=1; j<=10; j++){
            mult = number*j;
            System.out.println(number+" * " +j+ " = " +mult);
        }
        // print table of 10 in reverse order
        int table = 1;
        for (int k=10; k>0; k--){
            table = 10*k;
            System.out.println("10 * " +k+ " = " +table);
        }

        //factorial of given number n*(n-1)
       int m = 5;
        int x = 1;
        int factorial = 1;
        while (x<=m){
            factorial *=x;
            x++;
        }
        System.out.println(factorial);


    }
}
