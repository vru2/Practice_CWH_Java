package Code_With_harry;

public class try_Catch {

   void sum(){
       int x=5;
       int y = 0;
       System.out.println(x/y);
   }
   void sub(){
       int c=10;
       int d=2;
       System.out.println(c/d);
   }

    public static void main(String[] args) {

       try_Catch tc = new try_Catch();
       try {
           tc.sum();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       tc.sub();

        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("Hello");

    }
}
