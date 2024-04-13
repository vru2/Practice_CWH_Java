package Code_With_harry;

import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Can you please enter the name: ");
        String str = sc.next();
        System.out.println("Hello " + str +" have a good day");

       // int a = sc.nextInt();
        boolean b = sc.hasNextInt();
        System.out.println(b);

        System.out.println("Calculate the percentage of the student in 5 subjects");

        Float sub1 = sc.nextFloat();
        Float sub2 = sc.nextFloat();
        Float sub3 = sc.nextFloat();
        Float sub4 = sc.nextFloat();
        Float sub5 = sc.nextFloat();

        Float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        Float per = (sum/500)*100;

        System.out.println("Percentage of the student is: " +per);

    }
}
