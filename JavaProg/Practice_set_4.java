package JavaProg;
import java.util.Scanner;
public class Practice_set_4 {
    public static void main(String[] args) {
        // 1st que, what is the outpt
        int a =10;
        if (a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11 ");
        }

        // 2nd Que, Student pass or fail, total 3 subjects, 33% required to pass in each sub and total 40% required to pass exam

        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Physic out off 100");
        m1 = sc.nextByte();
        System.out.println("Enter the marks in Chemistry out off 100");
        m2 = sc.nextByte();
        System.out.println("Enter the marks in Maths out off 100");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("avg is "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are passsed");
        }
        else{
            System.out.println("You are fail");
        }

        // Que 3 find the tax slab of an employee

        int salary;
        Scanner ac = new Scanner(System.in);

        salary = ac.nextByte();
        System.out.println("employee salary is: "+ salary);

        if (salary >=2.5 && salary <5.0){
            System.out.println("tax slab is 5%");
        } else if (salary >=5.0 && salary <= 10.0) {
            System.out.println("tax slab is 20%");

        }
        else {
            System.out.println("tax slab is 30%");
        }

    }
}
