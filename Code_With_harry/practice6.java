package Code_With_harry;

import java.util.Scanner;

public class practice6 {

    static void mult(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the table: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            int table = 1;
            table = num*i;
            System.out.println(i + " * "+ num + " = "+ table);
        }
        //return(num);
    }

    static void patter1(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //print natural number by recursive function
    static int sumrec(int n){
        if(n==1){
            return 1;
        }
        else {
            return n + sumrec(n-1);
        }
    }



    public static void main(String[] args) {
      //  mult();
      //  patter1(5);
      //  int c = sumrec(5);
      //  System.out.println(c);
      //  patter2(5);
    }

}
