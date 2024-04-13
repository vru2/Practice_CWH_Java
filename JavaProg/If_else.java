package JavaProg;

public class If_else {
    public static void main(String[] args) {

        // Releation operatot like ==, <=, >=, <, >.
        int age=10;
        if (age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }
        // Logical operators &&, ||, !.
        boolean a = true;
        boolean b= false;

        if (a&&b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if (a||b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.print("Not(A) is: ");
        System.out.println(!a);
    }
}
