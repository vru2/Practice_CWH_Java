package JavaProg;

public class practice_set_5 {
    public static void main(String[] args) {
        int n=4;
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        int m=5;
        for (int a=1; a<=m; a++){
            for (int b=0; b<a; b++){
                System.out.print("@ ");
            }
            System.out.println("\n");
        }

        // problem 2, find sum of first n even natural number using while loop
        int sum=0;
        int s=5;
        for (int c=0; c<s; c++){
            sum = sum + (2*c);
        }
        System.out.println("sum of first s natural number is: "+sum);

        // write a tabe of given number
        int t=5;
        for (int d=1; d<=10;d++){
            System.out.printf("%d X %d = %d\n", t,d,t*d);
        }

    }
}
