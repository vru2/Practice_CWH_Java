package JavaProg;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("calculate the percentage of the student");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st subject marks outof 100: ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd subject marks outof 100: ");
        int b = sc.nextInt();

        System.out.print("Enter the 3rd subject marks outof 100: ");
        int c = sc.nextInt();

        System.out.print("Enter the 4th subject marks outof 100: ");
        int d = sc.nextInt();

        System.out.print("Enter the 5th subject marks outof 100: ");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        System.out.println("Total sum of marks is: "+sum);

        float per = sum/5f;
        System.out.print("Percentage is: "+per + "%");
    }
}
