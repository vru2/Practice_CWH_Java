package Code_With_harry;

public class Loops_control {

    public static void main(String[] args) {
        // While loop
        int i = 1;
        while(i<=5){
            System.out.println("Number: "+i);
            i++;
        }
        int num = 100;
        while (num<=200){
            System.out.println("Number: "+num);
            num++;
        }

        // do-while loop

        int a = 5;
        do{
            System.out.println(a);
            a++;
        }while(a<5);

        int number = 1;
        do{
            System.out.println("natural number: "+number);
            number++;
        }while(number<=50);
    }
}
