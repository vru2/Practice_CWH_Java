package JavaProg;

import java.util.Scanner;

public class Proble2 {
    public static void main(String[] args) {
        float a = 7/4f * 9/2f;
        System.out.println(a);

        // prog to encrypt a grade by adding 8 and then decrypt the grade to shown the correct grade

        // Encrypt
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypt
        grade = (char)(grade-8);
        System.out.println(grade);

        // Check if the input number is greater than 8 or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int d = sc.nextInt();
        System.out.println("If the number greater than 8, then return true else return false");
        System.out.println(d>8);

        // write the expression
        float v= 4;
        float u= 3;
        float s= 2;
        float c= 1;
        float J = (v*v - u*u)/(2*c*s);
        System.out.println(J);





    }
}
