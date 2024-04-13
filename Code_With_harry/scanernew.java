package Code_With_harry;

import java.util.Scanner;

public class scanernew {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2!=0){
            System.out.println("Weired");
        } else if (N%2==0 && N>2 &&N<5) {
            System.out.println("Not weired");
        } else if (N%2==0 && N>6 &&N<20){
            System.out.println("weired");
        }else{
            System.out.println("Not Weired");
        }

        scanner.close();
    }
}
