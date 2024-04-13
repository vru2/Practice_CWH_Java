package Code_With_harry;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
         float a= 7/4.0f * 9/2.0f;
        System.out.println(a);

        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.println(grade);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x>8);
    }

}
