package JavaProg;

public class Even_numbers {
    public static void main(String[] args) {

        // programe for even numbers till 20

        System.out.println("Printing numbers till 20 ");
        int a;
        for(a=1; a<=20; a++){
            if(a%2==0) {
                System.out.println(a);
            }
        }
        // programe for odd numbers till 20
        System.out.println("Printing odd numbers till 20 ");
        for(a=0;a<20;a++){
            if(a%2==0){
                System.out.println(a+1);
            }
        }

        // programe to print sum of five numbers
        System.out.print("Sum of five numbers: ");
        int sum = 0;
        for (a=1; a<=5;a++){
           sum = sum+a;
        }
        System.out.println(sum);

        int b=1;
        for(System.out.println("Hi"); b<=3; System.out.println("bye")){
            System.out.println("start");
            b++;
        }
    }
}
