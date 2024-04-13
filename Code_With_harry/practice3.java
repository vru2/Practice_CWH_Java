package Code_With_harry;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        int a=10;
        if(a == 11){
            System.out.println("I am 11");
        }else{
            System.out.println("I am not 11");
        }

        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        System.out.println("Subject 1 mark: "+ sub1);
        System.out.println("Subject 2 mark: "+ sub2);
        System.out.println("Subject 3 mark: "+ sub3);

        float per = (sub1+sub2+sub3)/3;
        System.out.println("Percentage is: "+per);

        if (sub1>33 && sub2>33 && sub3>33){
            if (per>40){
                System.out.println("You are passed in the exam");
            }else{
                System.out.println("You got exact 40 per so you are pass");
            }
        }
        else{
            System.out.println("You are fail");
        }

        // slabs for income tax
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        System.out.println("Your income is: "+ income);

        if (income>250000 && income<500000){
            System.out.println("You have to pay 5% tax");
        } else if (income>500000 && income<1000000) {
            System.out.println("You have to pay 20% tax");
        } else if (income>1000000) {
            System.out.println("You have to pay 30% tax");
        }else{
            System.out.println("You dont have to pay tax ");
        }

        //switch
        System.out.println("Enter number from 1 to 7");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter the valid number");
        }
    }
}
