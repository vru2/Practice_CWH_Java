package Code_With_harry;

public class for_loop {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        // print first 10 odd numbers
        for (int i=0; i<=10;i++){
            int num = 2*i+1;
            System.out.println("Number "+i+" "+num);
        }

        // print numbers in reverse order
        for (int i=20; i>0; i--){
            System.out.println(i);
        }
    }
}
