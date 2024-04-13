package Code_With_harry;

public class try_catch_finally {
    public static void main(String[] args) {

        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("It is a finally block");
        }

        // No exception in try block
        try {
            int a = 100, b = 2, c;
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("It is a finally block");
        }
    }
}
