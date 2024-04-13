package JavaProg;

import java.sql.SQLOutput;

public class Nested_for_loop {
    public static void main(String[] args) {
        int i;
        int j;

        for(i=1;i<=3;i++){
            for(j=1;j<=2;j++){
                System.out.println(i +" " +j);
            }

        }
        System.out.println("End");

        int k;
        int l;

        for(k=1; k<=5; k++){
            for(l=1; l<=5; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("pattern 2");

        int m=5;
        for (int a=1; a<=m; a++){
            for (int b=0; b<a; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}

