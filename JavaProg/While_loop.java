package JavaProg;

public class While_loop {
    public static void main(String[] args) {

        // Table of 3
        System.out.println("Table of 3");
        int a=1;
        int sum=1;
        while(a<=10){
            sum = 3 * a;
            System.out.println("3 X "+a +"= " +sum);
            a++;
        }
    }
}
