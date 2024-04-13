package Code_With_harry;

public class methods {
    static void tellsometing(){
        System.out.println("my name is vrushabh");
    }

    static int sum(int...arr){
        int result = 0;
        for(int e: arr){
            result += e;
        }
        return result;
    }

    //Recursive function
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    //Fibonaci series 0,1,1,2,3,5,8,13...

    static int fibonaci(int m){
        if(m==0){
            return 0;
        }else {
            return 0 + fibonaci(m-1);
        }
    }

    public static void main(String[] args) {
        tellsometing();

        // VARARGS
        System.out.println("Sum of 3 numbers "+ sum(3,4,5));
        System.out.println("Sum of 4 numbers "+ sum(3,4,5,6));

        System.out.println("The factorial of 5 is: "+ factorial(5));

        System.out.println("The fibonaci of 5 is: "+fibonaci(5));
    }

}
