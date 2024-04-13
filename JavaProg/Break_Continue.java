package JavaProg;

public class Break_Continue {
    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("Loop is continue ");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }

        // continue
        System.out.println("Continue statment");
        for (int j=0; j<=5; j++){
            if (j==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("java is great");
        }
    }
}
